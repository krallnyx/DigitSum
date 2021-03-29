package com.Krall;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(999));
    }

    private static int sumDigits(int number) {
        if (number >= 10) {
            int total = 0;
            // once we have only 1 digit, dividing it by 10 will give us 0
            while (number >= 1) {
                // isolating the last digit which is the remainder of dividing by 10
                total += number % 10;
                // removing the digit we've isolated from the loop
                number /= 10;
            }
            return total;
        } else {
            return -1;
        }
    }
}
