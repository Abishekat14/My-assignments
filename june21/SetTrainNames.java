package june21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SetTrainNames {

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
		Set<String> TrainName = new HashSet<String>();
		Set<String>Duplicate  = new HashSet<String>();
		
		for(int i=0;i<TrainElements.size();i++)
		{
			String Traindata = TrainElements.get(i).getText();
			if (TrainName.contains(Traindata)) {
				
                Duplicate.add(Traindata);
            } 
			
			else 
			{	
                TrainName.add(Traindata);
            }
        }
			
		}
	


	}

