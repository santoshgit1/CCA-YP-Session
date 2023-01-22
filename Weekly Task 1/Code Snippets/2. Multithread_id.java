
// The Value of Id generated randomly everytime. So, order wont be same each time executed.

import java.util.*;

class Multi_join extends Thread
{
      @Override // uses @override annotation, bec run() is already present internally in Thread Class.
      public void run() //  Should use run() method to use multithreading. 
      {      
            System.out.println(Thread.currentThread().getId());  //Getid()
      }

      public static void main(String args[]) 
      {
            Multi_join t1   = new Multi_join();
            Multi_join t2   = new Multi_join();
            Multi_join t3   = new Multi_join();

            t1.start(); 
            t2.start();
            t3.start();
      }
}