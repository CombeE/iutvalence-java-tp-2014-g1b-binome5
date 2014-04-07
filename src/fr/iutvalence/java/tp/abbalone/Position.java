package fr.iutvalence.java.tp.abbalone;

public class Position
{
	private int numeroLigne;
	private int numeroColonne;
	
	public Position(int abs, int ord)
	{
		this.numeroLigne=abs;
		this.numeroColonne=ord;
	}
	
	public int getNumeroLigne()
	{
		return this.numeroLigne;
	}
	public int getNumeroColonne()
	{
		return this.numeroColonne;
	}
}
