package Lab_3.Lecture;

public class Temperature {
    public static void main(String[] args) {
        double Celcius,Fahrenheit;
        Celcius=0;
        
        while(Celcius<=10){
            Fahrenheit=1.8*Celcius+32;
            System.out.println("Celcius:"+Celcius+"°c");
            System.out.println("Fahrenheit:"+Fahrenheit+"°F");
            System.out.println("");
            ++Celcius;
        }
    }
}
