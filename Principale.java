package m2i.formation.java;

import java.util.ArrayList;
import java.util.Random;

public class Principale {

	public static void main(String[] args) 
	{	
		
		Ticket t1 = new Ticket(4, 7, 16, 21, 32, 49);
		System.out.println("numéros joué : ");
		t1.Affiche();
		Tirage Loto = new Tirage();
//		System.out.println("numéros tiré : ");
//		Loto.Affiche();
//		System.out.println("");
		
//		t1.verifieLesNum(Loto);

		double prix = 0;
		int gain = 0;
		
		for(int i = 0 ; i <5 ; i ++)
		{
			System.out.println("");
			Loto.nouveauTirage();
			System.out.println("numéro tiré : ");
			Loto.Affiche();
			gain += t1.verifieLesNum(Loto);
			prix += 2.2;
			
		}
		System.out.println("");
		System.out.println("total des gains " + gain + "€");
		System.out.println("total des dépenses " + prix +"€");
		double a = gain -prix;
		if(gain - prix < 0)
			System.out.println("vous avez perdu " + -a + "€");
		else
			System.out.println("vous avez gagné " + a + "€");
	}

}


















//ArrayList<Integer> tirage = new ArrayList<Integer>();
//int compteur = 0;
//int tmp = 0;
//Random r = new Random();
//
//do {
//	tmp = r.nextInt(49) + 1;
//	if(!tirage.contains(tmp))
//	{
//		tirage.add(tmp);
//		compteur ++;
//	}
//} while (compteur <6);
//
//
//
//for(Integer i : tirage)
//{
//	System.out.println(i);
//}