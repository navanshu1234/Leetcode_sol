class Solution {
    public static int c(int n,int r)
    {
        int c = 1;
        for(int i=0;i<r;i++)
        {
            c = (c*(n-i))/(i+1);
        }
        return c;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = numRows;
        for(int i=1;i<=n;i++)
        {   ArrayList<Integer> ar = new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                int temp = c(i-1,j-1);
                ar.add(temp);
            }
            arr.add(ar);
        }
        return arr;
    }
}
