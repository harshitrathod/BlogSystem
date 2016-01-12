package com.ishi.BlogSystem;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.junit.Before;
import org.junit.Test;


public class TestComment {
Comment b;
	
	@Before
	   public void beforeClass() {
	      		b=new Comment();
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


}
