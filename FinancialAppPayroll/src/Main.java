import java.util.Scanner;

/***************************************************************************

this is a program that will ask the user to input payroll information
 then proceed to display a message with the results of the input.

*****************************************************************************/

public class Main {

    public static void displayResult(String name, double hW, double pR, double fT, double sT){

        System.out.printf("Employee's Name: %s\n" +
                          "Hours Worked: %.2f\n" +
                          "Pay Rate: %.2f\n" +
                          "Gross Pay: %.2f\n" +
                          "Deductions:\n" +
                          "\tFederal Withholding: (%.1f): $%.2f\n" +
                          "\tState Withholding (%.1f): $%.2f\n" +
                          "\tTotal Deduction: $%.2f\n" +
                          "Net Pay: %.2f",
                          name, hW, pR, (hW * pR),
                          (fT / (hW * pR) * 100), fT, // Federal withholding.
                          (sT / (hW * pR) * 100), sT, // State Withholding.
                          (fT + sT),                  // Total Deduction
                          ((hW * pR) - (fT + sT)));   // Net Pay Amt

        // This is a bit confusing and I should have used variables, but this was just for fun...
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name;
        double hoursWorked, payRate, fedTaxWithHeld, stateTaxWithHeld;

        System.out.println("Please enter employee's name: ");
        name = in.nextLine();

        System.out.println("Enter number of hours worked in a week: ");
        hoursWorked = in.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        payRate = in.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        fedTaxWithHeld = in.nextDouble() * payRate * hoursWorked;

        System.out.println("Enter state tax withholding rate: ");
        stateTaxWithHeld = in.nextDouble() * payRate * hoursWorked;

        displayResult(name, hoursWorked, payRate, fedTaxWithHeld, stateTaxWithHeld);

    }
}