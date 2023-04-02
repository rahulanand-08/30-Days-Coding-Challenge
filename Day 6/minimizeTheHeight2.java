//Link:-https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        if (arr == null || n<=0) 
        return -1;
        Arrays.sort(arr);
        int min = 0,max = 0,res = 0;
        res = arr[n-1] - arr[0];
        for (int i = 1;i<n;++i){
            if (arr[i]>=k){
                max = Math.max(arr[i-1]+k,arr[n-1]-k);
                min   =Math.min(arr[i]-k,arr[0]+k);
                res = Math.min(res,max-min);
            }else 
        continue;
        }
        return res;
    }
}

