package homeAssignmentJune8;

public class CheckBoxButton extends Button {
	public void clickCheckButton()
	{
		System.out.println("click the button");
	}

	public static void main(String[] args) {
		CheckBoxButton cb=new CheckBoxButton();
		//Calling method from button as well as from web element and in its own class
		cb.clickCheckButton();
		cb.submit();
		cb.click();
		cb.setText("India");

	}

}
