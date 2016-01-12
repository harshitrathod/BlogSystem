package com.ishi.BlogSystem;
import java.util.ArrayList;
import java.util.List;


public class UserInventory {
    public List<User> users;
    public UserInventory()
    {
        users=new ArrayList<User>();
    }
    public void addUser(String uname,String pass,String email)
    {
        if(this.searchUser(uname)!=null)
        {
            System.out.println("User Already Exists!!\n");
        }
        else
        {
            User u1=new User();
            u1.setEmail(email);
            u1.setPassword(pass);
            u1.setUsername(uname);
            users.add(u1);
            //System.out.println("User added!!");
        }
    }
    public List<User> getUsers()
    {
        return users;
    }

    public User searchUser(String uname)
    {


        for (User temp : users) {
            if(uname.equals(temp.getUsername()))
            {
                return temp;
            }
        }
        return null;
    }

    public User authenticate(String uname,String pass)
    {
        User a=this.searchUser(uname);
        if(a==null)
        {
            System.out.println("User Not Found");
            return null;
        }
        else
        {
            if(!a.getPassword().equals(pass))
            {
                System.out.println("Pasword Not Matches");
                return null;
            }
            else
            {	System.out.println("User Found");
                return a;
            }
        }
    }

}