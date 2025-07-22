package View;

import java.util.Scanner;

public class MainView {

    public static void showMainView(){
        Scanner input = new Scanner(System.in);
         while(true) {
            System.out.println("Enter 1: Add a customer");
            System.out.println("Enter 2: Calculate Bill");
            System.out.println("Enter 3: Show Highest Paying");
            System.out.println("Enter 4: Exit");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 0) {
                System.out.println("Invalid Option, Please enter 1,2 or 3.");
            }
            else if(choice == 1) {
                System.out.println("working");
            }
            else if (choice == 2) {
//                CalculateBillView.showCalculateBillView();
            }
            else if (choice == 3) {
                ShowHighestView.showHighestView();
            }
            else if (choice == 4) {
                System.out.println("Exiting.......!!");
                break;
            }
            else {
                System.out.println("Invalid output. Please enter 1,2 or 3.");
            }

        }
            input.close();
    }
}
