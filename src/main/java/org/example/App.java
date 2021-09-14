package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    private static Scanner scanner = new Scanner(System.in);
    private static DecimalFormat df = new DecimalFormat("#.00");
    public static void main(String[] args) {
        System.out.println("Enter the price of item 1:");
        double item1 = checkDouble(scanner.nextLine());
        System.out.println("Enter the quantity of item 1:");
        int quantity1 = checkInt(scanner.nextLine());
        System.out.println("Enter the price of item 2:");
        double item2 = checkDouble(scanner.nextLine());
        System.out.println("Enter the quantity of item 2:");
        int quantity2 = checkInt(scanner.nextLine());
        System.out.println("Enter the price of item 3:");
        double item3 = checkDouble(scanner.nextLine());
        System.out.println("Enter the quantity of item 3:");
        int quantity3 = checkInt(scanner.nextLine());

        double subtotal = (item1 * quantity1) + (item2 * quantity2) + (item3 * quantity3);
        double tax = subtotal * 0.055;
        double total = tax + subtotal;
        System.out.println("Subtotal: $" + df.format(subtotal) + "\nTax: $" + df.format(tax) +
                "\nTotal: $" + df.format(total));

    }

    private static boolean isInt(String input) {
        boolean isNum = true;
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }

    private static boolean isDouble(String input) {
        boolean isNum = true;
        try {
            Double.parseDouble(input);
        }
        catch(NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }

    public static int checkInt(String inputStr) {
        String inputToCheck = inputStr;
        int input = 0;
        boolean completed = false;
        while(!completed) {
            if (isInt(inputToCheck)) {
                input = Integer.parseInt(inputToCheck);
                completed = true;
            }
            else {
                System.out.println("Error! Please enter numbers values only: \n");
                inputToCheck = scanner.nextLine();
            }
        }
        return input;
    }


    public static double checkDouble(String inputStr) {
        String inputToCheck = inputStr;
        double input = 0;
        boolean completed = false;
        while(!completed) {
            if (isDouble(inputToCheck)) {
                input = Double.parseDouble(inputToCheck);
                completed = true;
            }
            else {
                System.out.println("Error! Please enter numbers values only: \n");
                inputToCheck = scanner.nextLine();
            }
        }
        return input;
    }

}
