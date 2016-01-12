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
	public void testSearchByAuthor2() {
		String[] s={"a","b","c"};
		b.addBlog(u, "title", "content",s );
		b.addBlog(u, "title", "content",s );

		User kk=new User();
				kk.setUsername("ty");
		b.addBlog(kk, "title", "content",s );
		b.addBlog(kk, "title", "content",s );
		assertEquals(2,b.searchByAuthor("ty").size());
		assertEquals(2,b.searchByAuthor("test").size());

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
	public void testSearchByCategories2() {
		String[] s={"a","b","c"};
		String[] s1={"1","2"};
		b.addBlog(u, "title", "content",s );
		b.addBlog(u, "title", "content",s );
		b.addBlog(u, "title", "content",s );
		b.addBlog(u, "title1", "content",s1 );
		b.addBlog(u, "title1", "content",s1);
		b.addBlog(u, "title1", "content",s1 );
		assertEquals(3,b.searchByCategories(s).size());
		assertEquals(3,b.searchByCategories(s1).size());

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
	@Test
	public void testSearch2() {
		String[] s={"a","b","c"};
		String[] s1={"1","2"};

		User kk=new User();
		kk.setUsername("ty");

		b.addBlog(u, "title", "content",s );
		b.addBlog(kk, "title", "content",s );

		b.addBlog(u, "title", "content",s1 );
		b.addBlog(kk, "title", "content",s1 );
		assertEquals(1,b.search("ty",s).size());
		assertEquals(1,b.search("ty",s1).size());
		assertEquals(1,b.search("test",s).size());
		assertEquals(1,b.search("test",s1).size());
	}

}
