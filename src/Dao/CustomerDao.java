package Dao;

import Model.BillingRecords;
import Model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {
    public boolean insertCustomer(Customer customer) {
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO customer(customerName, customerHouseNumber) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,customer.getCustomerName());
            ps.setInt(2,customer.getCustomerHouseNumber());
            int row = ps.executeUpdate();
            if (row>0){
                return true;
            }else {
                return false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet selectCustomer(String customerName, int customerHouseNumber) {
        ResultSet customerSet = null;
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "SELECT customerId FROM customer WHERE customerName = ? AND customerHouseNumber = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, customerName);
            ps.setInt(2, customerHouseNumber);
            customerSet = ps.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return customerSet;
    }
}
