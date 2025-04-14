package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please follow the prompts and enter info");
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter loan term in years: ");
        int term = input.nextInt();
        System.out.println("Thank you for the info");

        double monthlyInterest = interestRate / 12 / 100;
        double annualInterest = interestRate / 12 / 100;
        System.out.printf("This is your monthly interest rate: %.4f" , monthlyInterest);

        int totalNumPayments = term * 12;
        System.out.println("\nThis is your total number of payments: " + totalNumPayments);

       double factor = Math.pow(1 + monthlyInterest, totalNumPayments);
       double monthlyPayment = principal * (monthlyInterest * factor) / (factor - 1);
       double totalInterest = (monthlyPayment * totalNumPayments) - principal;

        System.out.printf("Your monthly payment is: $%.2f" , monthlyPayment);
        System.out.printf("\nYour total interest accrued is: $%.2f" , totalInterest);


    }
}
