package code;

//Q8

import java.util.Scanner;
public class Installment {
    public static void main(String[] args) {
        
    
        double Principal , LoanTerm ,YearlyRate ,MonthlyInterestRate ,TNumPayment ,MonthlyPay;
    
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Amount of Money borrowed(Principal) in RM:");
        Principal = keyboard.nextDouble();
        System.out.print("Enter the Loan term in Years : ");
        LoanTerm = keyboard.nextDouble();
        System.out.print("Enter the annual interest rate in %:");
        YearlyRate = keyboard.nextDouble();
        MonthlyInterestRate =(YearlyRate/12)/100;
        TNumPayment = LoanTerm*12;
        MonthlyPay =(Principal * MonthlyInterestRate*(Math.pow(1+MonthlyInterestRate,TNumPayment))) / (Math.pow(1+MonthlyInterestRate,TNumPayment)-1);
        System.out.print("Amount to be paid monthly for “ + LoanTerm + “years is :RM"+ MonthlyPay);
    }
}
