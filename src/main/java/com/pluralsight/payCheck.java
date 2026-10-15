package com.pluralsight;

import java.util.*;

public class payCheck {

    public static void main(String[] args) {
        // Created a new scanner
        Scanner scanner = new Scanner(System.in);

        // Queries and stores employees new name
        System.out.print("Enter you name: ");
        String name = scanner.nextLine();

        // Queries and stores number of hours worked
        System.out.print("Number of hours worked: ");
        float hours = scanner.nextFloat();

        // Queries and stores pay rate
        System.out.print("Pay rate: ");
        float payRate = scanner.nextFloat();

        // Calculates the gross pay for employee
        double grossPay = hours * payRate;

        if (hours > 40) {
            // Calculates gross pay after extra pay
            float overtime = hours - 40;
            double extraPay = 1.5 * overtime;
            double grossPayExtra = grossPay + extraPay;

            System.out.printf("Hey %s, your gross pay after overtime is $%.2f", name, grossPayExtra);

        } else {

            System.out.printf("Hey %s, your gross pay is $%.2f.", name, grossPay);
        }
    }
}
