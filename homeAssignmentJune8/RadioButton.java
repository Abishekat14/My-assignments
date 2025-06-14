package homeAssignmentJune8;

public class RadioButton extends Button {
	public void selectRadioButton()
	{
		System.out.println("Radiobutton is selected");
	}

	public static void main(String[] args) {
RadioButton rb=new RadioButton();		
rb.selectRadioButton();
rb.submit();
rb.click();
rb.setText("hi");
	}

}
