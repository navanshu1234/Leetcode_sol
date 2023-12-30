class Solution {
    public boolean makeEqual(String[] words) {
         int n = words.length;
         int sum = 0;
        for(int i = 0;i<words.length;i++)
        {  
           sum = sum + words[i].length();
        }
        if(sum%n == 0)
        {   if(n==2 && words[0].length()==words[1].length()){
            char[] charArray1 = words[0].toCharArray();
            char[] charArray2 = words[1].toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if(Arrays.equals(charArray1, charArray2) == true){
                return true;
            }
            return false;
        }
            return true;
        }
        return false;
    }
}
