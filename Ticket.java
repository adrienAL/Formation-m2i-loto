package m2i.formation.java;

import java.util.ArrayList;

public class Ticket 
{
	private ArrayList<Integer> ticket = new ArrayList<Integer>();
	
	public Ticket(int nombre1, int nombre2, int nombre3, int nombre4, int nombre5, int nombre6)
	{
		
		this.ticket.add(nombre1);
		this.ticket.add(nombre2);
		this.ticket.add(nombre3);
		this.ticket.add(nombre4);
		this.ticket.add(nombre5);
		this.ticket.add(nombre6);
	}
	
	public void Affiche()
	{
		for(Integer i : ticket)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	public int verifieLesNum(Tirage t)
	{
		int nbDeBonNum = 0 ;
		int gain = 0;
		for(int i= 0 ; i<this.ticket.size() ; i++)
		{
			if(t.getTirage().contains(this.ticket.get(i)))
				nbDeBonNum ++;
		}
		System.out.print("Vous avez: " + nbDeBonNum + " bon numéro");
		if(nbDeBonNum == 0) {
			gain = 0;
		}
		if(nbDeBonNum == 1) {
		gain = 0;
		}
		if(nbDeBonNum == 2) {
		gain = 3;
		}
		if(nbDeBonNum == 3) {
		gain = 50;
		}
		if(nbDeBonNum == 4) {
		gain = 200;
		}
		if(nbDeBonNum == 5) {
		gain = 1000;
		}
		if(nbDeBonNum == 6) {
		gain = 1_000_000;
		}
		
		return gain;
	}

}
