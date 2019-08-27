package hw1;

import java.util.*;

public class Encoding 
{
	public static void maker(int m, int n, String that, Set<String> result)
	{
		if(m==0 && n==0)
		{
			result.add(that);
			return;
		}
		
		if(n==0)
		{
			maker(m-1,n,that+".",result);
			return;
		}
		if(m==0)
		{
			maker(m,n-1,that+"-",result);
			return;
		}
		
			maker(m-1,n,that+".",result);
			maker(m,n-1,that+"-",result);
	}
	
	public static Set<String> morseCodes(int m, int n)
	{
		Set<String> result = new TreeSet<>();
		maker(m,n,"", result);
		return result;
	}
	
}

