package com.ishi.BlogSystem;
public class User {
	public String username;
	public String password;
	public String email;
	
	public void setUsername(String uname)
	{
		this.username=uname;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	
	public String getUsername()
	{
		return this.username;
	}
	public String getPassword()
	{
		return this.password;
	}
	public String getEmail()
	{
		return this.email;
	}
	public boolean equal(User a)
	{
		if(this.getEmail().equals(a.getEmail()) && this.getUsername().equals(a.getUsername()))
			return true;
		return false;
	}
	
}
