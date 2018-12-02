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
		return "Pas efficace";
	}
	
}
