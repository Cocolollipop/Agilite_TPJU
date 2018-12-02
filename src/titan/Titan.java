package titan;

import java.util.ArrayList;
import java.util.List;

import mur.Mur;
import titan.attaque.AttaqueImpl;
import titan.attaque.AttaqueTailleEgale;
import titan.attaque.AttaqueTailleInf;
import titan.attaque.AttaqueTailleSup;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Décrivez votre classe Titan ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Titan {

    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int taille = 5; // en metre
    private String nom = "Titan";
    private Mur frontal = new Mur();
    private Mur central = new Mur();
    private Mur intermediaire = new Mur();
    private List<Mur> listeMurs = new ArrayList<>();
    private AttaqueImpl strategieAttaque;

    /**
     * Constructeur d'objets de classe Titan
     */
    public Titan() {
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void demolirMur(Mur mur) {
        if (mur.getNom().equals("Intermediaire") && frontal.getNom().equals("Frontal")) {
            intermediaire = mur;
        }
        if (mur.getNom().equals("Centrale") && frontal.getNom().equals("Frotal") && intermediaire.getNom().equals("Intermediaire")) {
            central = mur;
        }
        if (mur.getNom().equals("Frontal")) {
            frontal = mur;
        }
        mur.setTitan(this);
    }

    public List<Mur> getMurDemoli() {
        return listeMurs;
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }

    public Mur getFrontal() {
        return frontal;
    }

    public void setFrontal(Mur frontal) {
        this.frontal = frontal;
    }

    public Mur getCentral() {
        return central;
    }

    public void setCentral(Mur central) {
        this.central = central;
    }

    public Mur getIntermediaire() {
        return intermediaire;
    }

    public void setIntermediaire(Mur intermediaire) {
        this.intermediaire = intermediaire;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param y le paramètre de la méthode
     * @return la somme de x et de y
     */
    public int sampleMethod(int y) {
        // Insérez votre code ici
        return y;
    }
    /**
     * Le titan choisit la stratégie a appliquer en fonction de la taille du mur
     * @param mur
     */
    public void evaluerMur(Mur mur) {

		if (this.getTaille() == mur.getTaille()) {
			strategieAttaque = new AttaqueTailleEgale();
		} else if (this.getTaille() < mur.getTaille()) {
			strategieAttaque = new AttaqueTailleInf();
		} else if (this.getTaille() > mur.getTaille()) {
			strategieAttaque = new AttaqueTailleSup();
		}

	}

	/**
	 * Le titan attaque 
	 * @param strategy
	 * @param mur
	 * @return
	 */
	public String attaquerMur(Mur mur){
		return strategieAttaque.detruireMur(mur);
	}
}
