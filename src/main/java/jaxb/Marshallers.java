package jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import model.Developer;
import model.Developer.Language;
import model.Team;
import model.Junior;
import model.Salaire;
import model.Senior; 

public class Marshallers {
    public static void main(String[] args) throws JAXBException {
        Developer developer1 = new Developer();
        Salaire salaire = new Salaire();
        salaire.setMontant(1000);
        developer1.setSalaire(salaire);
        developer1.setId(13L);
        developer1.setName("Kaouthar");
        developer1.setLanguage(Language.JAVA);

        Junior junior1 = new Junior();
        Salaire salaire1 = new Salaire();
        salaire1.setMontant(2000);
        junior1.setSalaire(salaire1);
        junior1.setId(14L);
        junior1.setName("Ali");
        junior1.setLanguage(Language.Python);

        Senior senior1 = new Senior();
        Salaire salaire2 = new Salaire();
        salaire2.setMontant(3000);
        senior1.setSalaire(salaire2);
        senior1.setId(15L);
        senior1.setName("Ahmed");
        senior1.setLanguage(Language.SCALA);

        Team team = new Team();
        team.setId(1L);
        team.setNom("Tech Team");
        team.getMembers().add(developer1);
        team.getMembers().add(junior1);
        team.getMembers().add(senior1);

        JAXBContext context = JAXBContext.newInstance(Team.class, Developer.class, Junior.class, Senior.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output", true) ;

        marshaller.marshal(team, new File("team.xml"));
    }
}
