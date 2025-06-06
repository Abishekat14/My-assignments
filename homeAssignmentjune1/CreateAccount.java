package homeAssignmentjune1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
ChromeOptions opt=new ChromeOptions();	
opt.addArguments("guest");
ChromeDriver driver=new ChromeDriver(opt);
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
// Username, password, login
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
//click on CRM/SFA and Accounts
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
//Create Account
driver.findElement(By.linkText("Create Account")).click();
// Entering account name and description
String acc="Abishektestleafmay";
driver.findElement(By.id("accountName")).sendKeys(acc);
driver.findElement(By.name("description")).sendKeys("Selenium Automation tester");
//Select Industry
WebElement industry=driver.findElement(By.name("industryEnumId"));
Select dropdowni=new Select(industry);
dropdowni.selectByValue("IND_SOFTWARE");
//Select ownership
WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
Select dropdowno=new Select(ownership);
dropdowno.selectByVisibleText("S-Corporation");
//Select marketing campaign
WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
Select dropdownm=new Select(marketing);
dropdownm.selectByIndex(5);
//Choose state
WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
Select dropdowns=new Select(state);
dropdowns.selectByValue("TX");

//Clicking on create account button
driver.findElement(By.className("smallSubmit")).click();
String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
System.out.println(text);
if(text.contains(acc))
{
	System.out.println("Matched");
}
		

	}

}
