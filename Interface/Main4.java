interface Mail
{
 	void register();
 	void valid();
}


class Main4
{
 	public static void main(String aa[])
 	{
  		Mail ob1=new Mail()
		{
		 	public void register() 
 			{ 
		  		System.out.println("  Unknown registration");    
		 	}
		 	public void valid() 
		 	{ 
		 		System.out.println("  Unknown validation");    
		 	}
		};

  		ob1.register();
  		ob1.valid();
 	}
}