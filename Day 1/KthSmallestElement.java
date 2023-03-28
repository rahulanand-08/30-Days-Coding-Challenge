//Link:-https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1


class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for (int i=k;i<arr.length;i++)
        {
            if (arr[i]<pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    } 
}
