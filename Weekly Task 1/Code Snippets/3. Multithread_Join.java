
// We use join method, when we want to execute an thread first in order. (Others threads wait until completion outs its execution.)

import java.util.*;

class Multithread_join extends Thread
{  
    @Override
    public void run() //  Should use run() method to use multithreading.
    {      
      System.out.println(Thread.currentThread().getId());  
    }

      public static void main(String args[]) 
      {
            Multithread_join t1  = new Multithread_join();
            Multithread_join t2  = new Multithread_join();
            Multithread_join t3  = new Multithread_join();
            Multithread_join t4  = new Multithread_join();

            t1.start(); 

            try
            {
                  t1.join(); // Join() Method. -> Should use try catch to rectify errors.
            }
            catch(Exception e)
            {
                  System.out.println(e);
            }

            t2.start();
            t3.start();
            t4.start();
      }
}