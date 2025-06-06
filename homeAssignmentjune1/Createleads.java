package homeAssignmentjune1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Createleads {

	public static void main(String[] args) {
		ChromeOptions opt2=new ChromeOptions();	
		opt2.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt2);
		//EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//Creating Lead
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        // Storing lead value to cross verify with the created lead value
        String acc="Testing";
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("shek");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
        driver.findElement(By.name("submitButton")).click();
        //Storing the created lead title value in a string called text
        String text = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
        System.out.println(text);
        //Comparing the stored lead title and the created lead title value
        if(text.contains(acc))
        {
        	System.out.println("Title is valid");
        }
        	else
        	{
        		System.out.println("Title is not valid");
        }
        	
        }
}
