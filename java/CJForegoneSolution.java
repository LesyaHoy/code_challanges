import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
Someone just won the Code Jam lottery, and we owe them N jamcoins! However, when we tried to print out an oversized check, 
we encountered a problem. The value of N, which is an integer, includes at least one digit that is a 4... 
and the 4 key on the keyboard of our oversized check printer is broken.
Fortunately, we have a workaround: we will send our winner two checks for positive integer amounts A and B, such that neither A nor B contains any digit that is a 4, 
and A + B = N. Please help us find any pair of values A and B that satisfy these conditions.

Input
The first line of the input gives the number of test cases, T. T test cases follow; each consists of one line with an integer N.


Output
For each test case, output one line containing Case #x: A B, where x is the test case number (starting from 1), and A and B are positive integers as described above.

It is guaranteed that at least one solution exists. If there are multiple solutions, you may output any one of them.
*/

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
