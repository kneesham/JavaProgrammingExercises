import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int max = 0, occurrence = 0;

        System.out.println("Please enter a series of numbers separated by spaces ending with 0: ");

        while (true){

            int temp = in.nextInt();

            if (temp == 0){
                break;
            }
            else if (temp > max){
                max = temp;
                occurrence = 1;
            }
            else if (temp == max){
                occurrence++;
            }

        }

        System.out.printf("Occurrence: %d\nMaximum integer: %d", occurrence, max);
    }
}
