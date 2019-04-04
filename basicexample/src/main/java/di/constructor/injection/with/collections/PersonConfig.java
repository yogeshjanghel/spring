/*
** Author - Yogesh Janghel
*/
package di.constructor.injection.with.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	@Bean
	Person getPerson() {
		
		return new Person("Yogesh",Arrays.asList("John", "Adam", "Harry"));
		
	}
	
}
