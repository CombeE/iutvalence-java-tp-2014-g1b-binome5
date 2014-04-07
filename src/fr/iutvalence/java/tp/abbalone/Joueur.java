package fr.iutvalence.java.tp.abbalone;

import javax.naming.PartialResultException;

// TODO écrire un commentaire plus précis (done)
/**
 * Rentre vos parametres personnels en tant que joueur d'Abalone
 * @author combeer
 */
public class Joueur
{
	private Couleur couleurJoueur;
	
	public Joueur(Couleur couleur)
	{
		this.couleurJoueur=couleur;
	}
	
	
	public Mouvement obtenirMouvement()
	{
		return null;	
	}
	
	public Couleur getCouleur()
	{
		return this.couleurJoueur;
	}
}