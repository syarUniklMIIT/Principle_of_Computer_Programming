package code;
//Q5

import java.util.Scanner;
public class CandyBar {
    public static void main(String[] args) {
        int Numcandy;
        double TotalSales,FinalGains;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the amount of candy bars sold:");
        Numcandy = keyboard.nextInt();
        TotalSales = 0.75 * Numcandy;

        FinalGains = TotalSales*0.9;
        System.out.println("Amount of mmoney he computer club will receive is Rm"+ FinalGains);

    }
}

