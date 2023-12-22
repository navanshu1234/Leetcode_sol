class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);
       int n = nums.length;
       int sum =0;
       int x =0;
       
       for(int i =0;i<n;i++)
       {
           for(int j =1;j<n;j++)
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
                            Collections.sort(ans1); 
                            if (!ans.contains(ans1)) {
                            ans.add(ans1);
                            x--;}
                        }
                    }
                }
            }
       }
       return ans;
    }
} 
// time limit exceed

/*python code:
class Solution(object):
    def threeSum(self, nums):
        ans = []
        nums.sort()
        n = len(nums)
        sum_val = 0
        x = 0

        for i in range(n):
            for j in range(1, n):
                for k in range(n):
                    if i != j and j != k and k != i:
                        sum_val = nums[i] + nums[j] + nums[k]
                        if sum_val == 0:
                            ans1 = [nums[i], nums[j], nums[k]]
                            ans1.sort()
                            if ans1 not in ans:
                                ans.append(ans1)
                                x -= 1

        return ans
        
*/
// time limit exceed case 286
