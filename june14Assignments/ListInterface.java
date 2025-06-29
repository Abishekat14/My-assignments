package june14Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ListInterface {

	public static void main(String[] args) {
		//launching ajio browser in Edge
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.ajio.com//");
		driver.manage().window().maximize();
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//In the search box - searching bags and clicking
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		//Clicking on the search icon at the top
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		//Choose Men under Gender (Partial text based xpath)
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		//Choose Fashion bags under category (Partial text based xpath)
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		//Counting the number of match
		//Getting the total items list and storing it in webelement
		WebElement CountElement=driver.findElement(By.xpath("//div[@class='length']/strong"));
		//Getting the total item list as a text(1337)
		String itemcount=CountElement.getText();
		//Printing the value as a text
		System.out.println("Total count results for Men and Fashion bags:"+itemcount);
		
		
		//Getting the list of brand products
		
		List<WebElement>countbrand =driver.findElements(By.xpath("//div[@class='brand']"));
		for(int i=0;i<countbrand.size();i++)
		{
			System.out.println(countbrand.get(i).getText());
		}
		
		//List of names of the bags
		List<WebElement>countbag=driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i=0;i<countbag.size();i++)
		{
			System.out.println(countbag.get(i).getText());
		}
		
		
		

	}

}
