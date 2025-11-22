package Lab_2;
//Q2

import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        double Radius,Height,Volume;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder:");
        Radius = keyboard.nextDouble();
        System.out.print("Enter the height of the cylinder:");
        Height = keyboard.nextDouble();

        Volume = 3.142 * Math.pow(Radius) * Height;

        System.out.println("The volume of the cylinder is "+Volume);

        if (Volume <30 ) {
            System.out.println("price:18.90");
        }
        else if  (Volume > 77 ){
            System.out.println("Price:54.90");

        }
        else
            System.out.println("Price:32.90");

    }
}
