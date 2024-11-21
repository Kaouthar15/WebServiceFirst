package jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import model.Developer;
import model.Developer.Language;;
	
public class Marshallers {
	public static void main(String[] args) throws JAXBException {
		Developer developer = new Developer();
		
		developer.setId(13L);
		developer.setName("Kaouthar");
		developer.setLanguage(Language.JAVA);
		
		JAXBContext context = JAXBContext.newInstance(Developer.class);
		
		Marshaller marshaller = context.createMarshaller();
		
//		marshaller.setProperty("jaxb.encoder", "UTF-8");
		
		marshaller.setProperty("jaxb.formatted.output", true);
		
		marshaller.marshal(developer, new File("kaouthar.xml") );
	}
}
