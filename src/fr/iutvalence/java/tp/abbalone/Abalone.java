package fr.iutvalence.java.tp.abbalone;

/**
 * definit le deroulement d'une partie d'Abalone
 * @author combeer
 */
public class Abalone
{
	
	private Joueur joueur1;
	private Joueur joueur2;
	private Plateau plateau;

	// TODO écrire un commentaire plus précis (done)
	/**
	 * démarre une partie d'Abalone (pour 2 joueurs)
	 */
	public Abalone()
	{
		//this.joueur1 = new Joueur();
		//this.joueur2 = new Joueur();
		this.plateau = new Plateau();
		
	}
	
	
	
	/**
	 * Lance une partie d'Abalone
	 */
	public void jouer()
	{
		while (true)
		{
			if (unJoueurAGagne()) break;
			joueurSuivant().obtenirBoulesADeplacer();
			deplacerBoules();
		}
	}



	private Joueur joueurSuivant()
	{
		return this.joueur1;
	}



	private void deplacerBoules()
	{
		// TODO Auto-generated method stub
		
	}



	private boolean unJoueurAGagne()
	{
		return false;
	}



	@Override
	public String toString()
	{
		
		return this.plateau.toString();
	}
	
	
}
