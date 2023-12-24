class Solution {
    public int minOperations(String s) {
        String sc[] = s.split("");
        int n = s.length();
        int count = 0;
        for(int i =0;i<n;i++)
        {
            
                if(i!=0)
                {
                    if(sc[i].equals("0")&&sc[i-1].equals("0"))
                    {
                        sc[i] ="1";
                        count++;
                    }
                    if(sc[i].equals("1")&&sc[i-1].equals("1"))
                    {
                        sc[i] = "0";
                        count++;
                    }
                    
                }

        }
        int min = count;
        if(n-count<min)
        {
            min = n - count;
        }
        return min;
    }
}
