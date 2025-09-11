package modele;

public class Pays {
	
	protected String nom;
	protected String region;
	protected String monnaie;
	protected int aire;
	protected boolean independant;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getMonnaie() {
		return monnaie;
	}
	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	public int getAire() {
		return aire;
	}
	public void setAire(int aire) {
		this.aire = aire;
	}
	public boolean isIndependant() {
		return independant;
	}
	public void setIndependant(boolean independant) {
		this.independant = independant;
	}

	
	
}
