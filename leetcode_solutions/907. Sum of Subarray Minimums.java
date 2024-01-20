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
class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n = arr.length;
       int sum = 0;
        for(int i=0;i<n;i++)
        {   ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int j=i;j<n;j++)
            {   
               ar.add(arr[j]);
               Collections.sort(ar);
               int min = ar.get(0);
               sum = sum + min;
            }
        }
        int mod =  (int)Math.pow(10,9) + 7;
        return sum%mod;
    }
}
//time limit exceed case: 72
class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n = arr.length;
       int sum = 0;
        for(int i=0;i<n;i++)
        {   ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int j=i;j<n;j++)
            {   
               ar.add(j,arr[j]);
                min = ar.get(0);
               if(ar.size()>1)
               {
                   if(ar.get(j)<min))
                   {
                       min = ar.get(j);
                   }
               }

               sum = sum + min;
            }
        }
        int mod =  (int)Math.pow(10,9) + 7;
        return sum%mod;
    }
}
/* Another approach:
    find all subarray(contigous) (the subarray division is similar to all sub string finding of a string, You can also try this question by converting given array to string and divide them into substring using s.substring(i,j+1) to get all contigous substring), size= (n*(n+1))/2 and add to arraylist which is added to list of arraylist
    then find all min in List and add them;
    then divide by modulo 
