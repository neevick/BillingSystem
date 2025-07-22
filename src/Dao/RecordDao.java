package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecordDao {
    public boolean insertrecord(int customerId, double billAmount, double electricityConsumed) {
        try {
            Connection conn = DatabaseConnection.connect();
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
}
