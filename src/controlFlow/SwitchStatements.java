public class SwitchStatements{

	public static void main(String[] args) {
		int day = 4;
		switch(day) {
			case 1: System.out.println("its monday"); break;
			case 2: System.out.println("its tuesday"); break;
			case 3: System.out.println("its wednesday"); break;
			case 4: System.out.println("its thursday"); break;
			case 5: System.out.println("its friday"); break;
			case 6: System.out.println("its saturday"); break;
			case 7: System.out.println("its sunday"); break;
			default: System.out.println("invalid day of the week");			
		}
	}
}