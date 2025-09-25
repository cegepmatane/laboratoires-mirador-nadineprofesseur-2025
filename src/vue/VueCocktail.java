package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurCoktail;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modele.Cocktail;

public class VueCocktail extends Vue {
	
	protected ControleurCoktail controleur = null;
	protected static VueCocktail instance = null; 
	public static VueCocktail getInstance() {if(null==instance)instance = new VueCocktail();return VueCocktail.instance;}; 
	
	private VueCocktail()  {
		super("cocktails.fxml", VueCocktail.class);
		Logger.logMsg(Logger.INFO, "new VueCocktail()");
		super.controleur = this.controleur = new ControleurCoktail();
	}

	public void afficherCocktails(List<Cocktail> cocktails) {

		System.out.println("VueCocktail.afficherCocktails()");
		VBox vueCocktails = (VBox) lookup("#boite-cocktails");
			//vueCocktails.getChildren().clear();
	}
	
}
