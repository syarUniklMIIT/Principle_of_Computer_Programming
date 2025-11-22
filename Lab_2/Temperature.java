package Lab_2;
//Q1 Temperature.java

import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        double Celcius,Fahrenheit;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("ENter the temperature in celcius:");
        Celcius = keyboard.nextDouble();

        Fahrenheit = 1.8*Celcius +32;

        System.out.println("Temperature in Fahrenheit is:"+Fahrenheit);
        if (Fahrenheit > 211) {
            System.out.println("Condition:Water boils");
            
        }
        else if(Fahrenheit<32){
            System.out.println("Condition:Water freezes");

        }
        else{
            System.out.println("Condition:Normal");
        }
    }
    
}
