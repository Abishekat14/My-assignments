package homeAssignmentJune8;
//Text field - Child
public class TextField extends WebElement {
	public void getText()
	{
		System.out.println("return text");
	}

	public static void main(String[] args) {
		TextField t=new TextField();
		t.getText();
t.click();

	}

}
