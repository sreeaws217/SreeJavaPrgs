import java.lang.*;
import java.util.*;
class AryMaxMin
{
	public static void main(String[] args)
	{
	    
	    int a[]=new int[5];
	    a[0]=10;
	    a[1]=20;
	    a[2]=30;
	    a[3]=40;
	    a[4]=50;
	    
	    int i=0, max=a[0], min=a[i];
	    double avg;
	    
	for(i=0; i<a.length; i++)
	{
		System.out.print(a[i]+"\t");
		if (a[i]>max)
		max = a[i];
		else if (a[i]< min)
		min = a[i];
	}	
	
	System.out.println();
	System.out.println("Max num =" + max);
	System.out.println("Min Num =" + min);
	
	
 }
}
