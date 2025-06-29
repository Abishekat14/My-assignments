package june21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DynamicParameter extends DynamicBaseClass {

	@DataProvider(name="logindata")
	public String[][] setDatas()
			{
		String[][]details=new String[1][2];
		details[0][0]="DemoSalesManager";
		details[0][1]="crmsfa";
		return details;
	
			}
@Test(dataProvider="logindata")
	public void enterLeadData(String username,String password)
	{
	driver.get("https://testleaf.com");
	
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
}

