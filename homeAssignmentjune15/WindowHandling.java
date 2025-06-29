package homeAssignmentjune15;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	public static void main(String[] args) {
		//Initialising the chrome browser
ChromeOptions opt=new ChromeOptions();	
opt.addArguments("guest");
ChromeDriver driver=new ChromeDriver(opt);
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
// Username, password, login
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
//click on CRM/SFA and Accounts
driver.findElement(By.linkText("CRM/SFA")).click();
//Clicking contact option
driver.findElement(By.linkText("Contacts")).click();
//Clicking on merge contacts option
driver.findElement(By.linkText("Merge Contacts")).click();
//Clicking on the widget of the from contact
//attribute used is alt
driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
//Switching focus to the widget window(Child window)
//Getting the address of parent and child window via set
Set<String> allAddress = driver.getWindowHandles();
System.out.println("Address are: " + allAddress);

// Declare an empty List
//Purpose is the getting address list is possible only from list(getText)
List<String> addressList = new ArrayList<String>(allAddress);

// getTitle Before switching
String titleBeforeSwitching = driver.getTitle();
System.out.println(titleBeforeSwitching);

// Transfer the driver
driver.switchTo().window(addressList.get(1));
//Driver transferred to the widget window (child)

//Get title after switching
String titleAfterSwitching = driver.getTitle();
System.out.println(titleAfterSwitching);

//Click on the first resulting contact
driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//Switching back to the main window

driver.switchTo().window(addressList.get(0));
//Get title after switching
String titleAfterSwitching1 = driver.getTitle();
System.out.println("Child page:"+titleAfterSwitching1);

//verification completed whether the title is in parent window

//Click on the widget of the to contact
driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

// getTitle Before switching
String titleBeforeSwitching2 = driver.getTitle();
System.out.println(titleBeforeSwitching2);

//Having new address list since address values varies 
//Previous addresslist contains 2 static address
//Hence using address list new

Set<String> allAddressnew = driver.getWindowHandles();
System.out.println("Address are: " + allAddressnew);

// Declare an empty List
List<String> addressListnew = new ArrayList<String>(allAddressnew);


// Transfer the driver
driver.switchTo().window(addressListnew.get(1));

//Get title after switching
String titleAfterSwitching2 = driver.getTitle();
System.out.println("child window2"+titleAfterSwitching2);

//Click on the second resulting contact
driver.findElement(By.xpath("(//a[@class='linktext'])[2]")).click();

//Switching back to the main window
driver.switchTo().window(addressListnew.get(0));

//Clicking on the merge button
driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();

//Accept the alert
Alert simpleAlert=driver.switchTo().alert();
simpleAlert.accept();

String titleSwitching3 = driver.getTitle();
System.out.println("Result title:"+titleSwitching3);


}
}