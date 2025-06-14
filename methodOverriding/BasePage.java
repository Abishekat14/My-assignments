package methodOverriding;
// Same method in both parent and child class
//Child overrides parent method and also calls parent method via super keyword

public class BasePage {
	public void findElement()
	{
		System.out.println("Findelement");
	}
	public void clickElement()
	{
		System.out.println("clickelement");
	}
	public void enterText()
	{
		System.out.println("Text is entered");
	}
	public void performCommonTasks()
	{
		System.out.println("Do the common tasks");
	}

	public static void main(String[] args) {
		BasePage bp=new BasePage();
		bp.clickElement();
	}

}
