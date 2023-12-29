class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            if(nums[i] == val)
            {
                continue;
            }
            nums[count] = nums[i];
            count ++;

        }
        return count;
    }
}

//how it works:
the code is storing the non target value at location starting of array and incrementing the location for next non target element
this code is then used to return the length of array up to which only contain non target element are present (it doesn't mean other index after returned length doesn't have target element)
after that the non targeted elements are transfered to new array of returned length.
// run time: 0ms (idk why(is it possible or not))
