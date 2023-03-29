//Link:-https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start/2);
        while (start<=end)
        {
            if (arr[mid]==target)
                return mid;
            else if (arr[mid]<target)
                start=mid+1;
            else 
                end=mid-1;
            mid=start+(end-start/2);
        }
        return start;
    }
}
