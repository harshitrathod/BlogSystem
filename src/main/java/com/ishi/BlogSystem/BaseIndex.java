package com.ishi.BlogSystem;
import java.util.List;
import java.util.Scanner;


public class BaseIndex {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        UserInventory ui=new UserInventory();
        ui.addUser("Harshit", "Harshit", "Harshit");
        ui.addUser("Harshit1", "Harshit1", "Harshit");
        ui.addUser("Harshit2", "Harshit2", "Harshit");
        ui.addUser("Harshit3", "Harshit3", "Harshit");
        ui.addUser("Harshit4", "Harshit4", "Harshit");
        ui.addUser("Harshit5", "Harshit5", "Harshit");
        ui.addUser("Harshit6", "Harshit6", "Harshit");
        System.out.print("Enter Username:");
        String uname=in.nextLine();
        System.out.print("Enter Password:");
        String pass=in.nextLine();

        System.out.println("Authenticating User");

        User a=ui.authenticate(uname, pass);
        BlogInventory bi=new BlogInventory();
        String[] s={"Tech","Science"};
        bi.addBlog(a, "Hello World!!","This is Demo Blog for test purpose",s);
        bi.addBlog(a, "Hello World!!","This is Demo Blog for test purpose1",s);
        bi.addBlog(a, "Hello World!!","This is Demo Blog for test purpose2",s);
        bi.addBlog(a, "Hello World!!","This is Demo Blog for test purpose3",s);
        String[] s1={"h","k"};
        bi.addBlog(a, "Hello World!!","This is Demo Blog for test purpose32222222",s1);
        String[] s2={"h","z"};

        System.out.println("Searching blog where Author=harshit and categories={h,k}");

        List<Blog> q=bi.search("Harshit",s1);

        if(!q.isEmpty())
        {
            for(Blog z : q)
            {
                System.out.println(z.getTime());
            }
        }

        else
        {
            System.out.println("Not found");
        }










        in.close();
    }

}