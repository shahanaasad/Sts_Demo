package Beans;

import Interfaces.PaymentGateway;

public class Customer {
	private PaymentGateway gateway;

	
		
	public Customer(PaymentGateway gateway) {
		super();
		this.gateway = gateway;
	}

	public void payment()
	{
		System.out.println("Payment by : ");
		gateway.payMethod();
	}

}
