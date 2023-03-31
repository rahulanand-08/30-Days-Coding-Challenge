//Link:-https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long sum=0;
        long maxsum=Long.MIN_VALUE;
        for (int i:arr)
        {
            sum=sum+i;
            if (sum>maxsum)
            maxsum=sum;
            if (sum<0)
            sum=0;
        }
        return maxsum;
    }
    
}
