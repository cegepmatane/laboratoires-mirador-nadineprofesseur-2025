
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
		
		NouvelleDAO nouvelleDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvelleDAO.listerNouvelles();
	
		for(Nouvelle nouvelle:nouvelles)
		{
			System.out.println(nouvelle.getTitre());
		}
		
		//Pays pays = new Pays();
		//pays.setNom("Quebec");
		
		//Controleur.choisirVuePrincipale(VueMirador.class);
		//Controleur.choisirVuePrincipale(VueCocktail.class);
		//Controleur.choisirVuePrincipale(VueNouvelles.class);
		//Fenetre.launch(Fenetre.class, parametres);	
		
	}

}
