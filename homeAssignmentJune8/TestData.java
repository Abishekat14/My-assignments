package homeAssignmentJune8;
//Parent class
public class TestData {
	public void enterCredentials()
	{
		System.out.println("Credential is added");
	}
	public void navigateToHomePage()
	{
		System.out.println("Redirected to home page");
	}
public static void main(String[] args) {
		
		TestData td=new TestData();
		td.enterCredentials();
        td.navigateToHomePage();
	}
}

