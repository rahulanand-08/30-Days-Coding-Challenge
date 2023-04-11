//Link:-https://leetcode.com/problems/find-greatest-common-divisor-of-array/submissions/

class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            if(max < nums[i]) max = nums[i];
            else if(min > nums[i]) min = nums[i];
        }
        
        return getGCD(max, min);
    }

    public int getGCD(int a, int b)
    {
        if(a==b) return a;
        
        if(a>b) return getGCD(a-b, a);
        return getGCD(a, b-a);
    }
    
}
