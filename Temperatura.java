package Cacau;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        System.out.print("Insira a temperatura em graus celsius: ");
        float celsius= scanner.nextFloat();

     //  Fahrenheit (°F) = (Celsius (°C) × 9/5) + 32
        //Kelvin (K) = Celsius (°C) + 273.15

        float fahrenheit= (celsius * 9 / 5)+32;
        double kelvin= (celsius + 273.15);

        System.out.println("Temperatura em Celsius: "+celsius);
        System.out.println("Temperatura em Fahrenheit: "+fahrenheit);
        System.out.println("Temperatura em Kelvin: "+kelvin);

    }
}
