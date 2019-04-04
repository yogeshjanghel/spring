/*
** Author - Yogesh Janghel
*/
package di.constructor.injection.with.dependent.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] str) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MyClass1 myClass1 = (MyClass1) context.getBean("getMyClass1");
	}
}
