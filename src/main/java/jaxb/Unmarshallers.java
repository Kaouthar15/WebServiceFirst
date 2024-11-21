package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Developer;

public class Unmarshallers  {
	public static void main(String[] args) throws JAXBException{
		 JAXBContext context = JAXBContext.newInstance(Developer.class);
		 
		 Unmarshaller unmarshaller = context.createUnmarshaller();
		 
		 Developer kaoutar = (Developer)unmarshaller.unmarshal(new File("kaouthar.xml")) ;
		 System.out.println("Id = " + kaoutar.getId());
		 System.out.println("Name = " + kaoutar.getName());
		 System.out.println("Language = "+ kaoutar.getLanguage());
		}
}
