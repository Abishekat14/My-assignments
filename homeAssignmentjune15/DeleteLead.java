package homeAssignmentjune15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		//Initialiasing the browser
		ChromeOptions optionnew=new ChromeOptions();	
		optionnew.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(optionnew);
		//Opening leaftaps website
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//Post logged into leaftaps enter the user name and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Choose login option
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the link CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the lead option
        driver.findElement(By.linkText("Leads")).click();
        //Click on Find leads
        driver.findElement(By.linkText("Find Leads")).click();
        //Click on the phone
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        //Entering the phone number
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
        //Click the find leads button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        // Capture first lead id
        
        WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
		String leadID = firstLead.getText();
		System.out.println("Captured Lead ID: " + leadID);
		
		
		//Need to click the first phone number (We need to click on web element and not string)
		firstLead.click();
        //Delete the first lead
		driver.findElement(By.linkText("Delete")).click();
		//Search by the deleted lead id
		driver.findElement(By.name("id")).sendKeys(leadID);
		//Click on find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Getting and storing no records to display in one variable
		String leadresult= driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(leadresult);
		if(leadresult.contains("No records to display"))
		{
			System.out.println("leads are deleted successfully");
		}
			else
			{
				System.out.println("Leads are not deleted successfully");
			}
		driver.close();
			
		}
	
	}

//Closing the driver

