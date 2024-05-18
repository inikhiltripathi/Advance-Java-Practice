package message;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Msg {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Message");
		String m = sc.nextLine();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		StringSelection ss=new StringSelection(m);
		Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();
		c.setContents(ss, null);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Error in thread");
			e.printStackTrace();
		}
		
		
		Robot r = null;
		try {
			r=new Robot();
		} catch (AWTException e) {
			System.out.println("Error in robot");
			e.printStackTrace();
		}
		
		for (int i = 1; i <= n; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error");
			}
			
		}
		sc.close();
	}

}
