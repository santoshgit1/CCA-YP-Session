
import java.util.*;

 //class -1 ---------------------------------------------
class multhr1 implements Runnable
{  
    @Override
    public void run()
    {                                         
      try
      {
            for(int i=0; i<2; i++)
            {
               System.out.println(i + " Thread: " + Thread.currentThread().getId());
            }
      }
      catch( Exception e)
      {
            System.out.println(e);
      }

// Thread t3 = Thread.currentThread(); sysout(t3);
    }
}

//class -2 ----------------------------------------------
class Multithread_imp_Thread
{
      public static void main(String args[]) 
      {
            multhr1 obj   = new multhr1();
            multhr1 obj1  = new multhr1();
            multhr1 obj2  = new multhr1();

            Thread t  = new Thread(obj);
            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t.start(); 
            try
            {
                  t.join();
            }
            catch(Exception e)
            {
                  System.out.println(e);
            }
            t1.start();
            t2.start();
      }
}