package threadlean;


class A
{

}

class B{

}

public class DeadLoackCondition {
    /*public static void main(String[] args) {

        A a=new A();
        B b=new B();

        Thread threadOne=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b)
                {
                    try {
                        Thread.sleep(1000);
                        System.out.println(" thread one ,synch a");
                    }catch (InterruptedException e)
                    {
                        System.out.println("error :"+e.getMessage());
                    }

                    synchronized (a)
                    {
                        System.out.println(" thread one ,synch b");
                    }
                }
            }
        });

        Thread threadTwo=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b)
                {
                    try {
                        Thread.sleep(100);
                        System.out.println(" thread Two ,synch a");
                    }catch (InterruptedException e)
                    {
                        System.out.println("error :"+e.getMessage());
                    }

                    synchronized (a)
                    {
                        System.out.println(" thread Two ,synch b");
                    }
                }
            }
        });

        threadOne.start();
        threadTwo.start();
    }*/
}
