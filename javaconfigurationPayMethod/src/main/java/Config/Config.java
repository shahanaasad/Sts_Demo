package Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Beans.*;

@Configuration

public class Config {
@Bean
public CreditCard cc() {
	return new CreditCard();
}
@Bean
public DebitCard dc() {
	return new DebitCard();

}
@Bean
public UPI upi() {
	return new  UPI();

}
@Bean
public NetBanking net() {
	return new NetBanking();

}
@Bean 
public Customer cus(NetBanking obj) {
	return new Customer(obj);
}
}
