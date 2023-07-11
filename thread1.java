/* by extending thread class */
class A extends Thread 
{
    public void fun()
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
        t.fun(); // TOTAL OUTPUT CAME IN 10 SECONDS

        for(int i=1;i<=5;i++)
        {
            System.out.println("Ankush");
            Thread.sleep(1000);
        }
    }
}
