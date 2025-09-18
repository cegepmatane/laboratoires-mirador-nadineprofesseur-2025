package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import data.NouvelleDAO;
import modele.Nouvelle;
import vue.VueNouvelles;

public class ControleurNouvelles extends Controleur {

	public ControleurNouvelles()
	{
		Logger.logMsg(Logger.INFO, "new ControleurNouvelles()");
	}
	public void initialiser()
	{		
		/*Nouvelle nouvelle1 = new Nouvelle("Le projo est brisé","Nad","Blabla","9 septembre");
		Nouvelle nouvelle2 = new Nouvelle("Le nouveau local est super","Nad","Blablabla","9 septembre");
		Nouvelle nouvelle3 = new Nouvelle("JavaFX est fantastique","Nad","Blablabla","9 septembre");
				
		List<Nouvelle> nouvellesFraiches = new ArrayList<Nouvelle>();
		nouvellesFraiches.add(nouvelle3);
		nouvellesFraiches.add(nouvelle2);
		nouvellesFraiches.add(nouvelle1);
		*/
		
		NouvelleDAO nouvelleDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvelleDAO.listerNouvelles();
	
		//for(Nouvelle nouvelle:nouvelles)
		//{
		//	System.out.println(nouvelle.getTitre());
		//}
		
		VueNouvelles.getInstance().afficherNouvelles(nouvelles);
	}

}
