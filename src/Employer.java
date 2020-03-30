
public class Employer {

	//variable d'instance
	private String nom;
	private double salaire;
	
	// constructeur d'initialisation
	
	public Employer(String pNom, double pSalaire) {
		nom = pNom;
		salaire = pSalaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employer [nom=" + nom + ", salaire=" + salaire + "]";
	}
	
	
}
