package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.Cocktail;
import vue.VueCocktail;

public class ControleurCoktail extends Controleur {

	public ControleurCoktail()
	{
		Logger.logMsg(Logger.INFO, "new ControleurCocktail()");
	}
	public void initialiser()
	{
		Cocktail cocktail1 = new Cocktail("Margarita", "Tequila");
		Cocktail cocktail2 = new Cocktail("Mojito", "Rhum");
		Cocktail cocktail3 = new Cocktail("Cosmopolitan", "Vodka");
		Cocktail cocktail4 = new Cocktail("Old Fashioned", "Whisky");
		Cocktail cocktail5 = new Cocktail("Bloody Mary", "Vodka");
		Cocktail cocktail6 = new Cocktail("Mai Tai", "Rhum");		
		
		List<Cocktail> cocktails = new ArrayList<Cocktail>();
		cocktails.add(cocktail1);
		cocktails.add(cocktail2);
		cocktails.add(cocktail3);
		cocktails.add(cocktail4);
		cocktails.add(cocktail5);
		cocktails.add(cocktail6);
		
		//VueCocktail.getInstance().afficherCocktails(cocktails);
		
		
		
	}

}


