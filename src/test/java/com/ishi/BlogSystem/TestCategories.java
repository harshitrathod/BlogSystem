package com.ishi.BlogSystem;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class TestCategories {

	Categories c;
	String[] s={"1","2"};
	@Before
	public void set()
	{
		c=new Categories(s);
	}
	@Test
	public void testCategories() {

	
	List<String> i=c.getCategories();
	for (String j:s)
	{
		assertTrue(i.contains(j));
	}
	}
	
	
	@Test
	public void testSatisfiesTrue()
	{
		assertTrue(c.satisfies(s));
	}
	@Test
	public void testSatisfiesFalse()
	{
		String[] q={"3","1"};
		assertFalse(c.satisfies(q));
	}
	@Test
	public void testSatisfiesFalse2()
	{
		String[] q={"3","1","2"};
		assertFalse(c.satisfies(q));
	}
	@Test
	public void testSatisfiesTrue2()
	{
		String[] q={"1"};
		assertTrue(c.satisfies(q));
	}

}
