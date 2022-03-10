package com.esiee.biblio.model;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="auteur">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="presentation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parution" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="colonne" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="rangee" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "titre",
        "auteur",
        "presentation",
        "parution",
        "colonne",
        "rangee"
})
public class Livre {

    @XmlElement(required = true)
    protected String titre;
    @XmlElement(required = true)
    protected String auteur;
    @XmlElement(required = true)
    protected String presentation;
    @XmlSchemaType(name = "unsignedShort")
    protected int parution;
    @XmlSchemaType(name = "unsignedByte")
    protected int colonne;
    @XmlSchemaType(name = "unsignedByte")
    protected int rangee;

    public Livre() {}

    public Livre(String titre, String auteur, String presentation, int parution, int colonne, int rangee) {
        this.titre = titre;
        this.auteur = auteur;
        this.presentation = presentation;
        this.parution = parution;
        this.colonne = colonne;
        this.rangee = rangee;
    }

    /**
     * Gets the value of the titre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Sets the value of the titre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitre(String value) {
        this.titre = value;
    }

    /**
     * Gets the value of the auteur property.
     *
     * @return
     *     possible object is
     *     {@link Auteur }
     *
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Sets the value of the auteur property.
     *
     * @param value
     *     allowed object is
     *     {@link Auteur }
     *
     */
    public void setAuteur(String value) {
        this.auteur = value;
    }

    /**
     * Gets the value of the presentation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPresentation(String value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the parution property.
     *
     */
    public int getParution() {
        return parution;
    }

    /**
     * Sets the value of the parution property.
     *
     */
    public void setParution(int value) {
        this.parution = value;
    }

    /**
     * Gets the value of the colonne property.
     *
     */
    public int getColonne() {
        return colonne;
    }

    /**
     * Sets the value of the colonne property.
     *
     */
    public void setColonne(int value) {
        this.colonne = value;
    }

    /**
     * Gets the value of the rangee property.
     *
     */
    public int getRangee() {
        return rangee;
    }

    /**
     * Sets the value of the rangee property.
     *
     */
    public void setRangee(int value) {
        this.rangee = value;
    }

}