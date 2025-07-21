package View;

import Controller.CustomerController;
import Model.BillingRecords;
import Model.Customer;
import Service.CustomerService;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculateView {
    public static void showCalculateView() {
        LocalDate billDate = LocalDate.now();
        Scanner scan = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        System.out.println("Enter Customer name:");
        String customerName = scan.next();
        System.out.println("Enter Customer house number");
        int customerHouseNumber = Integer.parseInt(scan.next());
        System.out.println("Enter electricity consumed: ");
        double electricityConsumed = scan.nextDouble();

        double billAmount = customerService.calculateBillAmount(electricityConsumed);
        Customer customer = new Customer(customerName,customerHouseNumber);
        BillingRecords billingRecords = new BillingRecords(customer,billAmount, billDate,electricityConsumed);

    }
}
