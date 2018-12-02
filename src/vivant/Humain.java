package vivant;

public class Humain extends EtreVivant {
	
	public enum Sexe{
		FEMELLE,MALE;
	}
	
	private String villeDeNaissance;
	private int taille;
	private String nom;
	private Sexe sexe;
	
	protected Humain(){
		super();
		this.villeDeNaissance = "Inconnu";
		this.taille = -1;
		this.nom = "Inconnu";
		this.sexe = Sexe.FEMELLE;
		
	}
	Humain(String villeDeNaissance, int taille, String nom, Sexe sexe){
		super();
		this.villeDeNaissance = villeDeNaissance;
		this.taille = taille;
		this.nom = nom;
		this.sexe = sexe;
		
	}
	
	public String getVilleDeNaissance() {
		return villeDeNaissance;
	}
	public void setVilleDeNaissance(String villeDeNaissance) {
		this.villeDeNaissance = villeDeNaissance;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Sexe getSexe() {
		return sexe;
	}
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	
	public String courir(){
		return "Je cours comme un humain";
	}

}
