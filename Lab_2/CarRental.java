package Lab_2;
//Q3  CarRental.java

import java.util.Scanner;
public class CarRental {
    public static void main(String[] args) {
            int Days,Loyalty;
            double StartReading,EndReading,OdometerReading,TotalCharge,Discount;
            var keyboard = new Scanner(System.in);
            System.out.print("Enter beginning reading of the Odometer:");
            StartReading = keyboard.nextDouble();
        
            System.out.print("ENter ending reading of the odometer:");
            EndReading = keyboard.nextDouble();

            System.out.print("Enter amount of days the car was used:");
            Days = keyboard.nextInt();

            System.out.println("Are you a member of the loyalty program?");
            System.out.println("1 : Yes \n2 : No");
            System.out.print("Enter either 1 or 2:");
            Loyalty= keyboard.nextInt();

            OdometerReading = EndReading-StartReading;
            TotalCharge = OdometerReading*0.12 + 15*Days;

            switch (Loyalty) {
                case 1:
                    Discount = 0.9; //changes value by decreasing it by 10%
                    break;
        
                default:
                    Discount = 1;// no change to value
                    break;
            }

            TotalCharge = TotalCharge * Discount;

            System.out.println("Total mile driven is "+OdometerReading+" miles");
            System.out.println("Total Charge is RM"+TotalCharge);


    }
}
