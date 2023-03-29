//Link:-https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

class Solution
{
    public static void sort012(int a[], int n)
    {
        int start =0;
        int mid=0;
        int end=a.length-1;
        while (mid<=end)
        {
            if(a[mid]==0)
            {
                swap(a,start,mid);
                start++;
                mid++;
            }
            else if (a[mid]==2)
            {
                swap(a,mid,end);
                end--;
            }
            else 
                mid++; 
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
