/*
** Author - Yogesh Janghel
*/
package di.constructor.injection.with.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import di.constructor.injection.with.dependent.object.Config;

public class TestDriver {
	
	public static void main(String[] str) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		
		context.containsBean("getPerson");
	}

}
