/*
** Author - Yogesh Janghel
*/
package basicexample;

public class Student {

	private String studentName;
	
	Student(){	
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