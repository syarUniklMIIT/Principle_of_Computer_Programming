package code;

//Q7
import java.util.Scanner;

public class SemesterFees {
    public static void main(String[] args) {
        int CreditHours;
        double BooksCost,CreditCost,TotalFee;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter Amount of credit hours:");
        CreditHours = keyboard.nextInt();
        
        System.out.print("Enter the amount of moneny spent on books:");
        BooksCost = keyboard.nextDouble();

        CreditCost = CreditHours*250;
        TotalFee = CreditHours + BooksCost + 65;

        System.out.println("Fee for"+ CreditHours+ "credit hours:RM"+CreditCost);
        System.out.println("Amount of money spend on books:RM"+BooksCost);
        System.out.println("Athletic fee:RM65.00");
        System.out.println("Total Fees:RM"+TotalFee);
    }
}
