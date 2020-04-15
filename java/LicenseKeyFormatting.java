/**
You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.

Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group which could be shorter than K, but still must contain at least one character. Furthermore, there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.

Given a non-empty string S and a number K, format the string according to the rules described above.
*/

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        int newLength = S.length() + S.length()/K;
        char[] result = new char[S.length() + S.length()/K];

        int Kcount = 0;
        int index = newLength;

        for(int i = S.length() - 1; i >= 0; i--){
            char c = Character.toUpperCase(S.charAt(i));
            if(c == '-'){
                continue;
            }
            if(Kcount == K){
                result[--index] = '-';
                Kcount = 0;
            }
            result[--index] = c;
            Kcount++;

        }
        return "".copyValueOf(result, index, newLength - index);
    }
}