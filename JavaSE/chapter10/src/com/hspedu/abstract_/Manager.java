package com.hspedu.abstract_;

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, int id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public void work() {
		System.out.println("经理 " + getName() + " 工作中...");
	}
}
