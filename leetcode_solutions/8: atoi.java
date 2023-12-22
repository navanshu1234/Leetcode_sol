// remove all print syntax
import java.util.ArrayList;

class Solution {
    public int myAtoi(String s) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i =0;i<s.length();i++)
        {
        char c = s.charAt(i);
        if(c == '-' || c == '+')
        {   
            int t = Integer.parseInt(Character.toString(c));
            ar.add(i,t);
            System.out.print(ar.get(i));
        }
        if(Character.isDigit(c) == true)
        {
            int t = Integer.parseInt(Character.toString(c));
            ar.add(i,t);
            System.out.print(ar.get(i));
        }
        if(c == ' ')
        {
            break;
        }
        }
        System.out.print(ar);
        System.out.print(ar.get(0));
        return 0;
    }
}
class HelloWorld extends Solution
{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Solution obj = new Solution();
        String s = "4193 with words";
        obj.myAtoi(s);
    }
}
