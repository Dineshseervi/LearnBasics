package threadlean;

public class AppSync {

    private  Integer count=0;


    public synchronized void increment()
    {
        count++;
    }
    public static void main(String[] args) {
            AppSync appSync=new AppSync();
            appSync.threadObjects();
    }

    public void threadObjects()
    {
        Thread thread1=new Thread(new Runnable() {
            public void run() {
                for (int i=0;i<1000;i++)
                {
                   increment();
                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            public void run() {
                for (int i=0;i<1000;i++)
                {
                    increment();
                }
            }
        });


        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException ie)
        {
            System.out.println("InterruptedException");
        }


        System.out.println("count value: "+count);
    }
}
