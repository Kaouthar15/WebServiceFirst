package jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import model.Team;
import model.Developer;
import model.Junior;
import model.Senior;

public class Unmarshallers {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Team.class, Developer.class, Junior.class, Senior.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        Team team = (Team) unmarshaller.unmarshal(new File("team.xml"));

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getNom());

        for (Developer member : team.getMembers()) {
            System.out.println("Member ID: " + member.getId());
            System.out.println("Member Name: " + member.getName());
            System.out.println("Member Language: " + member.getLanguage());
            System.out.println("------");
        }
    }
}
