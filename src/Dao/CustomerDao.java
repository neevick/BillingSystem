package Dao;

import Model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDao {
    private Connection conn;
    public boolean insertCustomer(Customer customer) {
        try {
            conn = Dao.DatabaseConnection.connect();
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
}
