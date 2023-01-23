
import java.util.*;

class Multithread_Name extends Thread
{
      // Sub Method -----------------------------
      @Override
      public void run() //  Should use run() method to use multithreading.
      {      
        System.out.println("Running");  
      }

      // Main Methos -----------------------------
      public static void main(String args[]) 
      {
            Multithread_Name t1  = new Multithread_Name();
            Multithread_Name t2  = new Multithread_Name();

            t1.start();
            t2.start();

            // Set Name -------------
            t1.setName("Santosh");    
            t2.setName("Tarun");  

            // Get Name -------------
            System.out.println("After changing name (t1): "+t1.getName());  
            System.out.println("After changing name (t2): "+t2.getName());  
      }
}