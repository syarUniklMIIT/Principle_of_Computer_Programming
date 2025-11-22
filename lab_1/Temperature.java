package code;

//Q1

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Double Fahrenheit,Celcius;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter temperature in celcius:");
        Celcius =keyboard.nextDouble();

        Fahrenheit = 1.8 * Celcius + 32;

        System.out.println("Temperature"+Celcius+"°C in fahrenheit is "+ Fahrenheit+"°F");

    }
}
