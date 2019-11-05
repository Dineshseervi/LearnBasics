package produce.consume.old;

import java.util.List;

public class Consume implements Runnable {

    private final List<Integer> sharedList;

    public Consume(List<Integer> list)
    {
        sharedList=list;
    }


    @Override
    public void run() {

        while (true)
        {
            try {
                consume();
                //Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException
    {

        synchronized (sharedList)
        {

                while (sharedList.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() +"LIST is empty");
                    sharedList.wait();
                }

                Thread.sleep(1000);
                Integer value=sharedList.remove(0);
                System.out.println(Thread.currentThread().getName()+" removed: "+value);
                sharedList.notifyAll();

        }
    }
}
