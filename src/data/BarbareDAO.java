package data;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BarbareDAO {
	
	// TODO : creer objet et retourner
	public void detaillerBarbare()
	{
		System.out.println("BarbareDAO.detaillerBarbare()");
		
		String URL_BARBARE = "https://www.dnd5eapi.co/api/2014/classes/barbarian";
		String json = Telechargeur.telecharger(URL_BARBARE);
		//System.out.println(json);
		
		JsonParser parseur = new JsonParser();

		JsonObject document = parseur.parse(json).getAsJsonObject();
		int deDeVie = document.get("hit_die").getAsInt();
		
		System.out.println("Dé de vie : " + deDeVie);
		JsonObject choix = (JsonObject) document.get("proficiency_choices").getAsJsonArray().get(0).getAsJsonObject();
		String choixDescription = choix.get("desc").getAsString();
		System.out.println(choixDescription);
		JsonArray listeOptions = choix.get("from").getAsJsonObject().get("options").getAsJsonArray();
		
		for(int position = 0; position < listeOptions.size(); position++)
		{
			JsonObject option = listeOptions.get(position).getAsJsonObject();
			String nom = option.get("item").getAsJsonObject().get("name").getAsString();
			System.out.println(nom);
		}
		
		JsonArray avantages = document.get("saving_throws").getAsJsonArray();
		for(int position = 0; position < avantages.size(); position++)
		{
			JsonObject avantage = avantages.get(position).getAsJsonObject();
			String nom = avantage.get("name").getAsString();
			System.out.println(nom);
		}
		
		
		
		
		
		
		
	}

}
