package threadlean;

import java.util.concurrent.CountDownLatch;

public abstract class BaseHealthCheck implements Runnable {

    private CountDownLatch countDownLatch;
    private String serviceName;
    private boolean isServiceUp;

    public BaseHealthCheck(CountDownLatch countDownLatch, String serviceName) {
        this.countDownLatch = countDownLatch;
        this.serviceName = serviceName;
        this.isServiceUp = false;
    }

    public void run() {
        try {
            verifyService();
            isServiceUp=true;
        }
        catch (Throwable t)
        {
            isServiceUp=false;
            System.out.println( "exception "+t.getMessage());
        }
finally {
            countDownLatch.countDown();
        }


    }

    public abstract void verifyService();

    public String getServiceName() {
        return this.serviceName;
    }

    public boolean isServiceUp() {
        return this.isServiceUp;
    }
}
