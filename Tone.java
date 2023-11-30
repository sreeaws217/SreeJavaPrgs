import java.lang.*;
import java.Util.*;
class TOne extends Thread

{
    public void run()
    {
        System.out.println("Thread Running");
    }
}
class Main    
{
    public static void main(String[] args)
  {  
    TOne T = new TOne();
    
    T.start();
  }
}