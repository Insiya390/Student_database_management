package com.student.manage;

import java.util.Scanner;

public class Call {

	
	public static void callMethod() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
				try {
					int option = Integer.parseInt(sc.nextLine());
					if(option==1) {
						System.out.println("Enter ID:");
						int id= Integer.parseInt(sc.nextLine());
						System.out.println("Enter name:");
						String name = sc.nextLine();
						System.out.println("Enter phone:");
						String phone = sc.nextLine();
						System.out.println("Enter City:");
						String city = sc.nextLine();
						
						Student s1 = new Student(id, name, phone, city);
						Execute.printAddStatus(StudentDao.InsertintoDB(s1));
					}
						else if(option==2) {
							System.out.println("Enter ID of student to be deleted");
							int id = Integer.parseInt(sc.nextLine());
							Execute.printDeleteStatus(StudentDao.deleteDB(id));
							continue;
						}
						
						else if(option==3) {
							System.out.println("Enter ID of student record to be updated");
							int id = Integer.parseInt(sc.nextLine());
							Execute.printUpdateStatus(Execute.modifyRecord(id));
							continue;
						
						}
						else if(option==4) {
							
							StudentDao.showTable();
							continue;
							
						}
						else if(option==5) {
							System.out.println("Enter ID of student to be displayed");
							int id = Integer.parseInt(sc.nextLine());
							StudentDao.getStudent(id);
							continue;
							
						}
						else if(option==6) {
							sc.close();
							break;
						}
						else {
							System.out.println("Invalid choice, try again");
						}	
					}
				
				catch(NumberFormatException nfe){
					System.out.println("Please Enter a number among the valid options only, try again: ");
					continue;
				}
				//System.out.println(s1.toString());
			}
		return;
			
		}
		
	
}
