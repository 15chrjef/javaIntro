public class IfStatements{
	public static void main(String[] args) {
		//working with if, else if, and else
		int number = 30;
		if( number == 0 || number == 15){
			System.out.println("Number is equal to 0 or 15");
		}else if (number > 20 && number < 50) {
			System.out.println("Number is between 20 and 50");
		} else {
			System.out.println("None of the above are matched");
		}
	}
}