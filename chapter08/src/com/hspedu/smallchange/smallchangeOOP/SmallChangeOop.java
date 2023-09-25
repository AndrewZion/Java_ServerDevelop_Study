package com.hspedu.smallchange.smallchangeOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOop {
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    String option;
    String detail = "--------------零钱通明细--------------";
    double balance = 0;
    double money;
    String info;
    Date date;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void menuView() {
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
                    detail_Display();
                    break;
                case "2":
                    account_Get();
                    break;
                case "3":
                    consume();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("输入有误");
            }
        } while (loop);
    }
    public void detail_Display() {
        System.out.println(detail);
    }
    public void account_Get() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("输入金额不对!");
            return;
        }
        balance += money;
        date = new Date();
        detail += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t余额：" + balance;
    }
    public void consume() {
        System.out.print("消费信息：");
        info = scanner.next();
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应在 0 - " + balance + " 之间!");
            return;
        }
        date = new Date();
        balance -= money;
        detail += "\n" + info + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t余额：" + balance;
    }
    public void exit() {
        System.out.print("是否确认退出(y/n)：");
        String conf = scanner.next().toLowerCase();
        if ("y".equals(conf)) {
            loop = false;
        } else if ("n".equals(conf)) {
            return;
        } else {
            System.out.println("输入有误");
            return;
        }
    }
}
