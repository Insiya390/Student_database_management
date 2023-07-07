package com.student.manage;

import java.util.Scanner;

public class Execute {

	
	public static boolean modifyRecord(int id) {
		
		boolean status = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to modify name");
		System.out.println("Enter 2 to modify phone");
		System.out.println("Enter 3 to modify city");
		int option = Integer.parseInt(sc.nextLine());
		if(option==1) {
			System.out.println("Enter new name:");
			String name = sc.nextLine();
			status = StudentDao.modifyName(id, name);
			
		}
		else if(option==2) {
			System.out.println("Enter new phone:");
			String phone = sc.nextLine();
			status = StudentDao.modifyPhone(id, phone);		
		}
		else if(option==3) {
			System.out.println("Enter new City:");
			String city = sc.nextLine();
			status = StudentDao.modifyCity(id,city);
			
			
		}
		else {
			System.out.println("Invalid option");
			
		}
		sc.close();
		return status;
		
	}
	
	public static void printDeleteStatus(boolean status) {
		if(status== true) {
			System.out.println("sucessfully deleted");
		}
		else {
			System.out.println("something went wrong, could not delete");
		}
		
	}
	public static void printAddStatus(boolean status) {
		if(status== true) {
			System.out.println("sucessfully added");
		}
		else {
			System.out.println("something went wrong, could not add");
		}
		
	}
	public static void printUpdateStatus(boolean status) {
		if(status== true) {
			System.out.println("sucessfully updated");
		}
		else {
			System.out.println("something went wrong, could not delete");
		}
		
	}
	public static void displayInfo() {
		System.out.println("Press 1 to add a student record");
		System.out.println("Press 2 to delete a student record");
		System.out.println("Press 3 to modify a student record");
		System.out.println("Press 4 to display table");
		System.out.println("Press 5 to display single student by ID");
		System.out.println("Press 6 to exit");
	}


}
