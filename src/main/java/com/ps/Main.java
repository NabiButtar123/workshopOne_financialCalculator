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
        float annualRate;
        float monthlyRate;
        int numberOfMonths;

        System.out.println("Please enter the principal: ");
        principal = scanner.nextDouble();

        System.out.println("Please enter the interest rate: ");
        interest = scanner.nextFloat();

        System.out.println("Please enter the length of the loan: ");
        loanLength = scanner.nextInt();

        annualRate = interest/100;
        monthlyRate = annualRate/12;
        numberOfMonths = loanLength * 12;

        //M=P×(i*(1+i)^n / ((1+i)^n)-1)

        monthlyPayment = (principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths))/ (Math.pow(1 +monthlyRate, numberOfMonths) - 1));

        totalInterestRate = (monthlyPayment * numberOfMonths) - principal;

        System.out.printf("The Monthly payment is: $%.2f", monthlyPayment);
        System.out.printf("The Interest payment paid over  " + loanLength + " years is $%.2f", totalInterestRate);

    }
}