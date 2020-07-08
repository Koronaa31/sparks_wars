package fr.formation.model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.formation.enumerator.TypeTile;

public class Tile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Tile_Id")
	//@JsonView(Views.Common.class)
	protected int id;
	
	@Column(name = "Type_Tile", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	//@JsonView(Views.Match.class)
	protected TypeTile typeTile;
	
	@Column(name = "X")
	//@JsonView(Views.Common.class)
	protected int x;
	
	@Column(name = "Y")
	//@JsonView(Views.Common.class)
	protected int y;
	
	@ManyToOne
	@JoinColumn(name = "Unit_Id")
	//@JsonView(Views.Match.class)
	protected Unit unit;

	@ManyToOne
	@JoinColumn(name = "Building_Id")
	//@JsonView(Views.Match.class)
	protected Building building;
}
