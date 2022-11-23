interface Mail
{
 	void register();
}

class Test
{
	void display()
	{
		Mail ob = new Mail() 
		{
			public void register()
			{
				System.out.println(" Anonymous Sub-Class ");
			}			
		};

		ob.register();		
	}
}



class Main3
{
 	public static void main(String aa[])
 	{
		new Test().display();
 	}
}