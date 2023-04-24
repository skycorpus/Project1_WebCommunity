package ch08;

public class SalaryMan extends Employee {
	private int annualSalary;
	SalaryMan(String name, int annualSalary){
		super(name); this.annualSalary = annualSalary;
	}
	int computePay() { //재정의해서 사용할 예정
		return annualSalary / 12;
	}
	//computeIncentive() //재정의 금지 - final은 재정의(overriding) 금지
}
