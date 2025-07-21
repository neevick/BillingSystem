package Service;

public class CustomerService {
    public double calculateBillAmount(double electricityConsumed) {
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
