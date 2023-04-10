//Link:-https://leetcode.com/problems/median-of-two-sorted-arrays/

import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int main[]=new int [n+m];
        int c=0;
        for (int i=0;i<n;i++)
        {
            main[c]=nums1[i];
            c++;
        }
        for (int i=0;i<m;i++)
        {
            main[c]=nums2[i];
            c++;
        }
        Arrays.sort(main);
        int mid=main.length/2;
        if (main.length%2==0)
        {
            return (double)(main[mid-1] + main[mid])/2;
        }
        else
            return main[mid];
    }
}
