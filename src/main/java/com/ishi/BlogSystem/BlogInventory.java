package com.ishi.BlogSystem;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class BlogInventory {
public List<Blog> blogs;
public BlogInventory()
{
	blogs=new ArrayList<Blog>();
}
public void addBlog(User user,String title,String content,String[] categories)
{
	Blog b=new Blog();
	b.setAuthor(user);
	b.setContent(content);
	b.setTitle(title);
	b.setLike(0);
	b.setComments(new CommentInventory());
	java.util.Date date= new java.util.Date();
	b.setTime(new Timestamp(date.getTime()));
	b.setCategories(new Categories(categories));
	blogs.add(b);
}

public List<Blog> getBlogs() {
	return blogs;
}

public List<Blog> searchByAuthor(String uname)
{
	List<Blog> a=new ArrayList<Blog>();
	for (Blog b : blogs)
	{
		if(b.getAuthor().getUsername().equals(uname))
			a.add(b);
			
	}
	return a;
}

public List<Blog> searchByCategories(String[] ct)
{
	List<Blog> a=new ArrayList<Blog>();
	for (Blog b : blogs)
	{
		if(b.getCategories().satisfies(ct))
			a.add(b);
			
	}
	return a;
}

public List<Blog> search(String uname,String[] ct)
{
	List<Blog> s=this.searchByAuthor(uname);
	List<Blog> a=new ArrayList<Blog>();
	for (Blog b : s)
	{
		if(b.getCategories().satisfies(ct))
			a.add(b);
			
	}
	return a;
}



}
