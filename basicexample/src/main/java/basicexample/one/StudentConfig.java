/*
** Author - Yogesh Janghel
*/
package basicexample.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	public Student getStudent() {
		return new Student();
	}
}
