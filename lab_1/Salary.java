package code;
//Q6

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        
    
    int Hours;
    double Salary;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter the amount of hours you worked:");
    Hours = keyboard.nextInt();
    Salary = Hours*4.70;
    System.out.print("Salary for one day is RM"+Salary);
    }
}
