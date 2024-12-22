class BMSCE extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("BMSCE");
            try{Thread.sleep(10000);}
            catch(InterruptedException e){}
        }
    }
}
class CSE extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("CSE");
            try{Thread.sleep(2000);}
            catch(InterruptedException e){}
        }
    }
}
class Multithreads
{
    public static void main(String args[])
    {
        BMSCE b=new BMSCE();
        CSE c=new CSE();
        b.start();
        c.start();
        try{Thread.sleep(50000);}
        catch(InterruptedException e){}
        System.out.println("Name: Namita");
        System.out.println("USN: 1BM23CS202");
    }
}