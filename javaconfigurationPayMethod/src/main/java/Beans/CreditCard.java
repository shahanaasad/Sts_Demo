package Beans;

import Interfaces.PaymentGateway;

public class CreditCard implements PaymentGateway {


	@Override
	public void payMethod() {
		System.out.println("Credit Card");
		
	}

}
