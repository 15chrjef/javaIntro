public class Variables {
	public static void main (String[] args){
		//working with variables
		String message = "Variables are awesome!";
		System.out.println(message);

		//reassigning variables
		String myMessage = "variables are fantastic";
		myMessage = "variables are super";
		System.out.println(myMessage);

		//Number Variables
		int year = 2013;
		double pi = 3.14;
		System.out.println(year);
		System.out.println(pi);

		//Variables within variables
		int five = 5;
		int ten = 10;
		int sum = five + ten;
		System.out.println(sum);
	}
}