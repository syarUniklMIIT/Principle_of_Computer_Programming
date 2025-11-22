package code;
//9
import java.util.Scanner;
public class FoodTruck {
    public static void main(String[] args) {
        int AmountSold;
        double TotalIncome;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of Roti John sold:");
        AmountSold = keyboard.nextInt();
        TotalIncome = AmountSold * 7.50;
        System.out.println("Total Income today is RM"+TotalIncome);
        
    }
}
