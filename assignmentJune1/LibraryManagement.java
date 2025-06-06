package assignmentJune1;

public class LibraryManagement {

	public static void main(String[] args) {
		//create an object with another class and calling the methods from that class
		Library manage=new Library();
String result=manage.addbook("selenium");
System.out.println(result);
		manage.issuebook();
	}
}
