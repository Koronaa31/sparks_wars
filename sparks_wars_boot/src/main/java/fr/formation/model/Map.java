package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Map {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Map_Id")
	//@JsonView(Views.Common.class)
	protected int id;
	
	
	protected List<Tile> mapTile;
	
	@Column(name = "X_Max", nullable = false)
	//@JsonView(Views.Match.class)
	protected int xMax;
	
	@Column(name = "Y_Max", nullable = false)
	//@JsonView(Views.Match.class)
	protected int yMax;
}
