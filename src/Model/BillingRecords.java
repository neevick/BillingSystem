package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BillingRecords {
    private static Customer customer;
    private static double billAmount;
    private LocalDate billDate;
    private static double electricityConsumed;

    public BillingRecords(Customer customer, double billAmount, LocalDate billDate, double electricityConsumed) {
        this.billDate = billDate;
        BillingRecords.billAmount = billAmount;
        BillingRecords.customer = customer;
        BillingRecords.electricityConsumed = electricityConsumed;
    }

    public static Customer getCustomer() {
        return customer;
    }

    public static void setCustomer(Customer customer) {
        BillingRecords.customer = customer;
    }

    public static double getBillAmount() {
        return billAmount;
    }

    public static void setBillAmount(double billAmount) {
        BillingRecords.billAmount = billAmount;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public double getElectricityConsumed() {
        return electricityConsumed;
    }

    public void setElectricityConsumed(double electricityConsumed) {
        BillingRecords.electricityConsumed = electricityConsumed;
    }


}