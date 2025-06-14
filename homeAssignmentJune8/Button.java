package homeAssignmentJune8;

public class Button extends WebElement {
	public void submit()
	{
		System.out.println("submit completed");
	}
	public static void main(String[] args) {
		Button b=new Button();
		//Calling method from webelement (parent class) and in its own class
		b.submit();
		b.click();
		b.setText("java");
	}

}
