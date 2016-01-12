package com.ishi.BlogSystem;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class CommentInventory {
	public List<Comment> comments;
	public CommentInventory()
	{
		comments=new ArrayList<Comment>();
	}
	public void addComment(User u,String content)
	{
		Comment c=new Comment();
		c.setAuthor(u);
		c.setContent(content);
		c.setLike(0);
		java.util.Date date= new java.util.Date();
        c.setTime(new Timestamp(date.getTime()));
        comments.add(c);
        System.out.println("Comment addede!!");
		
	}
	public List<Comment> getComments() {
		return comments;
	}
	public List<Comment> search(User author)
	{
		List<Comment> a=new ArrayList<Comment>();
		for(Comment c : comments)
		{
			if(c.getAuthor().equal(author))
				a.add(c);
		}
		return a;
	}
	

}
