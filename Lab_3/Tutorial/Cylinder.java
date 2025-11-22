package Lab_3.Tutorial;
//Exercise3Q2

import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        double Radius,Height,Volume;
        int Below30=0;
        Scanner keyboard = new Scanner(System.in);


        for(int s=1;s<=30;s++){
            System.out.print("Enter the radius of the cylinder:");
            Radius = keyboard.nextDouble();
            System.out.print("Enter the height of the cylinder:");
            Height = keyboard.nextDouble();

            Volume = 3.142 * Math.pow(Radius,2) * Height;

            System.out.println("The volume of the cylinder is "+Volume);

            if (Volume <30 ) {
                System.out.println("price:18.90");
                Below30++;
            }
            else if  (Volume > 77 ){
                System.out.println("Price:54.90");

            }
            else
                System.out.println("Price:32.90");

            }
           System.out.println("number of cylinder volume that below 30 is "+Below30);
    }
}

