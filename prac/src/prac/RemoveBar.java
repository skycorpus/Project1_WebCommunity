package prac;

public class RemoveBar {
	public static void main(String[] args) {
		String str="990208-1012752";
		StringBuilder sbuf = new StringBuilder(str);
		
		int idx = sbuf.lastIndexOf("-");
		if(idx != -1)
			sbuf.deleteCharAt(idx);
		str=sbuf.toString();
		System.out.println(str);
	}
}
