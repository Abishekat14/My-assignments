package homeAssignmentJune8;
//Base class
public class WebElement {
	//Methods
	public void click()
	{
		System.out.println("click the option");
	}
	public void setText(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		WebElement w=new WebElement();
		w.click();
	w.setText("Hello");		
	}
}
