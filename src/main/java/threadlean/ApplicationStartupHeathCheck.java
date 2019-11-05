package threadlean;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ApplicationStartupHeathCheck {

    private CountDownLatch countDownLatch;

    private static final ApplicationStartupHeathCheck APPLICATION_STARTUP_HEATH_CHECK =new ApplicationStartupHeathCheck();
    private ApplicationStartupHeathCheck()
    {

    }

    public static ApplicationStartupHeathCheck getInstance()
    {
        return APPLICATION_STARTUP_HEATH_CHECK;
    }

    public boolean checkSystemHeath()
    {
        countDownLatch=new CountDownLatch(2);
        List<BaseHealthCheck> list=new ArrayList<BaseHealthCheck>();
        list.add(new NetworkHeathCheck(countDownLatch));
        list.add(new DataBaseHeathCheck(countDownLatch));


        Executor executor = Executors.newFixedThreadPool(list.size());

        for(final BaseHealthCheck v : list)
        {
            executor.execute(v);
        }
        try {
            countDownLatch.await();
        }
        catch (InterruptedException e)
        {
            System.out.println("InterruptedException :"+ e.getMessage());
        }

        for (BaseHealthCheck baseHealthCheck:  list)
        {
            if(!baseHealthCheck.isServiceUp())
            {
                return false;
            }
        }
        return true;
    }
}
