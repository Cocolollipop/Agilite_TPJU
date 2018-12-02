package titan.attaque;

import mur.Mur;
import titan.Titan;

/**
 * Pattern Strategy Cette classe est utilisee par un titan
 * 
 * @author Cocolollipop
 *
 */
public class Attaque {

	private AttaqueImpl implementation;
	private Titan titan;

	public Attaque(Titan titan) {
		this.titan = titan;

	}

	/**
	 * Le titan attaque le mur
	 * @param mur
	 * @return
	 */
	public String performAttaque(Mur mur) {
		return implementation.attaqueMur(mur);
	}

	/**
	 * Le titan evalue sa capacité d'attaque
	 * 
	 * @param mur
	 */
	public void evaluerMur(Mur mur) {

		if (titan.getTaille() == mur.getTaille()) {
			implementation = new AttaqueImpl();
		} else if (titan.getTaille() < mur.getTaille()) {
			implementation = new AttaquePetit();
		} else if (titan.getTaille() > mur.getTaille()) {
			implementation = new AttaqueGrand();
		}

	}

}
