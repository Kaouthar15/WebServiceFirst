package publisher;

import javax.xml.ws.Endpoint;
import webservice.PersonServiceImpl;

public class SOAPPublisher {
	public static void main(String[] args) {
			Endpoint.publish("http://localhost:8888/ws/person", 
					new PersonServiceImpl()); 
		}
} 
