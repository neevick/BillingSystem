package Controller;

import Dao.BillViewDAO;

public class BillViewController {
    public void showBill(){
        BillViewDAO billViewdao = new BillViewDAO();
        billViewdao.showHighestCustomer();
    }

    public void calculateBill(){
        BillViewDAO billViewdao = new BillViewDAO();

    }
}
