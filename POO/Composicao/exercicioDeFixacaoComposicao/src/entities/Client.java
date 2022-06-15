package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//attributes
	private String name;
	private String email;
	private Date birthDate;
	
	//constructor
	public Client() {
		
	}
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	//METHODS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	//TOSTRING
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nClient: " + name + " (");
		sb.append(sdf.format(birthDate) + ") - ");
		sb.append(email);
		return sb.toString();
	}
}
