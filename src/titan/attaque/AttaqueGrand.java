package titan.attaque;

import mur.Mur;
/**
 * Pattern Strategy
 * Classe utilisée lorsque le titan est plus grand que le mur
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
