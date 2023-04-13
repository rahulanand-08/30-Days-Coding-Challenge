
import java.util.*;
public class solution {
	static boolean palindrome(String str, int i, int j)
	{
		if (i>j)
			return true	;
		 if (str.charAt(i)!=str.charAt(j))
			return false;
		else 
			return palindrome(str,i+1,j-1);
	}
	
	public static void main(String[] args) 
	
	{
		boolean palin=palindrome("nitin",0, 4);
        System.out.println(palin);
	}
}
