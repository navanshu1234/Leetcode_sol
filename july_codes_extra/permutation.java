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
