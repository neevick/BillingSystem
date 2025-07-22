package Model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class BillRecords {
    private Customer customer;
    private double billAmount;
    private LocalDate billingDate;
    private double electricityConsumed;


    public BillRecords(Customer customer, double billAmount, LocalDate billingDate, double electricityConsumed){
        this.customer = customer;
        this.billAmount = billAmount;
        this.billingDate = billingDate;
        this.electricityConsumed = electricityConsumed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public double getElectricityConsumed() {
        return electricityConsumed;
    }



}
