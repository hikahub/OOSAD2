package Singleton.Singleton;

public class Driver {
	public static void main(String[] args)
	{
		for(int i = 0; i < 10;i++)
		{
			Singleton instance = Singleton.Intance();
		}
		System.out.println("Singleton value: " + Singleton.getInvokeCount());

	}
	
}
