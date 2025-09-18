package modele;

public class Cocktail {
	
	protected String nom;
	protected String alcool;
	
	public Cocktail(String nom, String alcool) {
		super();
		this.nom = nom;
		this.alcool = alcool;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAlcool() {
		return alcool;
	}
	public void setAlcool(String alcool) {
		this.alcool = alcool;
	}

	
	

}
