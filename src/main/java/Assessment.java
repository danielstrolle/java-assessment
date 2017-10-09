package main.java;

import java.util.ArrayList;

public class Assessment {

    static int square(int number) {
        int squared = number * number;
        return squared;
    }

    static int sum (int number1, int number2) {
        int total = number1 + number2;
        return total;
    }

    static double sum (double number1, double number2) {
        double total = number1 + number2;
        return total;
    }

    static double average (int[] numbers) {
        int numSize = numbers.length;
        int total = 0;
        for (int number: numbers) {
            total += number;
        } double avg = total / numSize;
        return avg;
    }

    static ArrayList<User> capitalizeRecords (ArrayList<User> list) {
        ArrayList<User> listCopy = new ArrayList<>();
        for (User person : list) {
            listCopy.add(new User(person.getFirstName(), person.getLastName(), person.isAdmin));
        }
        for (User person : listCopy) {
            String first = person.getFirstName();
            String firstLetter = first.substring(0, 1);
            String restOfName = first.substring(1);
            if (firstLetter.equals(firstLetter.toLowerCase())) {
                String capt = firstLetter.toUpperCase() + restOfName.toLowerCase();
                person.setFirstName(capt);
            }

            String last = person.getLastName();
            String firstLetter2 = last.substring(0, 1);
            String restOfName2 = last.substring(1);
            if (firstLetter2.equals(firstLetter2.toLowerCase())) {
                String capt = firstLetter2.toUpperCase() + restOfName2.toLowerCase();
                person.setLastName(capt);
            }

        }
        return listCopy;
    }

    public static void main(String[] args) {
        System.out.println(square(4));
        System.out.println(sum(3.5,4.1));
        int[] test = new int[]{1,1,10};
        test.toString();
        System.out.println(average(test));
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User("Rick", "Slick", false);
        User user2 = new User("brandon", "gossen", true);
        list.add(user1);
        list.add(user2);
        ArrayList<User> copy = capitalizeRecords(list);
        for (User user: copy) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + "User is admin:" + user.isAdmin());
        }
    }
}
