package titan.attaque;

import mur.Mur;
/**
 * Utilisee lorsque le titan est aussi grand que le mur
 * @author Cocolollipop
 */
public class AttaqueImpl {

	public String attaqueMur(Mur mur) {
		int degat = mur.getTaille()/2;
		mur.setTaille(degat);
		
		return "Attaque : Plutôt efficace";

	}

	

}
