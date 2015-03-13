package Singleton.Singleton;

public class Singleton {
	private static Singleton instance = null;
	private static int noOfInstance = 0;
	private static int invokeCount = 0;
	private Singleton(){}
	public static int getNoOfInstance()
	{
		return noOfInstance;
	}
	public static int getInvokeCount()
	{
		return invokeCount;
	}
	public static Singleton Instance(){
		if(null == instance){
			noOfInstance++;
			invokeCount++;	
			instance = new Singleton();
		}else{
			invokeCount++;
		}
		return instance;
	}
}
