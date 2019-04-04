/*
** Author - Yogesh Janghel
*/
package di.constructor.injection.with.dependent.object;

import org.springframework.beans.factory.annotation.Autowired;

public class MyClass1 {

	MyClass1(MyClass2 myClass2){
		
		System.out.println("Creating MyClass1");
		
		myClass2.printInfo();
	}
}
