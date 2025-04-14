package com.pluralsight;
import java.util.Scanner;

public class AnnuityValueCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Hello, please enter all info when prompted");

        System.out.print("Enter expected payout: ");
        double payout = input.nextDouble();
        System.out.print("Enter expected interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter expected years until payout:" );
        int yearsUntilPayout = input.nextInt();

        double monthlyRate = interestRate / 100 / 12;
        int totalPayments = yearsUntilPayout * 12;

        double currentValue = payout * ((1 - Math.pow(1 + monthlyRate, -totalPayments)) / monthlyRate);


        System.out.printf("Current value of annuity: $%.2f", currentValue);

    }
}
