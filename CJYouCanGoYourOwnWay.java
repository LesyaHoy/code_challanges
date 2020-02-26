import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numberOfTestCases = in.nextInt();
        in.nextLine();

        for (int testCase = 1; testCase <= numberOfTestCases; testCase++) {
            in.nextLine();//skip number
            String lindaPath = in.nextLine();
            char[] myPath = new char[lindaPath.length()];
            for (int i = 0; i < lindaPath.length(); i++) {
                char c = lindaPath.charAt(i);
                myPath[i] = c=='E'?'S':'E';
            }
            System.out.println("Case #"+ testCase + ": " + new String(myPath));
        }
    }
}
