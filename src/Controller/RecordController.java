package Controller;

import Dao.RecordDao;

public class RecordController {
    private final RecordDao recordDao;
    {
        try {
            recordDao= new RecordDao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public boolean addRecord(int customerId, double billAmount, double electricityConsumed) {
        return recordDao.insertrecord(customerId,billAmount,electricityConsumed);
    }

    public void showBill(){
        recordDao.showHighestCustomer();
    }

}
