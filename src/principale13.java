import java.util.ArrayList;


public class principale13 {

	public static void main(String[] args) {
ArrayList <Employer> salaires = new ArrayList<Employer>();
		
Employer p01 = new Employer ("lea Dupond",1200);
salaires.add(p01);
		
		Employer p02 = new Employer ("Régis Durant", 1250);
		salaires.add(p02);
	
		Cadre p03 = new Cadre ("Marie Martin", 2100, 215);
		salaires.add(p03);
	
	for(int i = 0; i < salaires.size(); i++){
		System.out.println(salaires.get(i).toString()+ "\n");
	}
	}

}
