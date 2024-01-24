 class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int patLength = pat.length();

        for (int i = 0; i <= myString.length() - patLength; i++) {
            if (myString.substring(i, i + patLength).equals(pat)) {
                count++;
            }
        }

        return count;
    }
}