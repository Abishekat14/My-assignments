package homeAssignmentjune1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Opening Facebook URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Account setup
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Abi");
		driver.findElement(By.name("lastname")).sendKeys("shek");
		driver.findElement(By.name("reg_email__")).sendKeys("abisheksriram97@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Leaf@1997");
		
		//Selecting Date
		WebElement date1=driver.findElement(By.id("day"));
		Select obj4=new Select(date1);
		obj4.selectByContainsVisibleText("14");
		
		//Selecting Month
		WebElement Month1=driver.findElement(By.id("month"));
		Select obj5=new Select(Month1);
		obj5.selectByContainsVisibleText("Jan");
		
		//Selecting Year
		WebElement Year1=driver.findElement(By.id("year"));
		Select obj6=new Select(Year1);
		obj5.selectByContainsVisibleText("1997");
		
		//Radio button select
		//input[@id='sex'][2]
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex'][2])"));
		gender.click();
	}

}
