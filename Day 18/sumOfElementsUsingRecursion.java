
import java.util.*;
public class solution {
	static int sum=0;
	static int arrsum(int arr[], int n)
	{
		if (n==0)
			return 0;
		else 
			sum=sum+arr[n-1];
		 arrsum(arr,n-1);
		 return sum;
	}
	
	public static void main(String[] args) 
	
	{
		int arr[]= {2,3,4,5};
        System.out.println(arrsum(arr,4));
	}
}
