
public class Cadre extends Employer {

	private double prime;
	
	// constructeur d'initialisation
public Cadre(String pNom, double pSalaire,double pPrime){
	super(pNom, pSalaire);
	prime = pPrime;
}

public double getPrime() {
	return prime;
}

public void setPrime(double prime) {
	this.prime = prime;
}

@Override
public double getSalaire() {
	return super.getSalaire() + prime;
}

@Override
public String toString() {
	return "Cadre [nom :" + super.getNom() + ". salaire :" + this.getSalaire()+"]";
}


	
}
