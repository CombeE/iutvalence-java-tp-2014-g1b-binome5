package fr.iutvalence.java.tp.abbalone;

import javax.naming.PartialResultException;

/**
 * Représente un joueur
 * @author combeer
 */
public class Joueur
{
	// TODO commentaire ?
	private final Couleur couleurJoueur;

	// TODO commentaire ?
	public Joueur(Couleur couleur)
	{
		this.couleurJoueur=couleur;
	}
	
	// TODO commentaire ?
	public Mouvement obtenirMouvement()
	{
		return null;	
	}
	
	// TODO commentaire ?
	public Couleur obtenirCouleur()
	{
		return this.couleurJoueur;
	}
}