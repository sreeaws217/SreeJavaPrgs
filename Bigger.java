import java.lang.*;
import java.util.*;

class Bigger

{
    public static void main(String args[])
     { 
    int a,b,c,d,e,x;
    
    Scanner SC = new Scanner(System.in);
    
    System.out.print("Enter a..");
    a=SC.nextInt();

    System.out.print("Enter b..");
    b=SC.nextInt();

    System.out.print("Enter c..");
    c=SC.nextInt();
    System.out.print("Enter d..");
    d=SC.nextInt();

    System.out.print("Enter e..");
    e=SC.nextInt();
    
  x = a;
  
  if(b>x)
  x=b;
  if(c>x)
  x=c;
  if(d>x)
  x=d;
  if(e>x)
  x=e;
  
  
  System.out.println(x +"is bigger");
  
     }
}
     
  
    
