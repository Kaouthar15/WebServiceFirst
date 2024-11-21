package model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="developer",namespace = "http://www.nttdata.org/cours-jaxb") 
@XmlAccessorType(XmlAccessType.FIELD)
public class Developer {
	private Salaire salaire ;
	public enum Language{
		JAVA, Python, SCALA, PHP
	}
	@XmlAttribute(name="id")
	private Long id;
	
	private String name;
	
	private Language language;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	/**
	 * @return the salaire
	 */
	public Salaire getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(Salaire salaire) {
		this.salaire = salaire;
	}

}
