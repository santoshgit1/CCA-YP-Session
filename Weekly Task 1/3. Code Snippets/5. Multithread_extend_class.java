
import java.util.*;

 //class -1 ------------------------------------
class multhr extends Thread
{  
    @Override
    public void run() //  Should use run() method to use multithreading. 
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
    }
}

 
//class -2  ------------------------------------
class Multithread_ext_Thread
{
      public static void main(String args[]) 
      {
            multhr obj  = new multhr();
            multhr obj1 = new multhr();
            multhr obj2 = new multhr();

            obj.start();
            obj1.start();
            obj2.start();
      }
}