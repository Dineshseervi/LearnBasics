package threadlean;

import java.util.concurrent.CountDownLatch;

public class DataBaseHeathCheck extends BaseHealthCheck {

    public DataBaseHeathCheck(CountDownLatch countDownLatch) {
        super(countDownLatch, DataBaseHeathCheck.class.toString());
    }

    public void verifyService() {
        System.out.println("start of service check :"+getServiceName());
        try
        {
            Thread.sleep(7000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(getServiceName() + " is UP");
    }
}
