package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	//ATTRIBUTES
	private Date moment;
	private OrderStatus status;
	
	//ASSOCIATIONS
	private Client clients;
	private List<OrderItem> orderItem = new ArrayList<>();
	
	//CONSTRUCTOR
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status, Client clients) {
		this.moment = moment;
		this.status = status;
		this.clients = clients;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClients() {
		return clients;
	}

	public void setClients(Client clients) {
		this.clients = clients;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public double total() {
		double total = 0;
		
		for(OrderItem i : orderItem)
		{
			total += i.subTotal();
		}
		
		return total;
	}
	
	//TOSTRING
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + sdf.format(moment));
		sb.append("\nOrder status: " + status);
		sb.append(clients);
		sb.append("\nOrder items:\n");
		for(OrderItem i : orderItem) {
			sb.append(i + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		
		return sb.toString();
	}
}
