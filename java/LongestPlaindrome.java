/**
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.
*/

class Solution {
    public String longestPalindrome(String s) {
        String maxPalidrome = "";
        for(int i = 0; i < s.length(); i++){
            maxPalidrome = expandPalindrome(s, i, i, maxPalidrome);
            if((i < s.length() - 1) && s.charAt(i) == s.charAt(i+1)){
                maxPalidrome = expandPalindrome(s, i, i+1, maxPalidrome);
            }
        }
        return maxPalidrome;
    }

    String expandPalindrome(String s, int left, int right, String maxPalindrome){
        while(left - 1 >= 0 && right + 1 < s.length() && s.charAt(left - 1) == s.charAt(right + 1)){
            left--;
            right++;
        }

        if((right - left + 1) > maxPalindrome.length())
            maxPalindrome= s.substring(left, right+1);

        return maxPalindrome;
    }
}