class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=1;i<flowerbed.length;i++)
        {   
            if((flowerbed[0]==0 && flowerbed[1]==0) || (flowerbed[i]==0 && i == flowerbed.length-1 && flowerbed[i-1]==0))
            {
                flowerbed[0] = 1;
                n--;
            }
            else if(i!=flowerbed.length-1){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i] = 1;
                n--;
            }}
        }
        if(flowerbed.length==1 && flowerbed[0]==0)
            {
                flowerbed[0] = 1;
                n--;
            }
        System.out.println(Arrays.toString(flowerbed));
        if(n<=0)
        {
            return true;
        }
        return false;
    }
}
