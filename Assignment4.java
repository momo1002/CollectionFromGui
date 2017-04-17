import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment4 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year.(From 0 to 10000.)");
		int Y = scan.nextInt();

		Set<String> mySet = new HashSet<String>();
		for(int y = Y+1 ; y <= 10000 ; y++){
			String strNextYear = String.valueOf(y);
			String[] arrayNextYear = new String[strNextYear.length()];
			for (int i = 0; i < arrayNextYear.length; i++) {
				arrayNextYear[i] = String.valueOf(strNextYear.charAt(i));
				mySet.add(arrayNextYear[i]);
			}
			if(mySet.size() == arrayNextYear.length){
				for(String D: arrayNextYear){
					System.out.print(D);
				}
				break;
			} else {
				mySet.clear();
			}
		}
	}
}
