import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args){
		int[] evenNums = { 2, 4, 6, 8, 0};
		System.out.println(evenNums[0]);
		evenNums[0] = 3;
		System.out.println(evenNums[0]);
		System.out.println(evenNums.length);

		for(int i = 0; i < evenNums.length; i++){
			System.out.println(evenNums[i]);
		}

		ArrayList<String> bdayList = new ArrayList<String>();
		bdayList.add("BMX Bike");
		bdayList.add("Compact Camero");
		bdayList.add("socks socks and socks");
		System.out.println(bdayList.get(1));

		bdayList.set(1, "OTHER CAMERO");
		System.out.println(bdayList.get(1));

		for(int j = 0; j < bdayList.size(); j++){
			System.out.println(bdayList.get(j));
		}
	}
}