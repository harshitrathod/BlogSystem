package com.ishi.BlogSystem;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.sql.Timestamp;



public class TestBlog {
	Blog b;
	
	@Before
	   public void beforeClass() {
	      		b=new Blog();
	}
	@Test
	public void testTitle() {	
		String m="Harshit";
		b.setTitle(m);
	      assertEquals(m,b.getTitle());
	   }
	@Test
	public void testContent() {	
		String m="Harshit";
		b.setContent(m);
	      assertEquals(m,b.getContent());
	   }
	@Test
	public void testTime() {	
		
		Timestamp m=new Timestamp(2000,10,10,0,0,0,0);
		b.setTime(m);
		assertTrue(m.equals(b.getTime()));
	   }
	@Test
	public void testLikeWorking()
	{
		b.setLike(0);
		b.like();
		assertEquals(1,b.getLike());
	}
	@Test
	public void testAuthor()
	{
		User u=new User();
		b.setAuthor(u);
		assertEquals(u,b.getAuthor());
	}
	@Test
	public void testCategories()
	{
		String[] s={"a","b","c"};
		Categories u=new Categories(s);
		b.setCategories(u);
		assertEquals(u,b.getCategories());
	}
	@Test
	public void testComment()
	{
		CommentInventory u=new CommentInventory();
		b.setComments(u);
		assertEquals(u,b.getComments());
	}
	
}
