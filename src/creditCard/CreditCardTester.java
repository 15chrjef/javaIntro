import java.util.ArrayList;

public class CreditCardTester {
	public static void main(String[] args) {
		//collection of credit cards
		ArrayList<CreditCard> cards = new ArrayList<CreditCard>();

		//cards
		CreditCard card1 = new CreditCard("Andrew Perkins", 2500);
		CreditCard card2 = new CreditCard("John Doe", 1400);
		CreditCard card3 = new CreditCard("Mary Doe", 750);

		//purchases
		card1.makePurchase(1000);
		card1.makePurchase(1500);
		
		card2.makePurchase(200);
		card2.makePurchase(400);
		card2.makePurchase(150);

		card3.makePurchase(900);

		//payments
		card1.makePayment(50);
		card2.makePayment(25);
		card3.makePayment(75);

		//add cards to collection
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);

		//printing out credit card information
		for( CreditCard card : cards) {
			System.out.println("The cardHolder is:" + card.getCardHolder());
			System.out.println("The credit limit is:" + card.getCreditLimit());
			System.out.println("The total balance is:" + card.getBalance());
			System.out.println("The reward points is:" + card.calculateRewardPoints());
			System.out.println("-----------");
		}
	}
}