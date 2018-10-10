package de.dhbwka.java.blueprint.thread;

public class threads
{
    static Thread thread1;
    static Thread thread2;

    static int j;

    private static void print()
    {
        thread1 = new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {
                    System.out.println("Hallo i bims thread 1");
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread1.start();
    }

    private static void count()
    {
        thread2 = new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 5; i++)
                {
                    j++;
                    System.out.println(j);
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread2.start();
    }

    public static void main(String[] args)
    {
        print();
        count();
    }
}
