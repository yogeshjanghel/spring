/*
** Author - Yogesh Janghel
*/
package basicexample.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class Driver {

	
	public static void main(String[] str) {
		
		//Student student = new Student();
		
		//student.setStudentName("Yogesh");
		//student.displayStudentName();
	
	
		//Can we get some one to manage the creation and deletion of objects 
		//BeanFactory can do it.
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	
		Student student = (Student) context.getBean("getStudent");
		student.setStudentName("Yogesh");
		student.displayStudentName();
	
	}
	

}