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