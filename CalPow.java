import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.print(pow(2,5));
    }
}


