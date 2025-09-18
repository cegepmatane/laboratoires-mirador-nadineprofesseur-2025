
import java.util.List;

import architecture.Controleur;
import architecture.Fenetre;
import data.NouvelleDAO;
import modele.Nouvelle;
import modele.Pays;
import vue.VueAmis;
import vue.VueCocktail;
import vue.VueMessages;
import vue.VueMirador;
import vue.VueNouvelles;
import vue.VueNumerique;

public class App {

	public static void main(String[] parametres) {
		
		
		//Pays pays = new Pays();
		//pays.setNom("Quebec");
		
		//Controleur.choisirVuePrincipale(VueMirador.class);
		//Controleur.choisirVuePrincipale(VueCocktail.class);
		Controleur.choisirVuePrincipale(VueNouvelles.class);
		Fenetre.launch(Fenetre.class, parametres);	
		
	}

}
