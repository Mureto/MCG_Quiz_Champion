import java.util.ArrayList;
import java.util.HashMap;

public class FragenKatalog {

	HashMap<String, HashMap<Integer, ArrayList<Frage>>> fragenliste = new HashMap<String, HashMap<Integer, ArrayList<Frage>>>();
	ArrayList<String> kategorien = new ArrayList<String>();
	
	public FragenKatalog()
	{
		kategorienFuellen();
		for(int i = 0; i<kategorien.size();i++)
		{
			fragenliste.put(kategorien.get(i), new HashMap<Integer, ArrayList<Frage>>());
			for(int j = 1; j<=Hauptklasse.getAnzahlschwierigkeitsgrade(); j++)
			{
				
			}
		}
	}
	
	private void kategorienFuellen()
	{
		kategorien.add("Informatik");
		kategorien.add("Sport");
		kategorien.add("Games");
		kategorien.add("Rund um die Welt");
		kategorien.add("Mathematik");
		kategorien.add("Musik");
		kategorien.add("Im Labor");
		kategorien.add("Religion");
		kategorien.add("In der Natur");
		kategorien.add("Chemie");
	}
	

	
}