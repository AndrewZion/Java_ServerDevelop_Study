package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        String option;
        String detail = "--------------零钱通明细--------------";
        double balance = 0;
        double money;
        String info;
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        do {
            System.out.println("--------------零钱通菜单--------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消    费");
            System.out.println("\t\t\t4 退    出");
            System.out.print("请选择(1-4)：");
            option = scanner.next();
            switch (option) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("输入金额不对!");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t余额：" + balance;
                    break;
                case "3":
                    System.out.print("消费信息：");
                    info = scanner.next();
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应在 0 - " + balance + " 之间!");
                        break;
                    }
                    date = new Date();
                    balance -= money;
                    detail += "\n" + info + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t余额：" + balance;
                    break;
                case "4":
                    System.out.print("是否确认退出(y/n)：");
                    String conf = scanner.next().toLowerCase();
                    if ("y".equals(conf)) {
                        loop = false;
                    } else if ("n".equals(conf)) {
                        break;
                    } else {
                        System.out.println("输入有误");
                        break;
                    }
                    break;
                default:
                    System.out.println("输入有误");
            }
        } while (loop);
    }
}
