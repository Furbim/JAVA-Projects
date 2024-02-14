package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class posts {
	
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	List<Comments> comments = new ArrayList<>();

	public posts(LocalDateTime localDateTime, String title, String content, Integer likes) {
		
		this.moment = localDateTime;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public posts() {
		
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
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

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comments> getComments() {
		return comments;
	}
	
	public void addComments(Comments comment) {
		comments.add(comment);
	}
	public void removeComments(Comments comment) {
		comments.remove(comment);
	}

	
	public  String toString() {
		return "Title: " + title + ""
			+ "Likes: " + likes + "-" + moment +""
			+ "Content: " + content + ""
			+ "Comments: " + comments;
	}
	
	

}
