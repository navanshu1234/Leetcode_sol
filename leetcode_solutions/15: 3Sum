class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);
       int n = nums.length;
       int sum =0;
       int x = 0;
       for(int i =0;i<n;i++)
       {
           for(int j =0;j<n;j++)
            {
                for(int k =0;k<n;k++)
                {
                    if(i!=j && j!=k && k!= i)
                    {
                        sum = nums[i] + nums[j] + nums[k];
                        if(sum == 0)
                        {
                            List<Integer> ans1 = new ArrayList<>();
                            ans1.add(nums[i]);
                            ans1.add(nums[j]);
                            ans1.add(nums[k]);
                            if (!ans.contains(ans1)) {
                            ans.add(ans1);}
                        }
                    }
                }
            }
       }
       return ans;
    }
}
