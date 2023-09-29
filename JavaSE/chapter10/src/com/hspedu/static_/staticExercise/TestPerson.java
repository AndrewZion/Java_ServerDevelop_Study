package com.hspedu.static_.staticExercise;

/*
 * class Person { private int id; private static int total = 0;
 * 
 * public static int getTotalPerson() { return total; }
 * 
 * public Person() { total++; id = total; } }
 * 
 * public class TestPerson { public static void main(String[] args) {
 * System.out.println("Number of total is " + Person.getTotalPerson());//0
 * Person p1 = new Person(); System.out.println("Number of total is " +
 * Person.getTotalPerson());//1 } }
 */

class Person {
	private int id;
	public static int total = 0;

	public static void setTotalPerson(int total) {
		Person.total = total;
	}

	public Person() {
		total++;
		id = total;
	}
}

public class TestPerson {
	public static void main(String[] args) {
		Person.setTotalPerson(3);
		new Person();
		System.out.println(Person.total);//4
	}
}