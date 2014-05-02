package fr.iutvalence.java.tp.abbalone;

import java.util.List;

// TODO commentaire ?
public class Mouvement
{
	// TODO commentaire ?
	private final List<Position> positionsBilles;
	
	// TODO commentaire ?
	private final TypeMouvement type;
	
	// TODO commentaire ?
	private final Direction direction;
	
	public Mouvement(List<Position> pos, TypeMouvement typeMouv, Direction direc)
	{
		this.positionsBilles=pos;
		this.type=typeMouv;
		this.direction=direc;
	}
	
	// TODO commentaire ?
	public List<Position> obtenirPositions()
	{
		return positionsBilles;
	}

	// TODO commentaire ?
	public TypeMouvement obtenirType()
	{
		return this.type;
	}
	
	// TODO commentaire ?
	public Direction obtenirDirection()
	{
		return this.direction;
	}
	
	// TODO commentaire ?
	public int obtenirNombreDeBoules()
	{
		return this.positionsBilles.size();
	}
	
}
