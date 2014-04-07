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

	private static final int NOMBRE_DE_JOUEURS = 2;

	private static final int NOMBRE_MAXIMUM_DE_BOULES_PAR_MOUVEMENT = 3;

	private final Joueur[] joueurs;

	private Joueur joueurCourant;

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
		joueurs[0] = new Joueur(Couleur.BLANCHE);
		joueurs[1] = new Joueur(Couleur.NOIRE);
		joueurCourant = joueurs[0];
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
			joueurCourant = this.joueurs[numeroDuJoueur];

			if (unJoueurAGagne())
				break;
			Mouvement mouvement;
			while (true)
			{
				mouvement = joueurCourant.obtenirMouvement();
				if (this.estMouvementValide(mouvement))
					break;
			}
			deplacerBoules();

			numeroDuJoueur = (numeroDuJoueur + 1) % NOMBRE_DE_JOUEURS;

		}
	}

	private boolean estMouvementValide(Mouvement mouvement)
	{
		if (!this.estNombreDeBoulesDuMouvementCorrect(mouvement))
			return false;
		if (!this.toutesLesBoulesduMouvementAppartiennentAuJoueurCourant(mouvement))
			return false;

		if (!this.toutesLesBoulesDuMouvementSontAdjacentes(mouvement)) return false;
	
		return true;
	}

	public static List<Position> triDesPositionsParNumeroDeColonneCroissant(List<Position> positions)
	{
		List<Position> copie = new LinkedList<Position>();
		for (Position position : positions) copie.add(position);
		
		List<Position> resultat = new LinkedList<Position>();
		for (int indiceParcoursGlobal = 0; indiceParcoursGlobal<positions.size();indiceParcoursGlobal++)
		{
			int minProvisoire = copie.get(0).getNumeroColonne();
			int indexMinProvisoire = 0;
			
			for (int indiceSousParcours = 1; indiceSousParcours<copie.size();indiceSousParcours++)
			{
				if (copie.get(indiceSousParcours).getNumeroColonne() < minProvisoire)
				{
					indexMinProvisoire = indiceSousParcours;
					minProvisoire = copie.get(indexMinProvisoire).getNumeroColonne();
				}
			}
			resultat.add(copie.get(indexMinProvisoire));
			copie.remove(copie.get(indexMinProvisoire));
			
		}
		return resultat;
	}
	
	private boolean toutesLesBoulesDuMouvementSontAdjacentes(Mouvement mouvement)
	{
		switch (mouvement.getTypeMouvement())
		{
		case LATERAL: 
		{
			
			List<Position> positionsTrieesParNumeroDeColonne = //;
		}
		case ENLIGNE:
		default:
		}
		switch (mouvement.getDirection())
	}

	private boolean toutesLesBoulesduMouvementAppartiennentAuJoueurCourant(Mouvement mouvement)
	{
		for (Position positionDeLaBoule : mouvement.getPositions())
			if (this.plateau.getEtatDeLaCase(positionDeLaBoule) != this.joueurCourant.getCouleur())
				return false;

		return true;
	}

	private boolean estNombreDeBoulesDuMouvementCorrect(Mouvement mouvement)
	{
		return (mouvement.getNombreDeBoules() > 0)
				&& (mouvement.getNombreDeBoules() <= NOMBRE_MAXIMUM_DE_BOULES_PAR_MOUVEMENT);
	}

	private void deplacerBoules()
	{
		// TODO Auto-generated method stub

	}

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
