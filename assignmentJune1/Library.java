package assignmentJune1;

public class Library {
	
	public String addbook(String Booktitle)
	{
		return Booktitle;
	}
	public void issuebook()
	{
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library bookpay=new Library();
		//Passing seleniumbook value to the method addbook
		String addedbook=bookpay.addbook("Seleniumbook");
		System.out.println(addedbook);
		bookpay.issuebook();
	}
}
