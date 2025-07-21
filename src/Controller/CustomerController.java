package Controller;

import Dao.CustomerDao;
import Model.Customer;

public class CustomerController {
    private final CustomerDao customerDao;
    {
        try {
            customerDao = new CustomerDao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addCustomer(Customer customer) {
        return customerDao.insertCustomer(customer);
    }
}
