package View;

import Controller.CustomerController;
import Model.Customer;

import java.util.Scanner;

public class InsertView {

    public static void showInsertView() {
        Scanner scan = new Scanner(System.in);
        CustomerController customerController =new CustomerController();
        System.out.println("Enter Customer name:");
        String customerName = scan.next();
        System.out.println("Enter Customer house number");
        int customerHouseNumber = Integer.parseInt(scan.next());

        Customer customer = new Customer(customerName,customerHouseNumber);
        if (customerController.addCustomer(customer)){
            System.out.println("Customer added successfully");
        } else {
            System.out.println("Customer not added");
        }

    }
}
