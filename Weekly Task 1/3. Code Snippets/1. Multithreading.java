
// New -> Runnable -> Non-Runnable -> Running -> Terminated.
// Start() -> To initialize run() method.

class multithread extends Thread 
{
      @Override
      public void run() 
      {
            System.out.println("Thread is running...");
      }

      public static void main(String args[]) 
      {
            multithread thread1 = new multithread();
            thread1.run();  //Acts as Normal Method.
            thread1.start(); //Acts as Thread Method.
      }
}
