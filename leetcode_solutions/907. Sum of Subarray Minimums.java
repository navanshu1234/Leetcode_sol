class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n = arr.length;
       int sum = 0;
        for(int i=0;i<n;i++)
        {   ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int j=i;j<n;j++)
            {   
               ar.add(arr[j]);
               int min = Collections.min(ar);
               sum = sum + min;
            }
        }
        int mod =  (int)Math.pow(10,9) + 7;
        return sum%mod;
    }
}
//time limit exceed
