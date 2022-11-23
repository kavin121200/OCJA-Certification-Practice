interface Mail1
{
 	void register();
}

class Sample 
{
	void test()
	{
		new Mail1()
		{
 			public void register() 
 			{ 
  				System.out.println("  Anonymous registration  ");    
 			}			
		}.register();
	}
}

interface Mail2
{
 	void register();
}

class Yahoo implements Mail1,Mail2
{
 	public void register() 
 	{ 
  		System.out.println("  Yahoo registration  ");    
 	}
}
class Main5
{
 	public static void main(String aa[])
 	{
  		Mail1 ob1=new Yahoo();
  		Mail2 ob2=new Yahoo();

  		ob1.register();
 		ob2.register();

		new Sample().test();

 	}
}