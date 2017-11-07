package redbus.group.id.redbus.artifactid;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class redBusClass1Test {
	
	@Test(priority=1)
	public void testCase1() throws Throwable
	{		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madankumar\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<10;i++)
		{
			
				System.out.println("Print");
				Thread.sleep(1000);
				i++;
				
			
		}
		
		driver.manage().window().maximize();
		
		System.out.println("Making change to module1");
		
		Dimension windhand= driver.manage().window().getSize();
		
		
	}

}
