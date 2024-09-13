package Beans;

import Interfaces.PaymentGateway;

public class UPI implements PaymentGateway{

	@Override
	public void payMethod() {
		System.out.println("UPI");
		
	}


}
