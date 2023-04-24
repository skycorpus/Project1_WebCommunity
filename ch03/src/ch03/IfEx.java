package ch03;

public class IfEx {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		//int score =100;
		String msg = "";
		if(value<10)
			msg = "Under 10";
		else if(value<100)
			msg = "Over 10, Under 100";
		else if(value<1000)
			msg = "Over 100, Under 1000";
		else 
			msg = "Over 1000";
		
		
		System.out.printf("value : %d, msg : %s", value, msg);
		
	}
}
