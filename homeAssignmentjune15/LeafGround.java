package homeAssignmentjune15;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGround {

	public static void main(String[] args) {
		//Initialising the chrome browser
				ChromeOptions opt10=new ChromeOptions();	
				opt10.addArguments("guest");
				ChromeDriver driver=new ChromeDriver(opt10);
				
				driver.get("https://leafground.com/button.xhtml");
				driver.manage().window().maximize();
				//click on the button with text click and confirm the title
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				//Getting current page title
				String pageTitle = driver.getTitle();
				System.out.println(pageTitle);
				if(pageTitle.contains("Dashboard"))
				{
					System.out.println("title is valid");
				}
				else
				{
					System.out.println("title is invalid");
				}
				//Switching to the previous page
                driver.navigate().back();
				
				//Confirm if the button is disabled option is "disabled
				WebElement disabledbutton=driver.findElement(By.xpath("//span[text()='Disabled']/parent::button"));
				//verifying if the button is disabled or enabled
				System.out.println(disabledbutton.isEnabled());
				
				//Printing position of the button with the text submit
				WebElement button= driver.findElement(By.xpath("//span[text()='Submit']/parent::button[1]"));
				//predefined syntax for getting the location
				//using point class
				Point position=button.getLocation();
				System.out.println("Horizontal button position is:"+position.getX());
				System.out.println("Vertical button position is"+position.getY());
				
				//Find and print the background color of the button with the text ‘Find the Save button color.’
				WebElement buttonColour=driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
				String bgColor = buttonColour.getCssValue("background-color");
				System.out.println("Button colour is:"+bgColor);
				
				//Printing the height and width of the button
				WebElement length=driver.findElement(By.xpath("//span[text()='Image']/parent::button"));
				//Using Dimension class to get the button size
				Dimension buttonSize=length.getSize();
				System.out.println("Width of the button is"+" "+buttonSize.getWidth());
				System.out.println( "Height of the button is"+" "+buttonSize.getHeight());
				//Closing the browser
				driver.quit();
				

				
				

	}

}