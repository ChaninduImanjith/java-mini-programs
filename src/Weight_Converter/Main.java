package Weight_Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            double weight;
            double newWeight;
            int choice;

            System.out.println("***********  Weight Conversion Program  ***********");
            System.out.println("1: Convert lbs to kgs");
            System.out.println("2: Convert kgs to lbs");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the weight in lbs: ");
                    weight = scanner.nextDouble();
                    newWeight = weight * 0.453592;
                    System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
                    break;
                case 2:
                    System.out.print("Enter the weight in kgs: ");
                    weight = scanner.nextDouble();
                    newWeight = weight * 2.20462;
                    System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.print("Do you want to continue this program (Y/N): ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y');

        scanner.close();
        System.out.println("Program ended. Thank you!");
    }
}