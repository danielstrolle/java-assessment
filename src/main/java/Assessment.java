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

//    static ArrayList capitalizeRecords (ArrayList list) {
//        for (Object person: list){
//        }
//    }

    public static void main(String[] args) {
        System.out.println(square(4));
        System.out.println(sum(3.5,4.1));
        int[] test = new int[]{1,1,10};
        test.toString();
        System.out.println(average(test));
    }
}
