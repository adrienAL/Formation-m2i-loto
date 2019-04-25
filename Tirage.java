package m2i.formation.java;

import java.util.ArrayList;
import java.util.Random;

public class Tirage 
{
	private ArrayList<Integer> tirage = new ArrayList<Integer>();
	
	public Tirage()
		{
		int compteur = 0;
		int tmp = 0;
		Random r = new Random();
	
	
		do {
			tmp = r.nextInt(49) + 1;
			if(!this.tirage.contains(tmp))
//			if(!contient(tmp, tirage))
			{
				this.tirage.add(tmp);
				compteur ++;
			}
		} while (compteur <6);
	}
	
	public void nouveauTirage()
	{
		int compteur = 0;
		int tmp = 0;
		Random r = new Random();
		tirage.clear();
	
	
		do {
			tmp = r.nextInt(49) + 1;
			if(!this.tirage.contains(tmp))
//			if(!contient(tmp, tirage))
			{
				this.tirage.add(tmp);
				compteur ++;
			}
		} while (compteur <6);
	}

	public void Affiche()
	{
		for(Integer i : tirage)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
	}


	public ArrayList<Integer> getTirage() {
		return tirage;
	}


	public void setTirage(ArrayList<Integer> tirage) {
		this.tirage = tirage;
	}
	
	
	
	
//	public static boolean contient(int nombre, ArrayList<Integer> lst) 
//	{
//		for(int i=0; i<lst.size(); i++)
//		{
//			if(nombre == lst.get(i))return true;
//		}
//		return false;
//	}
	
}
