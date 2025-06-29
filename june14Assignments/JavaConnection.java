package june14Assignments;

public class JavaConnection implements DatabaseConnection{
	public void update1()
	{
		System.out.println("update is in progress");
	}

	public void connect() {
		System.out.println("Connection is done");
	}

	public void disconnect() {
		System.out.println("Disconnection in progress");
		
	}

	public void executeUpdate() {
		System.out.println("Execution in progress");
	}
		
public static void main(String[]args)
{
	JavaConnection jc = new JavaConnection();
	jc.connect();
	jc.disconnect();
jc.executeUpdate();
jc.update1();
}
		
	}

