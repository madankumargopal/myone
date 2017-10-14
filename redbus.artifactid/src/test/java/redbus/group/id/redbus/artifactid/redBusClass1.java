package redbus.group.id.redbus.artifactid;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class redBusClass1 {
	
	@Test(priority=1)
	public void testCase1()
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madankumar\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<10;i++)
		{
			if (js.executeScript("return document.readyState").toString().equals("complete"))
			{
				break;
			}
			else
			{
				i++;
			}
		}
		
		
	}

}
