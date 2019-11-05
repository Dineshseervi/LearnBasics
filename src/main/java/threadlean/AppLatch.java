package threadlean;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ProcessApp implements Runnable
{

    private CountDownLatch countDownLatch;

    public ProcessApp(CountDownLatch countDownLatch)
    {
        this.countDownLatch=countDownLatch;
    }

    public void run()
    {
        System.out.println("Start of process");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException interruptException)
        {
            System.out.println("Exception:" +interruptException.getMessage());
        }
        countDownLatch.countDown();
        System.out.println("end of prrocess");

    }
}
public class AppLatch {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(3);

        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i=0;i<15;i++)
        {
            executorService.submit(new ProcessApp(countDownLatch));
        }
        try {
            countDownLatch.await();
        }
        catch (InterruptedException interruptExcetion)
        {
            System.out.println("exception :"+interruptExcetion);
        }

        System.out.println("completed");
    }
}
