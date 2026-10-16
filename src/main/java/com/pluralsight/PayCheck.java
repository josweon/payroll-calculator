package com.pluralsight;

import java.util.*;

public class PayCheck {

    public static void main(String[] args) {
        // Created a new scanner
        Scanner scanner = new Scanner(System.in);

        // Queries and stores employees new name
        System.out.print("Enter you name: "); // String queryName
        String name = scanner.nextLine();

        // Queries and stores number of hours worked
        System.out.print("Number of hours worked: "); // double queryHours
        float hours = scanner.nextFloat();

        // Queries and stores pay rate
        System.out.print("Pay rate: "); //double getPayRate
        float payRate = scanner.nextFloat();

        // Calculates the gross pay for employee
        double grossPay = hours * payRate; //void grossPay

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

    public static String getName (Scanner scanner) {
        System.out.print("Enter you name: "); // String queryName
        String name = scanner.nextLine();
        return name;
    }

    public static double getHours (Scanner scanner) {
        System.out.print("Number of hours worked: "); // double queryHours
        float hours = scanner.nextFloat();
        return hours;
    }

    public static double getPayRate (Scanner scanner) {
        System.out.print("Pay rate: "); //double getPayRate
        float payRate = scanner.nextFloat();
        return payRate;
    }
}
