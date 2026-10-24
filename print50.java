class div_3 implements Runnable{
  public void run()
  {
    for(int i = 1 ; i <= 50 ; i++)
        {
            if(i % 3 == 0 )
            {
                System.out.println(i + " ");
            }
        } 
  }
}

class prime implements Runnable{
  public void run()
  {
    
    for(int i = 1 ; i <= 50 ; i++)
        {
            int cnt = 0 ;
            for(int j = 2 ; j < i ; i++)
            {
                if(i % j == 0 )
                {
                   cnt++; 
                   break;
                }
            }
            if(cnt == 0)
            {
                System.out.println(i);
            }
        } 
  }
}
class div_7 implements Runnable{
    public void run()
    {
        for(int i = 1 ; i <= 50 ; i++)
        {
            if(i % 7 == 0 )
            {
                System.out.println( (i * 3));
            }
        }
    }
}

class print50 {
    public static void main(String[] args)  throws InterruptedException{
        div_3 d = new div_3();
        Thread d1 = new Thread(d);

        div_7 div = new div_7();
        Thread d2 = new Thread(div);

        prime p = new prime();
        Thread p1 = new Thread(p);

        d1.start();
        d1.join();
        d2.start();
        d2.join();
        p1.start();
        

    }
}
