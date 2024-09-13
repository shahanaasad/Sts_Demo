package Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beans.Customer;
import Config.Config;

public class ConstructorArgRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext  context = new AnnotationConfigApplicationContext (Config.class);
		
    Customer obj =context.getBean(Customer.class);
    obj.payment();
	}

}
 