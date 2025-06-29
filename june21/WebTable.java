package june21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		//getting the URL
		driver.get("https://erail.in/");
		//Maximise the window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//From Station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		//To Station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		//unselect the sort on date check box
		WebElement cb= driver.findElement(By.id("chkSelectDateOnly"));
if(cb.isSelected())
{
cb.click();
	}
//Retrieve Train names from the web table
List<WebElement> TrainElements=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
List<String>TrainName=new ArrayList<>();
List<String>duplicate=new ArrayList<>();
for(int i=0;i<TrainElements.size();i++)
{
	TrainName.add(TrainElements.get(i).getText());
}
System.out.println("List of TrainNames:"+TrainName);

for(int i=0;i<TrainName.size();i++)
{
	for (int j=i+1;j<TrainName.size();j++)
	{
		if(TrainName.get(i).equals (TrainName.get(j)))
		{
			if(!duplicate.contains(TrainName.get(i)))
			{
				duplicate.add(TrainName.get(i));
			}
		}
	}
	
}
System.out.println("The duplicate Train names:"+duplicate);
	   
	if(duplicate.isEmpty())
	{
		System.out.println("No duplicates found");
	}
	else
	{
		System.out.println("duplicates are found");
	}
 }
}
