package com.esiee.biblio.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XmlToJava {
    public static Bibliotheque convert() {
        try {
            JAXBContext jc = JAXBContext.newInstance("com.esiee.biblio.model");
            Unmarshaller unmarshaller = jc.createUnmarshaller();

            Bibliotheque bibliotheque = (Bibliotheque) unmarshaller.unmarshal(new File("Biblio.xml"));

            List<Livre> livres = bibliotheque.getLivre();
            for (int i = 0; i < livres.size(); i++) {
                Livre livre = (Livre) livres.get(i);
                System.out.println("Livre ");
                System.out.println("Titre   : " + livre.getTitre());
                System.out.println("Auteur  : " + livre.getAuteur());
                System.out.println("Parution :" + livre.getParution());
                System.out.println("Colonne: " + livre.getColonne());
                System.out.println("Rangée: " + livre.getRangee());
            }

            return bibliotheque;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
