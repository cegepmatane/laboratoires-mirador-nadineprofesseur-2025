package data;

public class BarbareDAO {
	
	// TODO : creer objet et retourner
	public void detaillerBarbare()
	{
		System.out.println("BarbareDAO.detaillerBarbare()");
		
		String URL_BARBARE = "https://www.dnd5eapi.co/api/2014/classes/barbarian";
		String json = Telechargeur.telecharger(URL_BARBARE);
		System.out.println(json);
	}

}
