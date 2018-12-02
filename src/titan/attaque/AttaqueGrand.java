package titan.attaque;

import mur.Mur;
/**
 * Pattern Strategy
 * Classe utilisée lorsque l'attaque est importante
 * @author Cocolollipop
 *
 */
public class AttaqueGrand extends AttaqueImpl {
	
	@Override
	public String attaqueMur(Mur mur) {
		mur.setTaille(0);
		return "Attaque : Super efficace";
	}
	


}
