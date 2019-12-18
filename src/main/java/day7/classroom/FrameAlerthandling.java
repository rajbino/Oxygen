package day7.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlerthandling {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Maximize the browser
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[.='Try it']").click();
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Rajbino");
		alert.accept();
			
		WebElement gettxt= driver.findElementByXPath("//p[@id='demo']");
		 String content= gettxt.getText();
		if (content.contains("Rajbino"))
		{
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
		
		driver.switchTo().defaultContent();
		
		
	
		
		

	}

}
