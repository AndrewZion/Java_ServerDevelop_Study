package houserent.view;

import houserent.service.HouseService;
import houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char sel;
    public void mainMenu() {
        HouseService houseService = new HouseService();
        do {
            System.out.println("--------------房屋出租系统--------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请选择(1-6):");
            sel = Utility.readMenuSelection();
            switch (sel) {
                case '1':
                    houseService.addHouse();
                    break;
                case '2':
                    houseService.findHouse();
                    break;
                case '3':
                    houseService.delHouse();
                    break;
                case '4':
                    houseService.updateHouse();
                    break;
                case '5':
                    houseService.showHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }

    public void exit() {
        char sel = Utility.readConfirmSelection();
        if(sel == 'Y'){
            System.out.println("你退出了程序...");
            loop = false;
        }
    }
}
