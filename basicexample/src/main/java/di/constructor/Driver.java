/*
** Author - Yogesh Janghel
*/
package di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class Driver {
	
	public static void main(String[] str) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	
		Student student = (Student) context.getBean("getStudent");
		
		student.displayStudentName();
	
	}
	

}