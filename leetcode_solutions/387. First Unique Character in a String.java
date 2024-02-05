class Solution {
    public int firstUniqChar(String s) {
        
        int ans = -1;
        for(int i=1;i<=s.length();i++)
        {   String str = s.substring(i-1,i);
            int count = 0;
            for(int j=1;j<=s.length();j++)
        {
            String st = s.substring(j-1,j);
            if(str.equals(st))
            {
                count++;
            }
       }
       if(count == 1)
       {
           ans = s.indexOf(str);
           break;
       }
        }
        
        return ans;
    }
}
//timelimit exceed
class Solution {
    public int firstUniqChar(String s) {
        int ans =-1;
        char c[] =  s.toCharArray();
        int count[] = new int[26];
        for(int i=0;i<c.length;i++)
        {   
            ++count[c[i]-'a'];
        }
        for(int i=0;i<c.length;i++)
        {   
            if(count[c[i]-'a'] == 1)
       {
           ans =i ;
           break;
       }
        }
        return ans;
    }
}
