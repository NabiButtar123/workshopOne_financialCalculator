package com.ps;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch(){
            case 1:
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
                System.out.println();
                System.out.printf("The Interest payment paid over " + loanLength + " years is $%.2f", totalInterestRate);

                break;
            case 2:
                double deposit;
                float cdInterestRate;
                int years;
                double cdAnnualRate;
                double futureValue;
                double cdTotalInterest;


                System.out.println("Please enter the deposit amount:");
                deposit = scanner.nextDouble();

                System.out.println("Please enter the cd interest rate:");
                cdInterestRate = scanner.nextFloat();

                System.out.println("Please enter the number of years you would like to invest:");
                years = scanner.nextInt();

                //FV = P × (1 + (r / 365))^(365 × t)

                cdAnnualRate = cdInterestRate/100;

                futureValue = deposit * Math.pow((1 +(cdAnnualRate/365)), 365 * years));




                break;
            default:
                System.out.println("invalid input");
        }

    }
}