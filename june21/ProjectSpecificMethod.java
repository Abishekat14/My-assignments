package june21;

import java.time.Duration;

import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	EdgeDriver driver=new EdgeDriver();
@BeforeMethod

	public void preCondition()
		{
		
		//getting the URL
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
				//Maximise the window
		
		}

	@AfterMethod
	public void postCondition()
	{
driver.quit();
	}
	
	

}
