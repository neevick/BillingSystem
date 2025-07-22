package Dao;

import java.sql.*;

public class BillViewDAO {
    private Connection conn;

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
