package Week03.Assignments;

public class Desktop implements Hardware,Software {

	
	public void desktopModel()
	{
		System.out.println("DesktopModel:A3452");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop des = new Desktop();
		des.desktopModel();
		des.hardwareResource();
		des.softwareResource();

	}



	public void softwareResource() {
		// TODO Auto-generated method stub
		System.out.println("Software Resource");
		
	}



	public void hardwareResource() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resource");
		
	}

}
