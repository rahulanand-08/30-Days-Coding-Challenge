//Link:- https://leetcode.com/contest/biweekly-contest-101/problems/form-smallest-number-from-two-digit-arrays/


class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
	        int min1=Integer.MAX_VALUE;
	        int min2=Integer.MAX_VALUE;
	        int min3=Integer.MAX_VALUE;
	        for (int i:nums1)
	        {
	            list.add(i);
	            if (i<min1)
	            	min1=i;
	        }
	        for (int i:nums2)
	        {
	            if (list.contains(i))
	            {
	            	if (i<min3)
	            		min3=i;
	            }
	                
	            if(i<min2)
	            	min2=i;
	        }
	        if (list.contains(min3))
	        	return min3;
	        else if( min1*10+min2 < min2*10+min1)
	        	return min1*10+min2;
	        else 
            return min2*10+min1;
	    }
}
