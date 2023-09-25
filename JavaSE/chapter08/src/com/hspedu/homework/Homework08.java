package com.hspedu.homework;

public class Homework08 {
    public static void main(String[] args) {
//        BankAccount checkingAccount = new CheckingAccount(20000);
//        checkingAccount.deposit(1000);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(2000);
//        System.out.println(checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(2000, 0.05);
        savingsAccount.deposit(100);
        savingsAccount.deposit(200);
        savingsAccount.deposit(300);
        savingsAccount.deposit(400);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(498);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(125);
        savingsAccount.withdraw(300);
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount.getBalance());
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount {
    private final double commission = 1;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getCommission() {
        return commission;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - commission);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + commission);
    }
}

class SavingsAccount extends BankAccount {
    private int times = 3;
    private double rate;
    private final double commission = 1;

    public SavingsAccount(double initialBalance, double rate) {
        super(initialBalance);
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        if (times != 0) {
            super.deposit(amount);
            times--;
        } else {
            super.deposit(amount - commission);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (times != 0) {
            super.withdraw(amount);
            times--;
        } else {
            super.withdraw(amount + 1);
        }
    }
    public void earnMonthlyInterest() {
        setBalance(getBalance() + rate * getBalance());
        times = 3;
    }
    public double getCommission() {
        return commission;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}