package lab_1;

//Q2
import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args){
        double radius,height,volume;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder:");
        radius = keyboard.nextDouble();

        System.out.print("Enter height of the cylinder:");
        height = keyboard.nextDouble();

        volume = 3.142 * Math.pow(radius,2) * height;

        System.out.println("Volume of the cylinder is "+ volume);


    }
    
}
