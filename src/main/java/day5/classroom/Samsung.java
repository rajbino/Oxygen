package day5.classroom;

public class Samsung extends Mobile {
	
	public void flashlight()
	{
		System.out.println("super brightness");
	}
	
	public void flashlight(String side)
	{
		
		if (side.equals("back"))
		{
			System.out.println("super brightness01");
		}
		else {
			System.out.println("normal");
		}
		
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
