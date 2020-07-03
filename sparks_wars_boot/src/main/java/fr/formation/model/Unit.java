package fr.formation.model;

import java.util.List;

import fr.formation.enumerator.LocomotionType;
import fr.formation.enumerator.NameUnit;
import fr.formation.enumerator.TypeTile;

public class Unit {

	
	protected int id;
	
	protected int fuel;
	
	protected int ammo;
	
	protected List<TypeTile> accesTypeTile;
	
	protected int movement;
	
	protected LocomotionType locomotionType;
	
	protected int cost;
	
	protected int vision;
	
	protected Tile tile;
	
	protected int player;
	
	protected NameUnit nameUnit;
	
	protected boolean ripost;
	
	protected List<Tile> autorizedShot;
	
	protected int rangeMax;
	
	protected int rangeMin;
	
	protected boolean secondaryWeapon;
	
}
