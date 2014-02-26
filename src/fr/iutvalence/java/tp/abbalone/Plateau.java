package fr.iutvalence.java.tp.abbalone;

// TODO écrire un commentaire plus précis (done)

/**
 * Creer un plateau ainsi que les boules à leur place initiale 
 * @author combeer
 */

public class Plateau
{
	// TODO écrire un commentaire (done)
	
	/**
	 * Initie le nombre de lignes d'un plateau d'Abalone
	 */
	private static final int NOMBRE_DE_LIGNES = 9;

	// TODO écrire un commentaire (done)
	
	/**
	 *  Initie le nombre de colonnes d'un plateau d'Abalone
	 */
	private static final int NOMBRE_DE_COLONNES = 9;
	
	/**
	 * valeur d'une case noire
	 */
	private static final int NOIRE = -1;
	/**
	 * valeur pour une case blanche
	 */
	private static final int BLANCHE = 1;
	/**
	 * valeur pour une case vide
	 */
	private static final int VIDE = 0;
	/**
	 * valeur d'une case invalide (qui n'est pas comprise sur le plateau
	 */
	private static final int INVALIDE = 2;
	
	
	/**
	 * Creer un plateau de jeu (constitue d'une grille et de 14 boules
	 * blanches plus 14 boules noires.
	 */
	public Plateau()
	{
		// TODO écrire un commentaire (done)
		
		// TODO définir les valeurs possibles par des constantes (done)
		/**
		 * L'état d'occupation des cases
		 */
		int[][] etatDesCases=
		{
			{VIDE, VIDE, VIDE, BLANCHE, BLANCHE, INVALIDE, INVALIDE, INVALIDE, INVALIDE},
			{VIDE, VIDE, VIDE, VIDE, BLANCHE, BLANCHE, INVALIDE, INVALIDE, INVALIDE},
			{VIDE, VIDE, VIDE, VIDE, BLANCHE, BLANCHE, BLANCHE, INVALIDE, INVALIDE},
			{NOIRE, VIDE, VIDE, VIDE, VIDE, BLANCHE, BLANCHE, BLANCHE, INVALIDE},
			{NOIRE, NOIRE, NOIRE, VIDE, VIDE, VIDE, BLANCHE, BLANCHE, BLANCHE},
			{INVALIDE, NOIRE, NOIRE, NOIRE, VIDE, VIDE, VIDE, VIDE, BLANCHE},
			{INVALIDE, INVALIDE, NOIRE, NOIRE, NOIRE, VIDE, VIDE, VIDE, VIDE},
			{INVALIDE, INVALIDE, INVALIDE, NOIRE, NOIRE, VIDE, VIDE, VIDE, VIDE},
			{INVALIDE, INVALIDE, INVALIDE, INVALIDE, NOIRE, NOIRE,VIDE, VIDE, VIDE}
		};
			
	}
}