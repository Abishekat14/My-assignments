package methodOverloading;

public class ApiClient {
	//Same method but with different parameters
	public void sendRequest(String endpoint)
	{
		System.out.println("Endpoint is:"+ endpoint);
	}
	public void sendRequest(String endpoint,String requestBody, String requestStatus)
	{
		System.out.println("Endpoint is:"+endpoint);
		System.out.println("Request body is:"+requestBody);
		System.out.println("Value is:"+requestStatus);
	}
	public static void main(String[] args) {
		
		{
			ApiClient apc=new ApiClient();
			//captures the method according to the values entered
			apc.sendRequest("https://www.testleaf.com");
			apc.sendRequest("https://www.testleaf.com","john","True");
		}

	}

}
