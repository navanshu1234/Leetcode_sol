import java.lang.*;
import java.util.*;
import java.io.*;
class HelloWorld {
    public static int fact(int f)
    {   int fact = 1;
        while(f>0)
        {
            fact = fact*f;
            f--;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        float p = (fact(n)/fact(n-r));
        System.out.println(fact(n));
        System.out.println(fact(n-r));
        System.out.println("permutation="+p);
    }
}

//without fact function
import java.lang.*;
import java.util.*;
import java.io.*;
class HelloWorld {
   
    public static void main(String[] args) {
        int n = 7; //input n
        int r = 2; //input r
        int p = 1;
        if(n<r)
        {
            System.out.println("invalid");
        }
        else{
        for(int i=n;i>n-r;i--)
        {
            p = p*i;
        }
        System.out.println(p);}
    }
}
