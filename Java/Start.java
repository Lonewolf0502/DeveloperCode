import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.student.Student;
import com.student.StudentDao;


public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        System.out.println("Welcome to Student Management App.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        System.out.println("Press 1 to add Student.");
        System.out.println("Press 2 to Delete Student.");
        System.out.println("Press 3 to Display Student.");
        System.out.println("Press 4 to Update Student.");
        System.out.println("Press 5 to exist.");
        int c = Integer.parseInt(br.readLine());
        if(c== 1) {
        	// student add
        	System.out.println("Enter the User name: ");
        	String name = br.readLine();
        	System.out.println("Enter the user Phone: ");
        	String phone = br.readLine();
        	System.out.println("Enter the City: ");
        	String city = br.readLine();
        	
        	//create student object to store the student
        	
        	Student st = new Student(name,phone,city);
        	boolean answer = StudentDao.insertStudentToDB(st);
        	
        	if(answer) {
        		System.out.println("Student is added.");
        	}
        	else {
        		System.out.println("Something went Worng Try Again!");
        	}
        	System.out.println(st);
        	
        }
        else if(c==2) {
        	//Delete student
        	System.out.println("Enter the id to delete: ");
        	int userId = Integer.parseInt(br.readLine());
        	boolean f = StudentDao.deleteStudent(userId);
        	if(f) {
        		System.out.println("Deleted .....");
        		
        	}else {
        		System.out.println("Something went wrong....");
        	}
        	
        	
        }
        else if(c==3) {
        	//Display Student
        	StudentDao.showAllStudents();
        }
        else if(c == 4) {
        	StudentDao.updateStudent();
        }
        else if(c == 5) {
        	break;
        }
        
        else {
        	
        }
        	
        }
        System.out.println("Thank You For Visiting!...");
	}

}
