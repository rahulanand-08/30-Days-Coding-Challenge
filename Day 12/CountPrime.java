//Link:-https://leetcode.com/problems/count-primes/submissions/

class Solution {
    public int countPrimes(int n) {
    boolean a[]=new boolean [n];
    long c=0;
    for(long i=2;i<n;i++)
    {
        if(a[(int)i])
        continue;
        c++;
        for(long j=i*i;j<n;j+=i)
        {
            a[(int)j]=true;
        }

    }
    return (int)c;
        
    }
}
