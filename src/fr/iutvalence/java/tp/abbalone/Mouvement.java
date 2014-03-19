package fr.iutvalence.java.tp.abbalone;

public class Mouvement
{
	private Position[] positionBilles;
	private TypeMouvement typeMouvement;
	private Direction direction;
	
	public Mouvement(Position[] pos, TypeMouvement typeMouv, Direction direc)
	{
		this.positionBilles=pos;
		this.typeMouvement=typeMouv;
		this.direction=direc;
	}
	
	public Position[] getPosition()
	{
		return this.positionBilles;
	}
	
	public TypeMouvement getTypeMouvement()
	{
		return this.typeMouvement;
	}
	
	public Direction getDirection()
	{
		return this.direction;
	}
}
