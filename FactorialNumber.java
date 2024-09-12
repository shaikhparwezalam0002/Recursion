import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int fact(int n) {
        if (n == 1) {
            return n;
        }

        return n * fact(n - 1);
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        int n = 5;
        System.out.print(fact(n));
    }
}
