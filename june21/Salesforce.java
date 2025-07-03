package june21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod {

		@Test
		//pointing app launcher
		public void appLauncher ()
		{
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		// Click Legal Entities
        WebElement LegalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
        driver.executeScript("arguments[0].click();",LegalEntities);
        //choosing New  
    
        driver.findElement(By.xpath("//a[@title='New']")).click();
        
        //Click on the company name
       
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Salesforce");
        	
        //Enter the name in the description
        driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Sample");
        
        
        //click on the status dropdown
        WebElement dropdownIcon = driver.findElement(By.xpath("//lightning-icon[contains(@class, 'slds-input__icon_right') and @icon-name='utility:down']"));
        driver.executeScript("arguments[0].click();",dropdownIcon);
        //Choose active
        driver.findElement(By.xpath("//span[text()='Active']")).click();
        //Choose save
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        
        //Verify Alert message
        WebElement txt=driver.findElement(By.xpath("//strong[text()='Review the following fields']"));
       String verification= txt.getText();
       
       if(verification.contains("Review the following fields"))
       {
    	   System.out.println("successfull");
       }
    	   else
    	   {
    		   System.out.println("unsuccessfull");
       }
  
        
        
}
}