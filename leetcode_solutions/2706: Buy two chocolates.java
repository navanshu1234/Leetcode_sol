class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int sum = 0;
        int x = 0;
        ArrayList<Integer> ot = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j = n-1;j>=0;j--)
            {
                if(i!=j){
                sum = prices[i] + prices[j];
                
                ot.add(sum);
                }
                
            }
        }
        int min = 1000000;
        for(int i=0;i<ot.size();i++)
        {
            if(sum>=(ot.get(i)))
            {
                sum = ot.get(i);
            }
        }
        
        min = sum - money;
        if(min>=0 && sum<=money)
        {
            return min;
        }
        else if(min<0 && sum<=money)
        {   if(min<0 && money-sum > 0)
             {
                return money-sum;
            }
            return 0;
        }
        

        return money;
    }
}
