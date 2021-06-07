package org.example;
import java.util.Locale;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int fahrenheit, celsius;
        String conversion;
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\nYour choice: ");
        conversion = input.next();
        if(conversion.toLowerCase(Locale.ROOT).equals("c")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            fahrenheit = input.nextInt();
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + celsius);
        }
        if(conversion.toLowerCase(Locale.ROOT).equals("f")) {
            System.out.print("Please enter the temperature in Celsius: ");
            celsius = input.nextInt();
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + fahrenheit);
        }

    }
}
