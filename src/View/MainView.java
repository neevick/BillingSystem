package View;

import java.util.Scanner;

public class MainView {
    public static void getMainView() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add a Customer");
            System.out.println("Enter 2 to Calculate Electricity Bill");
            System.out.println("Enter 3 to Show Highest Bill Paying Customer");
            System.out.println("Enter 4 to Exit");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                InsertView.showInsertView();
            } else if (choice == 2) {
                CalculateView.showCalculateView();
            } else if (choice == 3) {
                ShowHighestView.showHighestView();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Choose between given options..");
            }
        }

    }
}