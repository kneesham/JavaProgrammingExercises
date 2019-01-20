/***************************************************************

 Name: Theodore Nesham
 Date: 1 - 19 - 2019

 Description: This is a simple program that will
 Ask the user for the radius of a pentagon and then
 calculate the area of that pentagon.

 ***************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double lengthFromCenter, areaOfPent, side;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the distance from the center to the vertex of the pentagon: ");
        lengthFromCenter = in.nextDouble();

        side = 2 * lengthFromCenter * Math.sin(Math.PI / 5);
        areaOfPent = (5 * Math.pow(side, 2.0)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is: %4.2f", areaOfPent);

    }
}