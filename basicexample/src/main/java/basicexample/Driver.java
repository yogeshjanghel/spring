/*
** Author - Yogesh Janghel
*/
package basicexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	
	public static void main(String[] str) {
		
		//Student student = new Student();
		
		//student.setStudentName("Yogesh");
		//student.displayStudentName();
	
	
		//Can we get some one to manage the creation and deletion of objects 
		//BeanFactory can do it.
		//Create a StudentContext.xml file.
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		
		//create a new BeanFactory
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Student student1 = (Student) beanFactory.getBean("studentbean");
		
		student1.displayStudentName();
	
	}
	

}