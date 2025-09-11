
import architecture.Controleur;
import architecture.Fenetre;
import modele.Pays;
import vue.VueAmis;
import vue.VueMirador;

public class App {

	public static void main(String[] parametres) {
		
		Pays pays = new Pays();
		pays.setNom("Quebec");
		
		Controleur.choisirVuePrincipale(VueMirador.class);
		Fenetre.launch(Fenetre.class, parametres);	
		
	}

}
