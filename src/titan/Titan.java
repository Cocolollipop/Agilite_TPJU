package titan;

import java.util.ArrayList;
import java.util.List;

import mur.Mur;
import titan.attaque.Attaque;

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
    private Attaque skillAttaque;

    /**
     * Constructeur d'objets de classe Titan
     */
    public Titan() {
    }

    public void setTaille(int taille) {
        this.taille = taille;
        setSkillAttaque(new Attaque(this));
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

	public Attaque getSkillAttaque() {
		return skillAttaque;
	}

	public void setSkillAttaque(Attaque skillAttaque) {
		this.skillAttaque = skillAttaque;
	}
}
