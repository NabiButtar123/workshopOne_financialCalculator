package com.ps;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loanLength;
        float interest;
        double principal;
        double totalInterestRate;
        double monthlyPayment;

        System.out.println("Please enter the principal: ");
        principal = scanner.nextDouble();

        System.out.println("Please enter the interest rate: ");
        interest = scanner.nextFloat();

        System.out.println("Please enter the length of the loan: ");
        loanLength = scanner.nextInt();

    }
}