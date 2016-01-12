package com.ishi.BlogSystem;
import java.util.ArrayList;
import java.util.List;


public class Categories {

	public List<String> categories;
	public Categories(String[] ct)
	{
		this.setCategories(ct);
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(String[] ct) {
		categories=new ArrayList<String>();
		for (String s:ct)
		{
			categories.add(s);
		}
	}
	public boolean satisfies(String[] ct)
	{
		
		for(String s:ct)
		{
			if(!categories.contains(s))
				return false;
		}
		return true;
		
	}
	
}
