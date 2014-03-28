package fr.iutvalence.java.tp.abbalone;

/**
 * definit le deroulement d'une partie d'Abalone
 * @author combeer
 */
public class Abalone
{
	
	private static final int NOMBRE_DE_JOUEURS = 2;

	private final Joueur[] joueurs;

	private Plateau plateau;
	
	private int boulesNoiresSorties;
	private int boulesBlanchesSorties;

	// TODO écrire un commentaire plus précis (done)
	/**
	 * démarre une partie d'Abalone (pour 2 joueurs)
	 */
	public Abalone()
	{
		this.joueurs = new Joueur[NOMBRE_DE_JOUEURS];
		joueurs[0] = new Joueur();
		joueurs[1] = new Joueur();
		this.plateau = new Plateau();
		
	}
	
	
	
	/**
	 * Lance une partie d'Abalone
	 */
	public void jouer()
	{
		int numeroDuJoueur = 0;
		
		while (true)
		{
			Joueur joueurCourant = this.joueurs[numeroDuJoueur];
			
			if (unJoueurAGagne()) break;
			Mouvement mouvement;
			while (true)
			{
				mouvement = joueurCourant.obtenirMouvement();
				if (this.estMouvementValide(mouvement)) break;
			}
			deplacerBoules();
			
		
			numeroDuJoueur = (numeroDuJoueur +1 ) % NOMBRE_DE_JOUEURS;
			
		}
	}



	private boolean estMouvementValide(Mouvement mouvement)
	{
		if (mouvement.nbrBoulesSelectionnees>3)
			return false;
		return true;
	}




	private void deplacerBoules()
	{
		// TODO Auto-generated method stub
		
	}



	private boolean unJoueurAGagne()
	{
		if ((boulesNoiresSorties==7) || (boulesBlanchesSorties==7))
		{
			return true;
		}
		return false;
	}



	@Override
	public String toString()
	{
		
		return this.plateau.toString();
	}
	
	
}
