public class While{
	public static void main(String[] args) {
		int number = 1;
		while(number < 10) {
			System.out.println(number);
			number ++;
		}

		int number2 = 2;

		do{
			System.out.println(number2);
			number ++;
		} while(number < 2);
		
		for(int i = 21; i <= 30; i++){
			System.out.println(i);
		}
	}
}