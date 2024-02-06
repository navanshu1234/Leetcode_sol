class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String out = String.valueOf(c);
            if(!hm.containsKey(out))
            {
                hm.put(out,new ArrayList<>());
            }
            hm.get(out).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
