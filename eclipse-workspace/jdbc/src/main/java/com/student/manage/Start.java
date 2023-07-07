package com.student.manage;

import java.util.Scanner;

public class Start {
	
	
	public static void main(String args[]) {
	    Execute.displayInfo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter choice: ");
		Call.callMethod();
		
		System.out.println("Thank you, visit again");
		sc.close();
	}

}
