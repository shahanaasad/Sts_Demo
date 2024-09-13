package Beans;

import Interfaces.PaymentGateway;

public class NetBanking implements PaymentGateway {


	@Override
	public void payMethod() {
		System.out.println("Net Banking");
		
	}

}
