package humain;

import java.util.ArrayList;
import java.util.List;

import faune.Animal;

public class Homme {
	
	private String nom;
	private List<Animal> mesAnimaux;
	
	public Homme(){
		this.nom = "Jonh";
		this.mesAnimaux = new ArrayList<Animal>();
		
	}
	
	public Homme(String nom){
		this.nom = nom;
	}
	
	public void adopterAnimal(Animal animal){
		if(this.getMesAnimaux().contains(animal)){
			throw new IllegalArgumentException();
		}
		else{
		this.mesAnimaux.add(animal);
		animal.setProprietaire(this);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Animal> getMesAnimaux() {
		return mesAnimaux;
	}

	public void setMesAnimaux(List<Animal> mesAnimaux) {
		this.mesAnimaux = mesAnimaux;
	}

}
