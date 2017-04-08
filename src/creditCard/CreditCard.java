//package creditCard;

public class CreditCard {
	private int creditLimit = 20000;
	private int balance;
	private String cardHolder;

	//constructs a credit card with provided card holder name, @param name
	public CreditCard(String name) {
		creditLimit = 500;
		balance = 0;
		cardHolder = name;
	}

	//constructs credit card with name and limit, @param name, @param amount
	public CreditCard(String name, int amount) {
		creditLimit = amount;
		balance = 0;
		cardHolder = name;
	}
	
	//gets the credit limit of credit card, @return the credit limit
	public int getCreditLimit(){
		return creditLimit;
	}

	//gets the balance on credit card, @return the balance
	public int getBalance(){
		return balance;
	}

	//get the cardHolder, @return the cardholder
	public String getCardHolder(){
		return cardHolder;
	}

	//makes a purchase, adds to balance, @param amount of purchase
	public void makePurchase(int amount) {
		balance = balance + amount;
	}

	//makes a payment, subtracts from balance, @param amount of purchase
	public void makePayment(int amount) {
		balance = balance - amount;
	}

}