package View;

import Controller.CustomerController;
import Controller.RecordController;
import Model.BillingRecords;
import Model.Customer;
import Service.CustomerService;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Scanner;

public class CalculateView {
    public static void showCalculateView() {
        int customerId = 0;
        Scanner scan = new Scanner(System.in);
        RecordController recordController = new RecordController();
        CustomerController customerController = new CustomerController();
        CustomerService customerService = new CustomerService();
        System.out.println("Enter Customer name:");
        String customerName = scan.next();
        System.out.println("Enter Customer house number: ");
        int customerHouseNumber = Integer.parseInt(scan.next());

        if (customerController.getcustomerid(customerName,customerHouseNumber)== 0){
            System.out.println("Customer not found");
        } else {
            customerId = customerController.getcustomerid(customerName,customerHouseNumber);
        System.out.println("Enter electricity consumed: ");
        double electricityConsumed = scan.nextDouble();

        double billAmount = customerService.calculateBillAmount(electricityConsumed);

        if (recordController.addRecord(customerId,billAmount,electricityConsumed)){
            System.out.println("Record added successfully");
        } else {
            System.out.println("Record didn't added");
        }
        }
    }
}
