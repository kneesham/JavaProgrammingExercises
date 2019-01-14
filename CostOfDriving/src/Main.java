import java.util.Scanner;

public class Main {

    public static double calculate(double dis, double mpg, double ppg){

        double result;
        result =  (dis / mpg) * ppg;

        return result;
    }

    public static void main(String[] args) {

        double distance, mpg, pricePerGallon;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the distance traveled: ");
        distance = in.nextDouble();

        System.out.println("Enter miles per gallon: ");
        mpg = in.nextDouble();

        System.out.println("Enter the gas price per gallon: ");
        pricePerGallon = in.nextDouble();

        System.out.printf("The result of your voyage is: $%.2f ",  calculate(distance, mpg, pricePerGallon) );

    }
}