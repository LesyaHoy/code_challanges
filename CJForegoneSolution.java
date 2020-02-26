import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

	private static void getComplimentary(int caseNumber, String numberStr){
		String complimentary = "";
		String rest = "";
		for(int i = 0; i< numberStr.length(); i++){
			if(numberStr.charAt(i) == '4'){
				complimentary += 2;
				rest += 2;
			}
			else{
				if(i != 0) {
					complimentary += 0;
				}
				rest += numberStr.charAt(i);
			}
		}

		System.out.println("Case #" + caseNumber + ": " + rest + " " + complimentary);
	}

    public static void main(String[] args) {
	   	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int numberOfTestCases = in.nextInt();
		in.nextLine();

		for (int i = 1; i <= numberOfTestCases; i++) {
			String numberStr = in.nextLine();
			getComplimentary(i, numberStr);
		}
    }
}
