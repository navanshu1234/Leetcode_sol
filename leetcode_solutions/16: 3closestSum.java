class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
                for(int j=0;j<n;j++)
            {
                    for(int k=0;k<n;k++)
                {   
                    if( i!=j && j !=k && k!=i)
                    {   
                        sum = nums[i] + nums[j] + nums[k];
                        if(!arr.contains(sum)){
                        arr.add(sum);}
                        
                    }
                }   
            }
        }
        int cs = 0;
        int min = 100000;
        for (int i = 0; i < arr.size(); i++) {
            int current = Math.abs(arr.get(i) - target);
            if (current < min) {
                min = current;
                cs = arr.get(i);
            }
        }

        return cs;
        }
    
    }

//time limit exceed
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        int k=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
                for(int j=1;j<n;j++)
            {       
                    if( i!=j && j !=k && k!=i)
                    {   
                        sum = nums[i] + nums[j] + nums[k];
                        if(!arr.contains(sum)){
                        arr.add(sum);}
                        
                    }
                    k++;
                }
            k = 0;   
            
        }
        int cs = 0;
        int min = 100000;
        for (int i = 0; i < arr.size(); i++) {
            int current = Math.abs(arr.get(i) - target);
            if(arr.get(i) == target)
            {
                return arr.get(i);
            }
            if (current < min) {
                min = current;
                cs = arr.get(i);
            }
        }

        return cs;
        }
    
    }
