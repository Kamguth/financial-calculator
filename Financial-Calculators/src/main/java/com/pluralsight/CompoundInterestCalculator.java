package com.pluralsight;
import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Hello, please enter info when prompted to calculate the future \nvalue of your one time investment");

        System.out.print("Enter deposit amount: ");
        double deposit = input.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        System.out.println("Thank you, below is your calculations.");

        double r = interestRate / 100;
        double futureValue = deposit * Math.pow(1 + r, years);
        double totalInterestEarned = futureValue - deposit;

        System.out.printf("Future Value: $%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f\n", totalInterestEarned);





    }
}
