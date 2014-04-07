package fr.iutvalence.java.tp.abbalone;

import java.util.List;

public class Mouvement
{
	private List<Position> positionsBilles;
	private TypeMouvement typeMouvement;
	private Direction direction;
	
	public Mouvement(List<Position> pos, TypeMouvement typeMouv, Direction direc)
	{
		this.positionsBilles=pos;
		this.typeMouvement=typeMouv;
		this.direction=direc;
	}
	
	public List<Position> getPositions()
	{
		return positionsBilles;
	}
	
	public TypeMouvement getTypeMouvement()
	{
		return this.typeMouvement;
	}
	
	public Direction getDirection()
	{
		return this.direction;
	}
	
	public int getNombreDeBoules()
	{
		return positionsBilles.size();
	}
	
}
