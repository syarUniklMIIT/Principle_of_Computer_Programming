package code;

//Q3

import java.util.Scanner;

public class Rental {
    public static void main(String[] args){
        int Days;
        double BeginningReading,EndReading,OdometerReading,RentCharge;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the beginning reading of the odometer: ");
        BeginningReading = keyboard.nextDouble();

        System.out.print("Enter the end reading of the odometer:");
        EndReading = keyboard.nextDouble();

        System.out.print("Enter the amount of days the car has been used:");
        Days = keyboard.nextInt();

        OdometerReading = EndReading - BeginningReading;
        RentCharge = (OdometerReading * 0.12) + (Days * 15);
        
        System.out.println("Rent to charge is RM"+ RentCharge);
        
    }
}
