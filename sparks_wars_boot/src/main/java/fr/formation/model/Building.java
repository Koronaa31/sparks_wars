package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.formation.enumerator.NameBuilding;

public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MATCH_ID")
	//@JsonView(Views.Common.class)
	protected int id;
	
	@ManyToOne
	@JoinColumn(name = "Tile_Id")
	//@JsonView(Views.Match.class)
	protected Tile tile;
	
	@Column(name = "Life_Point", nullable = false)
	//@JsonView(Views.Match.class)
	protected int lifePoints;
	
	@Column(name = "Name", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	//@JsonView(Views.Match.class)
	protected NameBuilding name;
	
	@Column(name = "Player", nullable = false)
	//@JsonView(Views.Match.class)
	protected int player;
	
	
	protected List<Unit> craftableUnits;
}
