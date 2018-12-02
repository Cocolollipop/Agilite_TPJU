package titan.attaque;

import mur.Mur;
/**
 * Pattern Strategy
 * Classe utilisée lorsque l'attaque est importante
 * @author Cocolollipop
 *
 */
public class AttaquePetit extends AttaqueImpl{
	
	@Override
	public String attaqueMur(Mur mur) {
		int degat = mur.getTaille()/2;
		mur.setTaille(degat);
		
		return "Attaque : Plutôt efficace";
	}
	
}
