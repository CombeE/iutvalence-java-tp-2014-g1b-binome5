package fr.iutvalence.java.tp.abbalone;

public enum Couleur
{
	BLANCHE(1, 'B'),
	NOIRE(-1, 'N'),
	VIDE(0, ' '),
	INVALIDE(2, ' ');
	
	private int valeur;
	private char ch;
	
	private Couleur(int valeur, char ch)
	{
		this.valeur = valeur;
		this.ch = ch;
	}
	public int obtenirValeur()
	{
		return this.valeur;
	}
	
	public int obtenirChar()
	{
		return this.ch;
	}
}