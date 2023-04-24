package ch11;

import java.util.Arrays;

public abstract class Employee {
	public static double INCENTIVE_RATE = 0.1;
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	abstract int calPay();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	final int calBonus() {
		int result=0;
		int pay=calPay();
		if(pay>10000) {
			double temp=pay*INCENTIVE_RATE;
			result = (int)temp;
		}
		return result;
	}
	void print() {
		System.out.println("==========");
		System.out.println("이름 : "+name);
	}
}

public class Employees {
	public static void main(String[] args) {
		Employee[] em = new Employee[1];
		em.Employee;
		
		System.out.println(Arrays.toString(em));
	}
}
