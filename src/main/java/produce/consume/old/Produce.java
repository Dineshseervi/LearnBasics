package produce.consume.old;

import java.util.*;

public class Produce implements Runnable{
    private final List<Integer> sharedList;
    private final Integer MAX_SIZE;

    public Produce(List<Integer> sharedList,Integer size)
    {
        this.sharedList=sharedList;
        MAX_SIZE=size;
    }


    @Override
    public void run() {

        Random random=new Random();
        while (true) {
            try {
                produce(random.nextInt(100));
                //Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Exception :" + e.getMessage());
            }

        }
    }

    public void produce(Integer value) throws InterruptedException
    {
        synchronized (sharedList)
        {

               while (sharedList.size()==MAX_SIZE)
                {
                    System.out.println(Thread.currentThread().getName()+" MAX SIZE is reached");
                    sharedList.wait();
                }
                Thread.sleep(1000);
                sharedList.add(value);
                System.out.println(Thread.currentThread().getName()+" value added");
                sharedList.notifyAll();

        }
    }
}
