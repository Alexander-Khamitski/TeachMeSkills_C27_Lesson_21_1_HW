package com.teachmeskills.lesson21.hw.task1;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                "The difference between dates is (in days): " +
                JodaDateTime.getDifferenceBetweenDates(2024, 4, 14, 2024, 7, 14));
    }
}