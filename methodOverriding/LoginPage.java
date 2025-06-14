package methodOverriding;

public class LoginPage extends BasePage {
	public void performCommonTasks()
	{
	super.performCommonTasks();	
	System.out.println("Assignment");
	}
	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.performCommonTasks();

	}

}
