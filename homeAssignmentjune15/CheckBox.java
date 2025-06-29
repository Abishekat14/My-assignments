package homeAssignmentjune15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		//Initialising the chrome browser
		ChromeOptions opt11=new ChromeOptions();	
		opt11.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt11);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//Click on the basic checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Click on the notification check box
		//driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div")).click();
		//Verifying notifictiion
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String Verify=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(Verify);
		if(Verify.contains("Checked"))
{
System.out.println("Verified");
}
		else
		{
			System.out.println("Not verified");
		}
Thread.sleep(5000);
//Click on your favourite check box
driver.findElement(By.xpath("//label[text()='Java']")).click();
Thread.sleep(5000);
//Click on the tri state check box
driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
//Verify which tristate option is choosen
String message=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
System.out.println("The choosen option is:"+message);
Thread.sleep(5000);
//Clicking on toggle switch
driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
//Printing toggle message
String toggle=driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();
System.out.println("The choosen option is:"+toggle);
Thread.sleep(5000);
//Verifying if a checkbox is disabled
WebElement checkbox=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
boolean verification = checkbox.isEnabled();
System.out.println(verification);
Thread.sleep(5000);
//Select multiple options on the page
driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
driver.findElement(By.xpath("//label[text()='Miami']/preceding-sibling::div")).click();
driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div")).click();
driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
