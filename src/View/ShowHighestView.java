package View;

import Controller.RecordController;

public class ShowHighestView {
    public static void showHighestView(){
        RecordController recordController = new RecordController();
        System.out.println("\nBill Details:");
        recordController.showBill();
    }
}
