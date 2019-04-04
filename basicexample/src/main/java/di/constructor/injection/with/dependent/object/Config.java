/*
** Author - Yogesh Janghel
*/
package di.constructor.injection.with.dependent.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Autowired
	MyClass2 myClass2;
	
	@Bean
	MyClass1 getMyClass1() {
		
		return new MyClass1(myClass2);
	}
	
	@Bean
	MyClass2 getMyClass2() {
		
		return new MyClass2();
	}
	
	
}
