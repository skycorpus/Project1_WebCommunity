package ch12;

import javax.swing.*;

public class Input {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i>20; i++) {
			System.out.println(i);
			Thread.sleep(300);
		}
		String str = JOptionPane.showInputDialog("아무거나 입력해.");
	}
}
