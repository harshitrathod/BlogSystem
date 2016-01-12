package com.ishi.BlogSystem;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestUserInventory {

	UserInventory u;
	User u1;
	@Before
	   public void beforeClass() {
	      		u=new UserInventory();
	      		u1=new User();
	      		u1.setUsername("test");
	}

	String s="test",p="test",e="test";
	@Test
	public void testAddUser() {
	
		u.addUser(s, p, e);
		assertNotNull(u.getUsers());
		assertTrue(u.getUsers().get(0).getUsername().equals(s));
	}
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	@Test
	public void testSameAddUser() {
	
		u.addUser(s, p, e);
		u.addUser(s, p, e);
		String k="User Already Exists!!\n";
		assertEquals(k.charAt(0), outContent.toString().charAt(0));
	}

	@Test
	public void testGetUsers() {
		u.addUser(s, p, e);
		assertNotNull(u.getUsers());
		assertTrue(u.getUsers().get(0).getUsername().equals(s));
	}

	@Test
	public void testSearchUser() {
		u.addUser(s, p, e);
		assertEquals(p,u.searchUser(s).getPassword());
	}

	@Test
	public void testAuthenticateSucess() {
		u.addUser(s, p, e);
		User a=new User();
		a.setEmail(s);
		a.setPassword(s);
		a.setUsername(s);
		assertTrue(u.authenticate(s,p).equal(a));
		
	}
	@Test
	public void testAuthenticateFail() {
		u.addUser(s, p, e);
		User a=new User();
		assertNull(u.authenticate(s+p,p+s));
		
	}

}
