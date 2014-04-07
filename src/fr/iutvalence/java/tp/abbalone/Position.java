package fr.iutvalence.java.tp.abbalone;

public class Position
{
	private int numeroLigne;
	private int numeroColonne;
	
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		this.numeroLigne=numeroDeLigne;
		this.numeroColonne=numeroDeColonne;
	}
	
	public int getNumeroLigne()
	{
		return this.numeroLigne;
	}
	public int getNumeroColonne()
	{
		return this.numeroColonne;
	}

	@Override
	public String toString()
	{
		return "Position [numeroLigne=" + numeroLigne + ", numeroColonne=" + numeroColonne + "]";
	}
	
	
}
