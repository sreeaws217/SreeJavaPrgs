import java.lang.*;
import java.util.*;
class ArySumAvg
{
	public static void main(String[] args)
	{
	    
	    int a[]=new int[5];
	    a[0]=10;
	    a[1]=20;
	    a[2]=30;
	    a[3]=40;
	    a[4]=50;
	    
	    int i, s=0;
	    double avg;
	    
	for(i=0; i<a.length; i++)
	{
		System.out.print(a[i]+"\t");
		s= s+a[i];
	}	
	
	avg = s/a.length;
	System.out.println();
	System.out.println("Sum =" + s);
	System.out.println("Aveerage =" + avg);
	
	
 }
}
