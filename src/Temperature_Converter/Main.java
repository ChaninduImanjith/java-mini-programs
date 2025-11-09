package Temperature_Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

    do{
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit?(C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("New Temperature: %.1f° %s", newTemp, unit);
        System.out.print("\n\nDo you want to continue this program (Y/N): ");
        continueChoice = scanner.next().charAt(0);

    } while (continueChoice == 'Y' || continueChoice == 'y');

        scanner.close();
        System.out.println("Program ended. Thank you!");
    }
}