package com.ishi.BlogSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TestUser {

	User u;
	@Before
	public void set()
	{
		u=new User();
	}
	
	@Test
	public void testUsername() {
	String s="test";
	u.setUsername(s);
	assertEquals(s,u.getUsername());
	}

	@Test
	public void testGetPassword() {
		String s="test";
		u.setPassword(s);
		assertEquals(s,u.getPassword());
		
	}

	@Test
	public void testGetEmail() {
		String s="test";
		u.setEmail(s);
		assertEquals(s,u.getEmail());
		
	}

	@Test
	public void testEqual() {
		User t=new User();
		String s="test";
		u.setEmail(s);
		u.setUsername(s);
		t.setUsername(s);
		t.setEmail(s);
		assertTrue(u.equal(t));
	}
	@Test
	public void testEqual2() {
		User t=new User();
		String s="test";
		u.setEmail(s);
		u.setUsername(s);
		t.setUsername("asa");
		t.setEmail(s);
		assertFalse(u.equal(t));
		t.setEmail("asa");
		assertFalse(u.equal(t));
	}

}
