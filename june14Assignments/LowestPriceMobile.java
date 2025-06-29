package june14Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LowestPriceMobile {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Adding implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Pointing search bar
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
//Click the search button
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//Getting all the mobile prices via xpath and passing it to webelement
List<WebElement> priceElement=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
//Declaring price list for sorting the mobile price numbers which will be used in the later part
List<Integer>pricelist=new ArrayList<>();
//Print all the mobile price numbers by getting as a text via for loop
for(int i=0;i<priceElement.size();i++)
{
	//Example first price element is **14999&$ (Removing all characters and keeping number with in double quotes)
	//Example taking i(0)=14999
	String priceText=priceElement.get(i).getText().replaceAll("[^0-9]","");
	//Current output is "14999"
	System.out.println(priceText);
	//After printing the value will be "14999"
	
	if(!priceText.isEmpty())
	{
	//Converting the string to Integer (Example "14999" to 14999)
	int price=Integer.parseInt(priceText);
	//adding price text to price (Example adding the converted number 14999 to price)
	pricelist.add(price);
}
}
//Sorting the mobile price numbers
Collections.sort(pricelist);
System.out.println("The Lowest mobile price is:"+pricelist.get(0));

	}

}
