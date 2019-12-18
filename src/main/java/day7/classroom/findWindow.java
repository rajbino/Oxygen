package day7.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class findWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Maximize the browser
		driver.get("http://leafground.com/pages/Window.html");
		driver.findElementByXPath("//button[.='Open Multiple Windows']").click();
		
		Set<String> windowhandle = driver.getWindowHandles();
	   List<String> getwindow= new ArrayList<>(windowhandle);
	   System.out.println(getwindow.size());
	   String secondwind= getwindow.get(2);
	   driver.switchTo().window(secondwind);
	   String title= driver.getTitle();
	   System.out.println(title);
		
	   driver.quit();
	
		
		
		
		

	}

}
