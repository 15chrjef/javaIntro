import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest{

	private CreditCard card1;
	private CreditCard card2;

	@Before
	public void setUp() throws Exception{
		card1 = new CreditCard("Jeff C");
		card2 = new CreditCard("Spen C", 3000);
	}

	@Test
	public void testCreditCardString(){
		assertEquals("Jeff C", card1.getCardHolder());
		assertEquals(500, card1.getCreditLimit());
		assertEquals(0, card1.getBalance());
	}

	@Test
	public void testCreditCardStringInt(){
		assertEquals("Spen C", card2.getCardHolder());
		assertEquals(3000, card2.getCreditLimit());
		assertEquals(0, card2.getBalance());
	}

	@Test
	public void testMakePurchase(){
		card1.makePurchase(1);
		assertEquals(1, card1.getBalance())
	}
	
	@Test
	public void TestMakePayment(){
		card2.makePurchase(1);
		card2.makePayment(1);
		assertEquals(0, card2.getBalance());
	}

}