package View;

import Controller.BillViewController;

public class ShowHighestView {
    public static void showHighestView(){
        BillViewController billViewController = new BillViewController();
        System.out.println("\nBill Details:");
        billViewController.showBill();
    }
}
