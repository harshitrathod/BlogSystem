package com.ishi.BlogSystem;
import java.sql.Timestamp;


public class Blog {
	public User author;
	public String title;
	public String content;
	public int like;
	public Categories categories;
	public CommentInventory comments;
	public Timestamp time;
	
	
	public void like()
	{
		this.like++;
	}
	
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
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
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public CommentInventory getComments() {
		return comments;
	}
	public void setComments(CommentInventory comments) {
		this.comments = comments;
	}
}
