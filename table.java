class t1 extends Thread//implements Runnable
{
    public void run()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(Thread.currentThread().getName() + "  Priority  " + Thread.currentThread().getPriority() + "   -> 3 * " + i + " = " + (3*i));
        }
    }
}
class t2 extends Thread//implements Runnable
{
    public void run()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(Thread.currentThread().getName() +  "  Priority  " + Thread.currentThread().getPriority() + "   -> 4 * " + i + " = " + (4*i));
        }
    }
}


public class table {
    public static void main(String[] args) throws InterruptedException {
       t1 table3 = new t1();
       t2 table4 = new t2();
        // Thread t1 = new Thread(table3);
        // Thread t2 = new Thread(table4);
        // t1.start();
        // t2.start();
        table3.start();
        table3.setPriority(10);
        table3.setName("Table of 3");
        table3.join();
        table4.start();
        table4.setPriority(5);
        table4.setName("table of 4");
        table4.join();
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(Thread.currentThread().getName() + "  Priority  " + Thread.currentThread().getPriority() + "  -> 5 * " + i + " = " + (5*i));
        }
        
    }
}
