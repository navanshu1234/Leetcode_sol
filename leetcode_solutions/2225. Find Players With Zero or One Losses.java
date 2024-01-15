class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ar = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        ArrayList<Integer> ar3 = new ArrayList<Integer>();
        int n = matches.length;
        for(int i=0;i<n;i++)
        {
                    arr.add(matches[i][1]);
        }
        for(int i =0;i<arr.size();i++){
        if(Collections.frequency(arr,arr.get(i))==1){
            ar1.add(arr.get(i));
             
        }
        }
        ar.add(ar1);
        for(int i=0;i<n;i++)
        {
                ar2.add(matches[i][0]);
        }
         for(int i=0;i<arr.size();i++)
        {
            if(!arr.contains(ar2.get(i))&& !ar3.contains(ar2.get(i)))
            {
                ar3.add(ar2.get(i));
            }
        }
        ar.add(0,ar3);
        Collections.sort(ar1);
        Collections.sort(ar3);
        return ar;
    }
}
// time limit exceed
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ar = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        int n = matches.length;
        
        for(int i=0;i<n;i++)
        {   boolean t = true;
            boolean t1 = true;
            for(int j=0;j<n;j++)
            {
                if(matches[i][0]==matches[j][1])
                {
                    t = false;
                }
                if(matches[i][1]==matches[j][1] && i!=j)
                {
                    t1 = false;
                }
            }
            if(t==true && !arr.contains(matches[i][0]))
            {
                arr.add(matches[i][0]);
            }
            if(t1==true && !ar1.contains(matches[i][0]))
            {
                ar1.add(matches[i][1]);
            }
        }
        Collections.sort(ar1);
        Collections.sort(arr);
        ar.add(arr);
        ar.add(ar1);
        
        
        return ar;
    }
}
// time limit exceed
