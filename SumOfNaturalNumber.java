import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int naturalSum(int n,int sum) {
        if (n==0) {
            return sum;
        }
        
        sum+=n;
        return naturalSum(n-1,sum);
        
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        int sum=0;
        System.out.print(naturalSum(5,sum));
    }
}
