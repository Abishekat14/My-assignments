package homeAssignmentjune15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt12=new ChromeOptions();	
		opt12.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt12);
		//getting the URL
		driver.get("https://leafground.com/radio.xhtml");
		//Maximise the window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//choosing the most favourite browser
		driver.findElement(By.xpath("(//label[text()='Firefox']/preceding-sibling::div)[1]")).click();
		Thread.sleep(5000);
		
		
		
		//2.Click on the radio button then click on same radio button
		//Locating the location of chrome available under most favourite browser and clicking on it
	 WebElement sel=driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']"));
	 //Clicking on that
		sel.click();
		Thread.sleep(5000);
		//Again clicking
		sel.click();
		Thread.sleep(5000);

		//Now the option chrome is selected. Since radio button are validated via input, locating the input element and using isSelected to verify it is selected or not
		//Storing the location where chrome is present
		//isSelected is used for only input
		WebElement radio=driver.findElement(By.xpath("//input[@id='j_idt87:console1:0']"));
		//verifying whether selected or unselected
		if(radio.isSelected())
		{
			System.out.println("chrome is selected");
		}
		else
		{
			System.out.println("chrome is not selected");
		}
		
		//3.Identifying the default selected radio button
		//Storing the location of safari available under default radio button
		WebElement defaultradio=driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		if(defaultradio.isSelected())
		
				{
			System.out.println("Safari is selected by default");
				}
		else
		{
			System.out.println("safari is not selected");
		}
		
		
		//4.Locating age group 21-40
		WebElement age=driver.findElement(By.id("j_idt87:age:1"));
		//Verifying it is selected or not
		if(age.isSelected())
		{
			System.out.println("21-40 years is selected");
		}
		else
		{
			System.out.println("21-40 is not selected");
		}
		

	}

}
