package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecordDao {
    private Connection conn;
    public boolean insertrecord(int customerId, double billAmount, double electricityConsumed) {
        try {
            conn = DatabaseConnection.connect();
            String query = "INSERT INTO billingrecords(customerId, billAmount, electricityConsumed) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,customerId);
            ps.setDouble(2,billAmount);
            ps.setDouble(3,electricityConsumed);
            int row = ps.executeUpdate();
            if(row > 0){
                return true;
            } else {
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void showHighestCustomer(){
        try {
            conn = Dao.DatabaseConnection.connect();
            String query = "SELECT customer.customerName, customer.customerHouseNumber, billingrecords.billAmount, billingrecords.electricityConsumed FROM billingrecords JOIN customer ON billingrecords.customerid = customer.customerid ORDER BY billingrecords.billamount DESC LIMIT 1";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet billSet = ps.executeQuery();

            if(billSet.next()){
                String customerName = billSet.getString("customerName");
                int customerHouseNumber = billSet.getInt("customerHouseNumber");
                double billAmount = billSet.getDouble("billAmount");
                double electricityConsumed = billSet.getDouble("electricityConsumed");

                System.out.println("Customer Name: "+ customerName);
                System.out.println("House Number: "+ customerHouseNumber);
                System.out.println("Units Consumed: "+ electricityConsumed);
                System.out.println("Bill Amount: "+ billAmount);
            }
            else {
                System.out.println("no billing record found");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
