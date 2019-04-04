/*
** Author - Yogesh Janghel
*/
package di.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Value("Janghel")
	public String name;
	
	@Bean
	public Student getStudent() {
		return new Student(name);
	}
}
