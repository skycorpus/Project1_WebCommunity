package ch08;

public class HourlyEmployee extends Employee {
	private int hourWorked;
	private int moneyPerHour;
	HourlyEmployee(String name, int hourWorked, int moneyPerHour){
		super(name); this.hourWorked = hourWorked; this.moneyPerHour=moneyPerHour;
	}
	@Override
	int computePay() {
		return hourWorked * moneyPerHour;
	}
}
