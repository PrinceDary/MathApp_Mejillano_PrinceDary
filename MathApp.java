/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathapp;

import java.util.Scanner;

/**
 *
 * @author Prince Dary
 */
public class MathApp {
public static void main(String[] args) {
        Scanner MSCANNER = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Math App Menu ===");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers (stored in an array)");
            System.out.println("12. Maximum of N numbers (stored in an array)");
            System.out.println("0. Exit");

            choice = readInt(MSCANNER, "Enter your choice: ");

             if (choice <0 || choice >12) 
                    System.out.println("Invalid choice. Please pick a number from 0 to 12.");
             
            switch (choice) {
                case 1: {
                    System.out.println("Welcome to Addition of two numbers Calculator!");
                    double x = readDouble(MSCANNER, "Enter first number: ");
                    double y = readDouble(MSCANNER, "Enter second number: ");                    
                    System.out.println("Result: " + x + " + " + y + " = " + (x + y));
                    break;
                }
                case 2: {
                    System.out.println("Welcome to Subtraction of two numbers Calculator!");
                    double x = readDouble(MSCANNER, "Enter first number: ");
                    double y = readDouble(MSCANNER, "Enter second number: ");
                    System.out.println("Result: " + x + " - " + y + " = " + (x - y));
                    break;
                }
                case 3: {
                    System.out.println("Welcome to Multiplication of two numbers Calculator!");
                    double x = readDouble(MSCANNER, "Enter first number: ");
                    double y = readDouble(MSCANNER, "Enter second number: ");
                    System.out.println("Result: " + x + " * " + y + " = " + (x * y));
                    break;
                }
                case 4: {
                    System.out.println("Welcome to Division of two numbers Calculator!");
                    double x = readDouble(MSCANNER, "Enter first number: ");
                    double y = readDouble(MSCANNER, "Enter second number (cannot be 0): ");
                    if (y == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + x + " / " + y + " = " + (x / y));
                    }
                    break;
                }
                case 5: {
                    System.out.println("Welcome to Factorial of a Number Calculator!");
                    int n = readInt(MSCANNER, "Enter a whole number: ");
                    if (n < 0) {
                        System.out.println("Error: Factorial of a negative number does not exist.");
                    } else {
                        long factorial = 1; 
                        for (int i = 1; i <= n; i++) {
                            factorial *= i; 
                        }
                        System.out.println ("Factorial of " + n + " is = " + factorial);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Welcome to Power Calculator!");
                    double x = readDouble(MSCANNER, "Enter base (x): ");
                    double y = readDouble(MSCANNER, "Enter exponent (y): ");
                    System.out.println("Result: " + x + " raised to " + y + " = " + Math.pow(x, y));
                    break;
                }
                case 7: {
                    System.out.println("Welcome to the Sum of Numbers Calculator!");
                    int n = readInt(MSCANNER, "Enter N: ");
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += i; 
                    }
                    System.out.println("The Sum from 1 to " + n + " is: " + sum);
                    break;
                }
                case 8: {
                    System.out.println("Welcome to Prime Number checker!");
                    int n = readInt(MSCANNER, "Enter a whole number: ");
                    boolean Prime = true;
                    if (n < 2) {
                        Prime = false;
                    } else {
                        for (int i = 2; i <= n / 2; i++) {
                            if (n % i == 0) {
                                Prime = false;
                                break;
                            }
                        }
                    }
                    if (Prime) {
                        System.out.println(n + " is a prime number.");
                    } else {
                        System.out.println(n + " is NOT a prime number.");
                    }
                    break;
                }
                case 9: {
                    System.out.println("Welcome to the Greatest Common Divisor Calculator!");
                    int a = readInt(MSCANNER, "Enter first number: ");
                    int b = readInt(MSCANNER, "Enter second number: ");
                    int x = a;
                    int y = b;
                    while (y != 0) {
                        int c9 = y;
                        y = x % y;
                        x = c9;
                                
                    }
                    System.out.println("The GCD of " + a + " and " + b + " is: " + Math.abs(x));
                    break;
                }
                case 10: {
                    System.out.println("Welcome to the Absolute Value Calculator!");
                    double x = readDouble(MSCANNER, "Enter a number: ");
                    double avx = Math.abs(x);
                    System.out.println("Absolute value: " + avx);
                    break;
                }
                case 11: {
                    System.out.println("Welcome to the Average of N Numbers!");
                    int n = readInt(MSCANNER, "How many numbers? ");
                    double[] num = new double[n];
                    double total = 0;
                    for (int i = 0; i < n; i++) {
                        num[i] = readDouble(MSCANNER, "Enter number " + (i + 1) + ": ");
                        total += num[i];
                    }
                    double average = total / n;
                    System.out.println("Average: " + average);
                    break;
                }
                case 12: {
                    System.out.println("Welcome to the Maximum of N Numbers!");
                    int n = readInt(MSCANNER, "How many numbers? ");
                    double[] numbers = new double[n];
                    for (int i = 0; i < n; i++) {
                        numbers[i] = readDouble(MSCANNER, "Enter number " + (i + 1) + ": ");
                    }
                    double max = numbers[0];
                    for (int i = 1; i < n; i++) {
                        if (numbers[i] > max) {
                            max = numbers[i];
                        }
                    }
                    System.out.println("Maximum value: " + max);
                    break;
                }
                case 0: {
                    System.out.println("Thank you for using Math App!");
                    break;
                }
                
            }

        } while (choice != 0);

        MSCANNER.close();
    }


    static int readInt(Scanner MSCANNER, String prompt) {
        System.out.print(prompt);
        while (!MSCANNER.hasNextInt()) {
            System.out.println("That is not a valid number. Please try again.");
            MSCANNER.next(); 
            System.out.print(prompt);
        }
        return MSCANNER.nextInt();
    }

    // Same idea, but for decimal numbers.
    static double readDouble(Scanner MSCANNER, String prompt) {
        System.out.print(prompt);
        while (!MSCANNER.hasNextDouble()) {
            System.out.println("That is not a valid number. Please try again.");
            MSCANNER.next(); // throw away the bad input (e.g. letters)
            System.out.print(prompt);
        }
        return MSCANNER.nextDouble();
    }

}