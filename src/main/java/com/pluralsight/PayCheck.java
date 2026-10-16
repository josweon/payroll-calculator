package com.pluralsight;

import java.util.*;

public class PayCheck {

    public static void main(String[] args) {
        // Created a new scanner
        Scanner scanner = new Scanner(System.in);

        String employeeName = getName(scanner);
        float hours = getHours(scanner);
        float payRate = getPayRate(scanner);

        displayGrossPay(employeeName, hours, payRate);
    }

    public static String getName (Scanner scanner) {
        System.out.print("Enter you name: "); // String queryName
        String name = scanner.nextLine();
        return name;
    }

    public static float getHours (Scanner scanner) {
        System.out.print("Number of hours worked: ");
        float hours = scanner.nextFloat();
        return hours;
    }

    public static float getPayRate (Scanner scanner) {
        System.out.print("Pay rate: "); //double getPayRate
        float payRate = scanner.nextFloat();
        return payRate;
    }

    public static void displayGrossPay(String name, float hoursWorked, float payRate) {
        double grossPay = hoursWorked * payRate; //void grossPay

        if (hoursWorked > 40) {
            // Calculates gross pay after extra pay
            double overtime = hoursWorked - 40;
            double extraPay = 1.5 * overtime;
            double grossPayExtra = grossPay + extraPay;

            System.out.printf("Hey %s, your gross pay with overtime is $%.2f", name, grossPayExtra);

        } else {
            System.out.printf("Hey %s, your gross pay is $%.2f.", name, grossPay);
        }
    }
}
