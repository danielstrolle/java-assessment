package main.java;

import java.util.ArrayList;

public class User extends Person {
    protected boolean isAdmin;
    ArrayList<String> list;

    public User (String firstName, String lastName, boolean isAdmin) {
        super(firstName, lastName);
        this.isAdmin = isAdmin;
//        this.list.add(firstName + lastName);
    }

    boolean isAdmin() {
        if (isAdmin) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        User user = new User("Daniel", "Strolle", true);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.isAdmin());
    }
}
