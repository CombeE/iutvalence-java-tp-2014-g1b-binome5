package fr.iutvalence.java.tp.abbalone;

/**
 * Creer un plateau ainsi que ses boules
 * @author combeer
 */
public class Plateau
{
	private static final int NOMBRE_DE_LIGNES = 9;
	
	private static final int NOMBRE_DE_COLONNES = 9;

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
