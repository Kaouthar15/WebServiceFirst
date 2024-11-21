package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="team")
@XmlAccessorType(XmlAccessType.FIELD)
public class Team {
	
	@XmlAttribute
	private Long id;
	
	
	@XmlElement(name = "nom")
	private String nom;

	@XmlElementWrapper(name = "members")
	@XmlElements({
		@XmlElement(name="developer",type = Developer.class),
		@XmlElement(name="junior",type = Junior.class),
		@XmlElement(name = "senior", type = Senior.class ) })
	private List<Developer> members = new ArrayList<Developer>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Developer> getMembers() {
        return members; 
    }

    public void setMembers(List<Developer> members) {
        this.members = members;
    }

}
