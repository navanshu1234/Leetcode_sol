class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i =0;
        int j =0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ar = new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                if(!ar.contains(nums1[i])){
                    ar.add(nums1[i]);
                }
            }
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        int arr[] = new int[ar.size()];
        for(i=0;i<ar.size();i++)
        {
            arr[i] = ar.get(i);
        }
        return arr;
    }
}
