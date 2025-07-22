package Service;

import Dao.CustomerDao;
import Dao.RecordDao;
import Model.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerService {

    public int pullCustomerId(String customerName, int customerHouseNumber) {
        int customerId = 0;
        CustomerDao customerDao;
        try {
            customerDao = new CustomerDao();
            ResultSet customerSet = customerDao.selectCustomer(customerName, customerHouseNumber);
            while (customerSet.next()) {
                customerId = customerSet.getInt("customerId");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerId;
    }



        public double calculateBillAmount ( double electricityConsumed){
            double bill = 0;
            if (electricityConsumed > 30) {
                double remaining_units = electricityConsumed - 30;
                double billofRemainingunits = remaining_units * 2;
                bill = 100 + 250 + billofRemainingunits;
            } else if (electricityConsumed < 30) {
                if (electricityConsumed <= 10) {
                    bill = 10 * electricityConsumed;
                } else {
                    double remainingunder30 = 30 - electricityConsumed;
                    double billofRemainingunder30 = remainingunder30 * 12.5;
                    bill = 100 + billofRemainingunder30;
                }
            }
            return bill;
        }
    }

