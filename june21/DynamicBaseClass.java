package june21;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.java.Before;

public class DynamicBaseClass {
	public EdgeDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}

}