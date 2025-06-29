package june14Assignments;

public class AdvancedJavaConnection extends MySqlConnection {

	public void connect() {
		System.out.println("Connection is done");
	}

	public void disconnect() {
		System.out.println("Disconnection in progress");
		
	}

	public void executeUpdate() {
		System.out.println("Execution in progress");
	}
public static void main(String[] args) {
AdvancedJavaConnection ajc=new AdvancedJavaConnection();
ajc.connect();
ajc.disconnect();
ajc.executeUpdate();
}
}

