package houserent.service;

import houserent.domain.House;
import houserent.utils.Utility;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    List<House> houseList = new ArrayList<>();
    private int houseId = 1;
    public void showHouse() {
        if (houseList.size() == 0){
            System.out.println("-------------目前系统无房源-------------");
            return;
        }
        System.out.println("--------------房屋列表--------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        for (int i = 0; i < houseList.size(); i++) {
            House houseTemp = houseList.get(i);
            System.out.println(houseTemp.toString());
        }
    }

    public void addHouse() {
        String name, phone, address, status;
        double rent;
        System.out.println("--------------添加房屋--------------");
        System.out.print("姓名：");
        name = Utility.readString(6, "xlb6");
        System.out.print("电话：");
        phone = Utility.readString(11, "123456");
        System.out.print("地址：");
        address = Utility.readString(6, "攸县");
        System.out.print("月租：");
        rent = Utility.readInt(3000);
        System.out.print("状态(未出租/已出租)：");
        status = Utility.readString(3);
        House house = new House(name, phone, address, rent, status);
        house.setId(houseId++);
        houseList.add(house);
    }

    public void delHouse() {
        System.out.println("--------------删除房屋--------------");
        System.out.print("请选择待删除房屋编号(-1退出)：");
        int id = Utility.readInt(-1);
        if (id == -1)
            return;
        int i = this.findById(id);
        if (i == -1) {
            System.out.println("未查找到id = " + id + " 的房屋");
        } else {
            System.out.println("确认是否删除(Y/N):");
            char sel = Utility.readConfirmSelection();
            if (sel == 'Y') {
                houseList.remove(i);
            }
        }
    }
    public void findHouse() {
        System.out.println("--------------查找房屋--------------");
        System.out.print("请输入你要查找的id(-1退出)：");
        int id = Utility.readInt(-1);
        if (id == -1)
            return;
        int i = this.findById(id);
        if (i == -1) {
            System.out.println("未查找到id = " + id + " 的房屋");
        } else {
            System.out.println(houseList.get(i).toString());
        }
    }

    public void updateHouse() {
        System.out.println("--------------修改房屋--------------");
        System.out.print("请输入你要修改房屋的id(-1退出)：");
        int id = Utility.readInt(-1);
        if (id == -1)
            return;
        int i = this.findById(id);
        if (i == -1) {
            System.out.println("未查找到id = " + id + " 的房屋");
        } else {
            House tempHouse = houseList.get(i);
            System.out.print("姓名(" + tempHouse.getMaster() + ")：");
            String name = Utility.readString(6, "xlb6");
            tempHouse.setMaster(name);
            System.out.print("电话(" + tempHouse.getPhone() + ")：");
            String phone = Utility.readString(11, "123456");
            tempHouse.setPhone(phone);
            System.out.print("地址(" + tempHouse.getAddress() + ")：");
            String address = Utility.readString(6, "攸县");
            tempHouse.setAddress(address);
            System.out.print("租金(" + tempHouse.getRent() + ")：");
            double rent = Utility.readInt(3000);
            tempHouse.setRent(rent);
            System.out.print("状态(" + tempHouse.getStatus() + ")：");
            String status = Utility.readString(3);
            tempHouse.setStatus(status);
        }
    }

    private int findById(int id) {
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
