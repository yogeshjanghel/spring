/*
** Author - Yogesh Janghel
*/
package di.setter;

public class Student {

	private String studentName;
	
	Student(String studentName){			
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void displayStudentName() {
		System.out.println("Student Name is " + getStudentName());
	}
	
}