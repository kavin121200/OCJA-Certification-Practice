interface Mail1
{
 	void register();
}
interface Mail2
{
 	void register();
}

class Yahoo implements Mail1,Mail2
{
 	public void register() 
 	{ 
  		System.out.println("  Yahoo registration");    
 	}
}
class Main2
{
 	public static void main(String aa[])
 	{
  		Mail1 ob1=new Yahoo();
  		Mail2 ob2=new Yahoo();

  		ob1.register();
 		ob2.register();
 	}
}