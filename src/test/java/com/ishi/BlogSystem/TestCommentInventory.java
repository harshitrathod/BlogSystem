package com.ishi.BlogSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCommentInventory {

	CommentInventory ci;
	Comment c;
	User u;
	@Before
	   public void beforeClass() {
	      		ci=new CommentInventory();
	      		c=new Comment();
	      		u=new User();
	      		u.setUsername("test");
	      		u.setEmail("test");
	}
	@Test
	public void testAddComment()
	{
		
		String s="test";
		ci.addComment(u,s);
		assertNotNull(ci.getComments());
	}
	@Test
	public void testSearch()
	
	{
		String s="test";
		ci.addComment(u,s);
		assertNotNull(ci.search(u));
		
	}
}
