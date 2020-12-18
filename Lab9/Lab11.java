class NewThread implements Runnable
{ Thread t;
   NewThread()
   {
     t = new Thread(this, "NThread");
	 t.start();
   }
   
  public void run()
   {
	   try
	   {
		   for(int n=100;n>0;n--)
		   {
			 System.out.println("CSE");
			 Thread.sleep(2000);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println("Child Thread Interrupted");
	   }
	   
   }
}

class Week11Lab
{
	public static void main(String ss[])
	{
		NewThread n1=new NewThread();
		//n1.t.start();
		
		
		try
		{
			for(int n=5;n>0;n--)
			{
				System.out.println("BMS College of Engineering");
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Thread interrupted");
		}
		
	}
}
