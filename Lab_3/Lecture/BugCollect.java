package Lab_3.Lecture;

import java.util.Scanner;

public class BugCollect {
    public static void main(String[] args) {
        int Collected,Total=0,day;

        Scanner keyboard = new Scanner(System.in);

        for(day=1;day<=7;++day){
            System.out.print("Enter the amount of bugs collected on day "+day+":");
            Collected=keyboard.nextInt();
            Total+=Collected;

        }
        System.out.println("Total bugs collected in 7 days is "+Total);

        

    }
    
}
