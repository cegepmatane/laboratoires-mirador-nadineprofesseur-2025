package data;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Telechargeur {

	public static String telecharger(String url)
	{
		System.out.println("Telechargeur.telecharger("+url+")");
		String contenu = "";
		try {			
			URL urlActive = new URL(url);
			InputStream flux = urlActive.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			contenu = lecteur.next();
			lecteur.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return contenu;
	}
	
}
