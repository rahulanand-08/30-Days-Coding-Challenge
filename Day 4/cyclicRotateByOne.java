//Link:- https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int temp[]=new int[n];
        for (int i=0;i<n;i++)
        {
            temp[(i+1)%n]=arr[i];
        }
        int j=0;
        for (int i:temp)
        {
            arr[j]=i;
            j++;
        }
    }
}
