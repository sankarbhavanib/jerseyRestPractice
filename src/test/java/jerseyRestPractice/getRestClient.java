package jerseyRestPractice;

import org.testng.annotations.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class getRestClient {

@Test	
public void getStation() throws Exception {
	Client client = Client.create();
	WebResource webResource = client.resource("http://www.mastertheboss.com/");
	ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

	if (response.getStatus() != 200) {
	   throw new RuntimeException("Failed : HTTP error code : "
		+ response.getStatus());
	}

	String output = response.getEntity(String.class);

	System.out.println("Output from Server .... \n");
	System.out.println(output);
}
	
}
