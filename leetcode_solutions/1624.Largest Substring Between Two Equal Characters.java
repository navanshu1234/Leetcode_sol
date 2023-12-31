class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        String sub = "";
        char[] ch = s.toCharArray();
        int n = ch.length;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>() ;
        for(int i = 0;i<s.length()/2;i++)
        {
            for(int j = s.length()-1;j>=s.length()/2;j--)
            {
                if(ch[i] == ch[j])
                {
                    sub = s.substring(i+1,j);
                    System.out.println(sub.length());
                    ans.add(sub.length());
                    count++;
                }
            }
        }
        if(count == 0)
        {
            return -1;
        }

        return Collections.max(ans);
    }
}
