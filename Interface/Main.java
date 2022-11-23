interface Mail
{
 	void register();
 	void valid();
}

class Yahoo implements Mail
{
 	public void register() 
 	{ 
  		System.out.println("  Yahoo registration");    
 	}
 	public void valid() 
 	{ 
 		System.out.println("  Yahoo validation");    
 	}
}
class Main
{
 	public static void main(String aa[])
 	{
  		Mail ob1=new Yahoo();
  		ob1.register();
  		ob1.valid();
 	}
}