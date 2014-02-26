package fr.iutvalence.java.tp.abbalone;

// TODO écrire un commentaire plus précis

/**
 * Creer un plateau ainsi que ses boules
 * @author combeer
 */
public class Plateau
{
	// TODO écrire un commentaire
	private static final int NOMBRE_DE_LIGNES = 9;

	// TODO écrire un commentaire
	private static final int NOMBRE_DE_COLONNES = 9;

	// TODO écrire un commentaire
	// TODO définir les valeurs possibles par des constantes
	private int[][] etatDesCases;

	/**
	 * Creer un plateau de jeu (constitue d'une grille et de 14 boules
	 * blanches plus 14 boules noires.
	 */
	public Plateau()
	{
		this.etatDesCases = new int[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
		for (int nombre_ligne=0; i<NOMBRE_DE_LIGNES*NOMBRE_DE_COLONNES; i++)
		{
		EtatDesCases[i] = new Lampe();
		}
	}
}
