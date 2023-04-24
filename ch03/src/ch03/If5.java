package ch03;

public class If5 {
	public static void main(String[] args) {
		int i1 = Integer.parseInt(args[0]);
		String msg = "";
		if( i1 > 1000000) {
			//System.out.println("비행기 타세요.");
			msg = "비행기";
		} else if (i1>100000){
			//System.out.println("KTX 타세요.");
			msg = "KTX";
		} else if (i1>50000){
			//System.out.println("TAXI 타세요.");
			msg = "TAXI";
		} else if (i1>10000){
			//System.out.println("BUS 타세요.");
			msg = "BUS";
		}  else {
			//System.out.println("걸어가.");
			msg = "shoes";
			System.out.println("on "+msg);
		}
	}
}
