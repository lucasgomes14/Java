package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	//attributes
	private Date moment;
	private String title;
	private String content;
	private int likes;
	
	//Associations
	private List<Comment> comments = new ArrayList<>();

	//constructor
	public Post(){
		
	}
	
	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return comments;
	}	
	
	public void addComment(Comment comment)
	{
		comments.add(comment);
	}
	
	public void removeComment(Comment comment)
	{
		comments.remove(comments);
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - " + sdf.format(moment) + "\n");
		sb.append(content + "\nComments:\n");
		for(Comment i: comments)
		{
			sb.append(i.getText());
			sb.append("\n");
		}
		
		sb.append("\n");
		
		return sb.toString();
	}
}
