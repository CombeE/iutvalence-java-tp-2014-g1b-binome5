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
	public static final int NOMBRE_DE_LIGNES = 9;

	// TODO écrire un commentaire (done)
	
	/**
	 *  Initie le nombre de colonnes d'un plateau d'Abalone
	 */
	public static final int NOMBRE_DE_COLONNES = 9;
	
	// TODO écrire un commentaire (done)

	// TODO définir les valeurs possibles par des constantes (done)
	/**
	 * L'état d'occupation des cases
	 */
	private Couleur[][] etatDesCases;
	
	/**
	 * Creer un plateau de jeu (constitue d'une grille et de 14 boules
	 * blanches plus 14 boules noires.
	 */
	public Plateau()
	{
		this.etatDesCases = new Couleur[][]
		{
			{Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.BLANCHE, Couleur.BLANCHE, Couleur.INVALIDE, Couleur.INVALIDE, Couleur.INVALIDE, Couleur.INVALIDE},
			{Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.BLANCHE, Couleur.BLANCHE, Couleur.INVALIDE, Couleur.INVALIDE, Couleur.INVALIDE},
			{Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.BLANCHE, Couleur.BLANCHE, Couleur.BLANCHE, Couleur.INVALIDE, Couleur.INVALIDE},
			{Couleur.NOIRE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.BLANCHE, Couleur.BLANCHE, Couleur.BLANCHE, Couleur.INVALIDE},
			{Couleur.NOIRE, Couleur.NOIRE, Couleur.NOIRE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.BLANCHE, Couleur.BLANCHE, Couleur.BLANCHE},
			{Couleur.INVALIDE, Couleur.NOIRE, Couleur.NOIRE, Couleur.NOIRE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.BLANCHE},
			{Couleur.INVALIDE, Couleur.INVALIDE, Couleur.NOIRE, Couleur.NOIRE, Couleur.NOIRE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE},
			{Couleur.INVALIDE, Couleur.INVALIDE, Couleur.INVALIDE, Couleur.NOIRE, Couleur.NOIRE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE, Couleur.VIDE},
			{Couleur.INVALIDE, Couleur.INVALIDE, Couleur.INVALIDE, Couleur.INVALIDE, Couleur.NOIRE, Couleur.NOIRE,Couleur.VIDE, Couleur.VIDE, Couleur.VIDE}
		};
			
	}


	@Override
	public String toString()
	{
		String result = "";
		
		for (int nb_ligne = 0; nb_ligne<NOMBRE_DE_LIGNES; nb_ligne++)
		{
			for (int nb_colonne = 0; nb_colonne<NOMBRE_DE_COLONNES; nb_colonne++)
			{
				if (this.etatDesCases[nb_ligne][nb_colonne] == Couleur.BLANCHE)
					result+="B";
				else
				{
					if (this.etatDesCases[nb_ligne][nb_colonne] == Couleur.NOIRE)
						result+="N";
					else
						result+=" ";
						
				}
		
			}
			result+="\n";
		}
		return result;
	}
	
	public static void modifierCases(int coord1[], int coord2[])
	{
		
	}
	
	
}