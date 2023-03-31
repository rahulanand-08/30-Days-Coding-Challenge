//Link:- https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> set=new HashSet<>();
        for (int i:a)
        {
            set.add(i);
        }
        for (int i:b)
        {
            set.add(i);
        }
        return set.size();
    }
}
