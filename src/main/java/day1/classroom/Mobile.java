package day1.classroom;

public class Mobile {
	
	
	
	
	
	public void makeCall(String name)
	{
		System.out.println(name);
	
		
	}
	
	public void sendSMS()
	{
		System.out.println("GoodMorning");
	
		
	}
	
	public boolean shutDown()
	{
		System.out.println("browser closed");
		return true;	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile test = new Mobile();
		test.makeCall("hai");
		test.sendSMS();
		test.shutDown();
		
	}

}
