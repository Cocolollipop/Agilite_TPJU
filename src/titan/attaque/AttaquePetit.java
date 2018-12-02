package titan.attaque;

import mur.Mur;
/**
 * Pattern Strategy
 * Classe utilisée lorsque le titan est plus petit que le mur
 * @author Cocolollipop
 *
 */
public class AttaquePetit extends AttaqueImpl{
	
	@Override
	public String attaqueMur(Mur mur) {
		return "Pas très efficace";
	}
	
}
