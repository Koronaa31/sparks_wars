package fr.formation.model;

import java.util.List;

import fr.formation.enumerator.NameBuilding;

public class Building {

	protected int id;
	
	protected Tile tile;
	
	protected int lifePoints;
	
	protected NameBuilding name;
	
	protected int player;
	
	protected List<Unit> craftableUnits;
}
