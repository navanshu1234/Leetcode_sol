class Solution {
    public boolean halvesAreAlike(String s) {
        String str[] = s.split("");
        int n = str.length;
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<n/2;i++)
        {
            if(str[i].equals("o") || str[i].equals("a") || str[i].equals("i") || str[i].equals("e") || str[i].equals("u") || str[i].equals("O") || str[i].equals("A") || str[i].equals("I") || str[i].equals("E") || str[i].equals("U"))
            {
                c1++;
            }
        }
        for(int i=n/2;i<n;i++)
        {
           if(str[i].equals("o") || str[i].equals("a") || str[i].equals("i") || str[i].equals("e") || str[i].equals("u") || str[i].equals("O") || str[i].equals("A") || str[i].equals("I") || str[i].equals("E") || str[i].equals("U"))
            {
                c2++;
            }
        }
        if(c1==c2)
        {
            return true;
        }
        return false;
    }
}
