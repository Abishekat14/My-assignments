package june21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod {

		@Test
		//pointing app launcher
		public void appLauncher ()
		{
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		// Click Legal Entities
        driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
        //choosing dropdown
        driver.findElements(By.cssSelector("a.slds-button.slds-button_reset[role='button']")).get(3).click();
        //Click on new legal entity
        driver.findElement(By.xpath("//span[text()='New Legal Entity']")).click();
        //Click on the company name
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Salesforce");
        	
        //Enter the name in the description
        driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container'])[2]")).sendKeys("Sample");
        //click on the status dropdown
        driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")).click();
        //Choose active
        driver.findElement(By.xpath("//span[text()='Active']")).click();
        //Choose save
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        //Verify complete theis field pop up appears
        WebElement errorMessage = driver.findElement(By.xpath("//span[contains(text(),'Complete this field')]"));

        if (errorMessage.isDisplayed()) {
            System.out.println("Validation message displayed: " + errorMessage.getText());
        } else {
            System.out.println("Validation message not displayed.");
        }
        
}
}