import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int a, int y, int p) 
    {
           long res = 1;
           long x=a;
           x=x%p;

           if(x==0)
           return 0;
 
        while (y > 0) 
        {
            if ((y & 1) != 0)
                res = (res*x%p);
 
           
            y = y >> 1;
            x = ((x * x)%p); 
        }
        return (int)res ;   
    }
}
