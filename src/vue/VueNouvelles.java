package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurNouvelles;
import javafx.scene.control.Label;
import modele.Nouvelle;

public class VueNouvelles extends Vue {

	protected ControleurNouvelles controleur = null;
	protected static VueNouvelles instance = null; 
	public static VueNouvelles getInstance() {if(null==instance)instance = new VueNouvelles();return VueNouvelles.instance;}; 

	private VueNouvelles() {
		super("nouvelles.fxml", VueNouvelles.class);
		Logger.logMsg(Logger.INFO, "new VueNouvelles()");
		super.controleur = this.controleur = new ControleurNouvelles();
	}

	public void afficherNouvelles(List<Nouvelle> nouvelles) {
		int position = 0;
		for(Nouvelle nouvelle : nouvelles)
		{
			position++;
			if(position > 3) break;		// on sait que on a 3 espaces
			
			String idTitre = "#nouvelle-titre-" + position;
			Label vueTitre = (Label) lookup(idTitre);
			vueTitre.setText(nouvelle.getTitre());
			
			String idAuteur = "#nouvelle-auteur-" + position;
			Label vueAuteur = (Label) lookup(idAuteur);
			vueAuteur.setText(nouvelle.getAuteur());			
		}
	}
	

}
