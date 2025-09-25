package data;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LangageDAO {
	
	// TODO : Retourner une liste d'objets Langage
	public void listerLangages()
	{
		System.out.println("LangageDAO.listerLangages()");
		
		String URL_LANGAGES = "https://api.jsonbin.io/v3/b/68bb8d32ae596e708fe43553";
		String json = "";
		try {
			URL url = new URL(URL_LANGAGES);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			//System.out.println(json);
			lecteur.close();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		JsonParser parseur = new JsonParser();
		JsonObject document = parseur.parse(json).getAsJsonObject();
		
		JsonArray listeLangages = document.get("record").getAsJsonObject().get("langages").getAsJsonArray();
		
		for(int position = 0; position < listeLangages.size(); position++)
		{
			JsonObject langageJson = listeLangages.get(position).getAsJsonObject();
			
			String nom = langageJson.get("nom").getAsString();
			int creation = langageJson.get("année_création").getAsInt();
			String createur = langageJson.get("créateur").getAsString();
			String popularite = langageJson.get("popularité").getAsString();
			System.out.println(nom);
			System.out.println(creation);
			System.out.println(popularite);
			
			System.out.print("Paradigmes : ");
			JsonArray paradigmes = langageJson.get("paradigme").getAsJsonArray();
			for(int positionParadigmes = 0; positionParadigmes < paradigmes.size(); positionParadigmes++)
			{
				String paradigme = paradigmes.get(positionParadigmes).getAsString();
				System.out.print(paradigme + " ");
			}
			System.out.println("");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
