//package creditCard;

public class CreditCard {
	private int creditLimit = 20000;
	private int balance;
	private String cardHolder;
	private int purchases;

	//constructs a credit card with provided card holder name, @param name
	public CreditCard(String name) {
		creditLimit = 500;
		balance = 0;
		purchases = 0;
		cardHolder = name;
	}

	//constructs credit card with name and limit, @param name, @param amount
	public CreditCard(String name, int amount) {
		creditLimit = amount;
		balance = 0;
		purchases = 0;
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
		int availableCredit = creditLimit - balance;
		if(amount > availableCredit){
			balance = balance + amount + 50;
		}else {
			balance = balance + amount;
			purchases ++;
		}
	}

	//makes a payment, subtracts from balance, @param amount of purchase
	public void makePayment(int amount) {
		balance = balance - amount;
	}

	//poorly calulates the number of reward points earned
	public int calculateRewardPoints(){
		int points = 0;
		for(int i = 0; i < purchases; i++){
			points = points + 100;
		}
		return points;
	}

}