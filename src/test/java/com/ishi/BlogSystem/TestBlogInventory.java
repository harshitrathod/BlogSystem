package com.ishi.BlogSystem;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestBlogInventory {
	BlogInventory b;
	User u;
	@Before
	   public void beforeClass() {
	      		b=new BlogInventory();
	      		u=new User();
	      		u.setUsername("test");
	}
	@Test
	public void testAddBlog() {
		String[] s={"a","b","c"};
		b.addBlog(u, "title", "content",s );
		assertNotNull(b.getBlogs());
	}
	
	@Test
	public void testGetBlogs() {
		String[] s={"a","b","c"};
		b.addBlog(u, "title", "content",s );
		assertNotNull(b.getBlogs());
	}

	@Test
	public void testSearchByAuthor() {
		String[] s={"a","b","c"};
		b.addBlog(u, "title", "content",s );
		assertTrue(b.searchByAuthor("test").get(0).getAuthor().equals(u));
	
	}

	@Test
	public void testSearchByCategories() {
		String[] s={"a","b","c"};
		b.addBlog(u, "title", "content",s );
		List<String>ct=b.searchByCategories(s).get(0).getCategories().getCategories();
		for(String z:s)
			assertTrue(ct.contains(z));
	}

	@Test
	public void testSearch() {
		String[] s={"a","b","c"};
		b.addBlog(u, "title", "content",s );
		assertTrue(b.search(u.getUsername(),s).get(0).getAuthor().equals(u));
		List<String>ct=b.search(u.getUsername(),s).get(0).getCategories().getCategories();
		for(String z:s)
			assertTrue(ct.contains(z));

	}

}
