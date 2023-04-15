public class BinarySearchUsingRecursion 
{
	
	public static int binarysearch(int a[],int s,int e,int key)
	{
		int mid=s+(e-s)/2;
		
		if(a[mid]==key)
			return mid;
		if(s>e)
			return -1;
		
		
		 if(a[mid]<key)
			return binarysearch(a,mid+1,e,key);
		else
			return binarysearch(a,s,mid-1,key);

	}

	public static void main(String[] args) 
	{
		int a[]= {2,4,5,7,9};
		System.out.println(binarysearch(a,0,a.length-1,5));

	}

}
