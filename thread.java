/* by extending thread class */
class A extends Thread 
{
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
            System.out.println("Abhi");
            Thread.sleep(1000); //milli second 
            }
        }
        catch(InterruptedException i)
        {

        }
    }
}
class B
{
    public static void main(String[] args) throws InterruptedException {
        A t=new A();
        t.start();  // TOTAL OUTPUT CAME IN 5 SECONDS

        for(int i=1;i<=5;i++)
        {
            System.out.println("Ankush");
            Thread.sleep(1000);
        }
    }
}
