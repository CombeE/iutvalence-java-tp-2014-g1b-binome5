package fr.iutvalence.java.tp.abbalone;

/**
 * Représente un plateau d'Abalone
 * @author combeer
 */

public class Plateau
{	
	/**
	 * Nombre de lignes
	 */
	public static final int NOMBRE_DE_LIGNES = 9;
	
	/**
	 *  Nombre de colonnes
	 */
	public static final int NOMBRE_DE_COLONNES = 9;
	
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
	
	// TODO commentaire ?
	public Couleur obtenirEtatDeLaCase(Position pos)
	{
		return this.etatDesCases[pos.obtenirNumeroLigne()][pos.obtenirNumeroColonne()];
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
	
	// TODO commentaire ?
	public static void modifierCases(Position coord1[], Position coord2[])
	{
		
	}
	
	
}