package loose_coupling;

/*
*Exercise: Payment System with Loose Coupling
You need to design a payment system in Java that uses loose coupling principles. 
The goal is to make it easy to add new payment methods in the future without modifying existing code.

Requirements:
1. Create an Interface: PaymentMethod
	- Add the following method: void pay(double amount);
2. Create Payment Method Classes:
	- Class: CreditCardPayment
		- Implement the PaymentMethod interface.
		- In the pay() method, print: "Payment of [amount] processed using Credit Card."
	- Class: PayPalPayment
		- Implement the PaymentMethod interface.
		- In the pay() method, print: "Payment of [amount] processed using PayPal."
3. Create a PaymentProcessor Class:
	- Add a method: void processPayment(PaymentMethod method, double amount) {
    				method.pay(amount);
					}
	- This method takes a PaymentMethod object and an amount, then calls the pay() method.
4. Test the System:
	- In the main method of a class named PaymentSystem:
		- Create instances of CreditCardPayment and PayPalPayment.
		- Use a single PaymentProcessor object to process payments for both methods.
*/

interface PaymentMethod {
	void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
	
	public void pay(double amount) {
		System.out.println("Payment of " + amount + " processed using Credit Card.");
	}
}

class PayPalPayment implements PaymentMethod {
	
	public void pay(double amount) {
		System.out.println("Payment of " + amount + " processed using PayPal.");
	}
}

class PaymentProcessor {
	void processPayment (PaymentMethod method, double amount) {
		method.pay(amount);
	}
}
//Runtime Polymorphism is occuring here. We are using the Payment Processor to access other subclasses

class PaymentSystem {
	public static void main(String[] args) {
		
		CreditCardPayment ccp = new CreditCardPayment();
		PayPalPayment ppp = new PayPalPayment();
		
		PaymentProcessor pp = new PaymentProcessor();
		
		pp.processPayment(ccp, 2000.50);
		pp.processPayment(ppp, 5000.65);
		
	}
}