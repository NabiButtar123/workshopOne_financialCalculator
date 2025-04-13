package com.ps;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your personal Financial Calculator");
        System.out.println("Select one of the options below");
        System.out.println("Please enter 1 for a Mortgage Calculator");
        System.out.println("Please enter 2 for a FutureValue CD Calculator");
        System.out.println("Please enter 3 to quit using the Calculator");
        System.out.print("Please enter your choice: ");


        int input = scanner.nextInt();
        while(input != 3) {
            switch (input) {
                case 1:
                    int loanLength;
                    float interest;
                    double principal;
                    double totalInterestRate;
                    double monthlyPayment;
                    float annualRate;
                    float monthlyRate;
                    int numberOfMonths;

                    System.out.print("Please enter the principal: ");
                    principal = scanner.nextDouble();

                    System.out.print("Please enter the interest rate: ");
                    interest = scanner.nextFloat();

                    System.out.print("Please enter the length of the loan: ");
                    loanLength = scanner.nextInt();

                    annualRate = interest / 100;
                    monthlyRate = annualRate / 12;
                    numberOfMonths = loanLength * 12;

                    //M=P×(i*(1+i)^n / ((1+i)^n)-1)

                    monthlyPayment = (principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) / (Math.pow(1 + monthlyRate, numberOfMonths) - 1));

                    totalInterestRate = (monthlyPayment * numberOfMonths) - principal;

                    System.out.printf("The Monthly payment is: $%.2f", monthlyPayment);
                    System.out.println();
                    System.out.printf("The Interest payment paid over " + loanLength + " years is $%.2f", totalInterestRate);

                    break;
                case 2:
                    double deposit;
                    float cdInterestRate;
                    int years;
                    double cdAnnualRate;
                    double futureValue;
                    double cdTotalInterestEarned;


                    System.out.print("Please enter the deposit amount:");
                    deposit = scanner.nextDouble();

                    System.out.print("Please enter the cd interest rate:");
                    cdInterestRate = scanner.nextFloat();

                    System.out.print("Please enter the number of years you would like to invest:");
                    years = scanner.nextInt();

                    //FV = P × (1 + (r / 365))^(365 × t)

                    cdAnnualRate = cdInterestRate / 100;

                    futureValue = deposit * Math.pow((1 + (cdAnnualRate / 365)), (365 * years));
                    cdTotalInterestEarned = futureValue - deposit;

                    System.out.printf("The total future amount would be: $%.2f", futureValue);
                    System.out.println();
                    System.out.printf("Over the course of %d years you would have earned $%.2f in interest", years, cdTotalInterestEarned);

                    break;
                default:
                    System.out.println("invalid input");
            }
        }
        System.out.println("Thank you for using this Calculator have a great day");

    }
}