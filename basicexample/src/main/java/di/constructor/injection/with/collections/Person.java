/*
** Author - Yogesh Janghel
*/
package di.constructor.injection.with.collections;

import java.util.List;

public class Person {

	Person(){}
	
	Person(String name, List qualification){
		
		super();
		
		System.out.println("Name=" + name);
		System.out.println("Qualification=" + qualification);
	}
}
