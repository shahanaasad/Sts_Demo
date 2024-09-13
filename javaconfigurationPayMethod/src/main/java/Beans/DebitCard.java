package Beans;

import Interfaces.PaymentGateway;

public class DebitCard implements PaymentGateway{

	@Override
	public void payMethod() {
		System.out.println("Debit Card");
		
	}


}
