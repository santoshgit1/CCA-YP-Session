
import java.util.*;

class multhr1 implements Runnable
{  
    @Override
    public void run()
    {     
//  Thread t3 = Thread.currentThread();
//  sysout(t3);

      try
      {
            for(int i=0; i<=3; i++)
            {
               System.out.println(i + " Thread: " + Thread.currentThread().getId());
               Thread.sleep(1000);  // thread waits for 1000 milli sec b/w each thread excution.
            }
      }
      catch( Exception e)
      {
            System.out.println(e);
      }
    }
}
 
class Multi_imp_Thr_sleep
{
      public static void main(String args[]) 
      {
            multhr1 obj   = new multhr1();
            multhr1 obj1  = new multhr1();

            Thread t  = new Thread(obj);
            Thread t1 = new Thread(obj1);

            t.start(); 
            t1.start();
      }
}