package june21;

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
		driver.findElement(By.id("username")).sendKeys("abishektest14@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Abis1401@1997");
		
				//Maximise the window
		driver.manage().window().maximize();
		}

	@AfterMethod
	public void postCondition()
	{
driver.quit();
	}
	
	

}
