package threadlean;

import java.util.concurrent.CountDownLatch;

public class NetworkHeathCheck extends BaseHealthCheck {

    public NetworkHeathCheck(CountDownLatch countDownLatch) {
        super(countDownLatch, "NetworkHeathCheck");
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
