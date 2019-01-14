import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double celsius, fahrenheit;

        System.out.println("A simple program to convert celsius to fahrenheit.");

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter temperature in celsius: ");
        celsius = in.nextDouble();

        fahrenheit = ((double)9 / 5) * celsius + 32;

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit );

    }
}
