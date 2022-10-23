package com.student;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import com.mysql.cj.xdevapi.Statement;



public class StudentDao {

	public static boolean insertStudentToDB(Student st){
		boolean f = false;
		try {
			
		//jdbc code
		Connection con = CP.createC();
		String q = "insert into student(sname,sphone,scity) values(?,?,?)";
		
		//PreparedStatement
		
		PreparedStatement pstmt = con.prepareStatement(q);
		
		//Set the value of Parameter
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		
		//execute..
		pstmt.executeUpdate();
		f= true;
		
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
	
		return f;
	}
	
	
		public static boolean deleteStudent(int userId) throws IOException {
			boolean f = false;
			try {
			Connection con = CP.createC();
			String q = "delete from student where sid=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
			return f;
		}
		
			
		public static void showAllStudents() {
			
			try {
				
			//jdbc code
			Connection con = CP.createC();
			String q = "select * from student";
			java.sql.Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Phone: "+phone);
				System.out.println("City: "+city);
				System.out.println("++++++++++++++++++++++++");
				
			}
			
			//f= true;
			
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
			//return f;
		}
		
		public static void updateStudent() {
			try {
				Connection con= CP.createC();
				String q = "update student set sname=? where sid= ?";
				PreparedStatement pstmt = con.prepareStatement(q);
				
				pstmt.setString(1, "Surya");
				pstmt.setInt(2, 2);
				pstmt.executeUpdate();
				System.out.println("Succesfully Updated....");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		//-------------------
	}
	

