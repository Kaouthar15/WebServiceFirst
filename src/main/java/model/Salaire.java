package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Salaire {
		@XmlValue
		 private int montant ;

		public int getMontant() {
			return montant;
		}

		public void setMontant(int montant) {
			this.montant = montant;
		}
}

