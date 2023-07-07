package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	
	public static boolean InsertintoDB(Student s)
	{
		boolean flag = false;
		
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "insert into students(id, name, phone, city) values( ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(q); 
			ps.setLong(1, s.getID());
			ps.setString(2, s.getName());
			ps.setString(3, s.getPhone());
			ps.setString(4, s.getCity());
			
			ps.executeUpdate();
			flag = true;
			// con.close(); exception?
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return flag;	
		
	}
	public static boolean deleteDB(int id)
	{
		boolean flag = false;
		
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "Delete from students where id=?";
			
			PreparedStatement ps = con.prepareStatement(q); 
			ps.setLong(1, id);
		
			ps.executeUpdate();
			flag = true;
			//con.close();
			
		}
		catch
		(Exception e){
			e.printStackTrace();
		}
		
		return flag;	
		
	}
	public static boolean modifyName (int id, String name)
	{
		boolean flag = false;
		
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "Update students set name=? where id=?";
			
			PreparedStatement ps = con.prepareStatement(q); 
			ps.setString(1, name);
			ps.setLong(2,id);
		
			ps.executeUpdate();
			flag = true;
			//con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return flag;	
		
	}
	public static boolean modifyPhone (int id, String phone)
	{
		boolean flag = false;
		
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "Update students set phone=? where id=?";
			
			PreparedStatement ps = con.prepareStatement(q); 
			ps.setString(1, phone);
			ps.setLong(2,id);
		
			ps.executeUpdate();
			flag = true;
			//con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return flag;	
		
	}
	public static boolean modifyCity (int id, String city)
	{
		boolean flag = false;
		
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "Update students set city=? where id=?";
			
			PreparedStatement ps = con.prepareStatement(q); 
			ps.setString(1, city);
			ps.setLong(2,id);
		
			ps.executeUpdate();
			flag = true;
			//con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return flag;	
		
	}
	
	public static void showTable() {
		System.out.println("ID\t\tName\t\tPhone\t\t\tCity");
	try {
			Connection con = ConnectionProvider.createConnection();
			String sql = "Select * from students";
			/*
			 * com.mysql.cj.jdbc.ClientPreparedStatement: Select * from students
			 * com.mysql.cj.jdbc.result.ResultSetImpl@307f6b8c
			 */
			 
			 PreparedStatement ps = con.prepareStatement(sql);
			 System.out.println(ps);
			 ResultSet rs = ps.executeQuery();
			System.out.println("hi" + rs.toString());
			// ps.executeUpdate();
			 
			 while (rs.next()) {
				 
		         int id = rs.getInt("id");
		         String name = rs.getString("name");
		         String phone = rs.getString("phone");
		         String city = rs.getString("city");
		         System.out.println(id + "\t\t" + name + "\t\t" + phone + "\t\t" + city);
		         
	         }
			//con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	public static void getStudent(int id) {
		System.out.println("ID\t\tName\t\tPhone\t\t\tCity");
	try {
			Connection con = ConnectionProvider.createConnection();
			String sql = "Select * from students where id=?";
			
			 
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.setLong(1,id);
			 ResultSet rs =  ps.executeQuery();
			 rs.next();
			 
	         String name = rs.getString("name");
	         String phone = rs.getString("phone");
	         String city = rs.getString("city");
	         System.out.println(id + "\t\t" + name + "\t\t" + phone + "\t\t" + city);
	          
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
}
