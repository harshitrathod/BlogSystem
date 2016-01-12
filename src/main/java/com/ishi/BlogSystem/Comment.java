package com.ishi.BlogSystem;
import java.sql.Timestamp;


public class Comment {
	public String content;
	public User author;
	public int like;
	public Timestamp time;
	
	
	public void like()
	{
		this.like++;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	

}
