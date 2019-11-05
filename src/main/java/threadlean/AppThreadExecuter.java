package threadlean;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ProcessThread implements Runnable
{

    private Integer i;
    public ProcessThread(Integer i)
    {
        this.i=i;
    }
   public void run()
   {
       System.out.println("Starting id :"+i);
try {
    Thread.sleep(5000);
}
catch (InterruptedException e)
{
    System.out.println("exception "+e.getMessage());
}

       System.out.println("complete id :"+i);
   }
}

public class AppThreadExecuter {


    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for (int i=0 ;i<10 ;i++)
        {
            executorService.submit(new ProcessThread(i));
        }

executorService.shutdown();
        System.out.println("All task are submitted");

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        }
        catch (InterruptedException  exception)
        {
            System.out.println("exception while execution");
        }
        System.out.println("all task are completed");
    }



}
