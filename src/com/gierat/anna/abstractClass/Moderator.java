package com.gierat.anna.abstractClass;

import java.util.ArrayList;
import java.util.List;

public class Moderator extends User{

    public Moderator(String userName) {
        super(userName);
    }


    public static void main(String[] args) {

        Moderator moderator = new Moderator("Jakub");
        Moderator moderator2 = new Moderator("Marian");

        RegularUser regularUser = new RegularUser("Java");
        RegularUser regularUser2 = new RegularUser("C#");


        List<User> users = new ArrayList();
        users.add(moderator);
        users.add(regularUser);

        for (User user : users) {
            System.out.println(users);
        }

//        User u = new User("Anna");
    }

}
