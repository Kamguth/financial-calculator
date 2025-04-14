package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please follow the prompts and enter info");
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter interest rate: ");
        double intrestRate = input.nextDouble();
        System.out.print("Enter loan term in years: ");
        int term = input.nextInt();
        System.out.println("Thank you for the info");

        double monthlyInterest = intrestRate / 12 / 100;
        System.out.println("This is your monthly interest rate: " + monthlyInterest);

        int totalNumPayments = term * 12;
        System.out.println("This is your total number of payments: "+ totalNumPayments);

       double factor = Math.pow(1 + monthlyInterest, totalNumPayments);
       double monthlyPayment = principal * (monthlyInterest * factor) / (factor - 1);

        System.out.printf("Your monthly payment is $%.2f" , monthlyPayment);

       // double factor = Math.pow(1 + monthlyInterest, totalNumPayments);
        //double result = monthlyInterest * Math.pow(1 + monthlyInterest, totalNumPayments);
       // System.out.printf("Your monthly payment is: $%.2f/n", result);
    }
}
