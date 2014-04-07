package fr.iutvalence.java.tp.abbalone;

import java.util.List;
import java.util.LinkedList;

public class TestTriPositions
{

	public static void main(String[] args)
	{
		List<Position> positions = new LinkedList<Position>();
		positions.add(new Position(1, 4));
		positions.add(new Position(2, 3));
		positions.add(new Position(3, 5));
		
		List<Position> positionsTriees = Abalone.triDesPositionsParNumeroDeColonneCroissant(positions);
		
		for (Position position: positionsTriees)
			System.out.println(position);

	}

}
