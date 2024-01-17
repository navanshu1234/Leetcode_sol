class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int f[] = new int[n];
        for(int i=0;i<n;i++)
        {   if(i!=0){
            if(arr[i]==arr[i-1])
            {
                continue;
            }}
            int count = 1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            f[i] = count;
        }
        Arrays.sort(f);
        for(int i=1;i<f.length;i++)
        {    
            if(f[i]==f[i-1] && f[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
