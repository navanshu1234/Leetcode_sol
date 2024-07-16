import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        String n = "15E";
        int ans = 0;
        int len = n.length();
        int rem =0;
        for(int i=n.length()-1;i>=0;i--)
        {   char ch = n.charAt(i);
                    System.out.println(ch);
            if(ch<='9')
            {rem = (int)(ch-48);
            System.out.println("rem1="+rem);
            }
            else if(ch>='A' && ch<='F')
            {
                rem = (int)(ch-55);
                            System.out.println(rem);
            }
            else
            {
                System.out.println("Invalid hexa");
                break;
            }
            ans = ans + rem*(int)Math.pow(16,len-i-1);
                        System.out.println("ans="+ans);
            
        }
        System.out.println(ans);
    }
}
