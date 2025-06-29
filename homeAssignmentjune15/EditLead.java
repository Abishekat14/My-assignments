package homeAssignmentjune15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		//Initialising chrome driver
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
        //Click on create Lead option
        driver.findElement(By.linkText("Create Lead")).click();
        //Enter the company name
     driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
     //Enter the First name
     driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Abi");
     //Enter the Last name
     driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("shek");
     //Enter the first name local field
     driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("TestLocal");
     //Locate the department
     driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testdept");
     //Enter the description
     driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Sample description");
     //Entering the email address
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
     //State (Selecting by visible text)
     //Locating state option
     WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
     //using select we are going to view the list of options as a dropdown in state
     Select dropdowns=new Select(state);
     //Choosing newyork from the list of visible texts
     dropdowns.selectByVisibleText("New York");
     //Choose create via xpath
     driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
     //Choosing edit
     driver.findElement(By.linkText("Edit")).click();
     //Clear description
     driver.findElement(By.id("updateLeadForm_description")).clear();
     //Enter the important note
     driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("keypoints");
     //Click on the update button
     driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
     
     //Get Title
     String pageTitle=driver.getTitle();
System.out.println(pageTitle);
//close browser
driver.quit();
     
	}

}
