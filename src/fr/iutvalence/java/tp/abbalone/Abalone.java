package fr.iutvalence.java.tp.abbalone;

import java.util.LinkedList;
import java.util.List;

/**
 * definit le deroulement d'une partie d'Abalone
 * 
 * @author combeer
 */
public class Abalone
{

	// TODO commentaire ?
	private static final int NOMBRE_DE_JOUEURS = 2;

	// TODO commentaire ?
	private static final int NOMBRE_MAXIMUM_DE_BOULES_PAR_MOUVEMENT = 3;

	// TODO commentaire ?
	private final Joueur[] joueurs;

	// TODO commentaire ?
	private Joueur joueurCourant;

	// TODO commentaire ?
	private final Plateau plateau;

	// TODO commentaire ?
	private int boulesNoiresSorties;
	
	// TODO commentaire ?
	private int boulesBlanchesSorties;

	// TODO écrire un commentaire plus précis (done)
	/**
	 * démarre une partie d'Abalone (pour 2 joueurs)
	 */
	public Abalone()
	{
		this.joueurs = new Joueur[NOMBRE_DE_JOUEURS];
		this.joueurs[0] = new Joueur(Couleur.BLANCHE);
		this.joueurs[1] = new Joueur(Couleur.NOIRE);
		this.joueurCourant = this.joueurs[0];
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
			this.joueurCourant = this.joueurs[numeroDuJoueur];

			if (unJoueurAGagne())
				break;
			Mouvement mouvement;
			while (true)
			{
				mouvement = this.joueurCourant.obtenirMouvement();
				if (this.estMouvementValide(mouvement))
					break;
			}
			deplacerBoules();

			numeroDuJoueur = (numeroDuJoueur + 1) % NOMBRE_DE_JOUEURS;

		}
	}

	// TODO commentaire ?
	private boolean estMouvementValide(Mouvement mouvement)
	{
		if (!this.estNombreDeBoulesDuMouvementCorrect(mouvement))
			return false;
		if (!this.toutesLesBoulesduMouvementAppartiennentAuJoueurCourant(mouvement))
			return false;

		if (!this.toutesLesBoulesDuMouvementSontAdjacentes(mouvement)) return false;
	
		return true;
	}

	// TODO commentaire ?
	public static List<Position> triDesPositionsParNumeroDeColonneCroissant(List<Position> positions)
	{
		List<Position> copie = new LinkedList<Position>();
		for (Position position : positions) copie.add(position);
		
		List<Position> resultat = new LinkedList<Position>();
		for (int indiceParcoursGlobal = 0; indiceParcoursGlobal<positions.size();indiceParcoursGlobal++)
		{
			int minProvisoire = copie.get(0).obtenirNumeroColonne();
			int indexMinProvisoire = 0;
			
			for (int indiceSousParcours = 1; indiceSousParcours<copie.size();indiceSousParcours++)
			{
				if (copie.get(indiceSousParcours).obtenirNumeroColonne() < minProvisoire)
				{
					indexMinProvisoire = indiceSousParcours;
					minProvisoire = copie.get(indexMinProvisoire).obtenirNumeroColonne();
				}
			}
			resultat.add(copie.get(indexMinProvisoire));
			copie.remove(copie.get(indexMinProvisoire));
			
		}
		return resultat;
	}
	
	private boolean toutesLesBoulesDuMouvementSontAdjacentes(Mouvement mouvement)
	{
		switch (mouvement.obtenirType())
		{
		case LATERAL: 
		{
			
			//List<Position> positionsTrieesParNumeroDeColonne = //;
		}
		case EN_LIGNE:
		default:
		}
		switch (mouvement.obtenirDirection())
	}

	// TODO commentaire ?
	private boolean toutesLesBoulesduMouvementAppartiennentAuJoueurCourant(Mouvement mouvement)
	{
		for (Position positionDeLaBoule : mouvement.obtenirPositions())
			if (this.plateau.obtenirEtatDeLaCase(positionDeLaBoule) != this.joueurCourant.obtenirCouleur())
				return false;

		return true;
	}

	// TODO commentaire ?
	private boolean estNombreDeBoulesDuMouvementCorrect(Mouvement mouvement)
	{
		return (mouvement.obtenirNombreDeBoules() > 0)
				&& (mouvement.obtenirNombreDeBoules() <= NOMBRE_MAXIMUM_DE_BOULES_PAR_MOUVEMENT);
	}

	// TODO commentaire ?
	private void deplacerBoules()
	{
		// TODO Auto-generated method stub

	}

	// TODO commentaire ?
	private boolean unJoueurAGagne()
	{
		if ((boulesNoiresSorties == 7) || (boulesBlanchesSorties == 7))
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
