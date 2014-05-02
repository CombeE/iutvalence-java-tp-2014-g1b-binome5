package fr.iutvalence.java.tp.abbalone;

// TODO commentaire ?
public class Position
{
	// TODO commentaire ?
	private final int numeroLigne;
	
	// TODO commentaire ?
	private final int numeroColonne;
	
	// TODO commentaire ?
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		this.numeroLigne=numeroDeLigne;
		this.numeroColonne=numeroDeColonne;
	}
	
	// TODO commentaire ?
	public int obtenirNumeroLigne()
	{
		return this.numeroLigne;
	}
	public int obtenirNumeroColonne()
	{
		return this.numeroColonne;
	}

	@Override
	public String toString()
	{
		return "Position [numeroLigne=" + this.numeroLigne + ", numeroColonne=" + this.numeroColonne + "]";
	}
	
	
}
