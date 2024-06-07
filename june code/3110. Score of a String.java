class Solution {
    public int scoreOfString(String s) {
        String[] sc = s.split("");
        int sum = 0;
        for(int i=1;i<s.length();i++){
        char temp = s.charAt(i-1);
        char temp1 = s.charAt(i);
        int asc1 = (int) temp;
        int asc2 = (int) temp1;
        sum = sum + Math.abs(asc1-asc2);
        }
        return sum;
    }
}
