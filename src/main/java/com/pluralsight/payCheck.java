package com.pluralsight;

import java.util.*;

public class payCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();

        System.out.print("Number of hours worked: ");
        float hours = scanner.nextFloat();

        System.out.print("Pay rate: ");
        float payRate = scanner.nextFloat();

        double gross = hours * payRate;
        System.out.printf("Hey %s, your gross pay is $%.2f.", name, gross);
    }
}
