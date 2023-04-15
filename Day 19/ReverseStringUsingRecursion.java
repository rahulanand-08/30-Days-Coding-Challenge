
import java.util.*;
public class solution {
	static String sum="";
	static String arrsum(String str, int n)
	{
		if (n==0)
			return "";
		else 
			sum=sum+str.charAt(n-1);
		 arrsum(str,n-1);
		 return sum;
	}
	
	public static void main(String[] args) 
	
	{
		String str="Rahul";
        System.out.println(arrsum(str,5));
	}
}
