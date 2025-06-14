package homeAssignmentJune8;

public class LoginTestData extends TestData {
	public void enterUserName()
	{
		System.out.println("Username is entered");
	}
	
	public void enterPassword()
	{
		System.out.println("password is entered");
	}

	public static void main(String[] args) {
		LoginTestData ltd=new LoginTestData();
		//Calls parent class method
		ltd.enterUserName();
		ltd.enterPassword();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
	}

}
