//Link:-https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1


class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        if (n == 1 || n == 0)
            return true;
        if (arr[n-1] < arr[n-2])
            return false;
        return arraySortedOrNot(arr,n-1);
    }
}
