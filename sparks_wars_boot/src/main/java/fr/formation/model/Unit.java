package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.formation.enumerator.LocomotionType;
import fr.formation.enumerator.NameUnit;
import fr.formation.enumerator.TypeTile;

@Entity
@Table(name = "card")
public class Unit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Unit_Id")
	//@JsonView(Views.Common.class)
	protected int id;
	
	@Column(name = "Fuel", nullable = false)
	//@JsonView(Views.Match.class)
	protected int fuel;
	
	@Column(name = "Ammo", nullable = false)
	//@JsonView(Views.Match.class)
	protected int ammo;
	
	@OneToMany(mappedBy = "")
	//@JsonView(Views.Match.class)
	protected List<TypeTile> accesTypeTile;
	
	@Column(name = "Movement", nullable = false)
	//@JsonView(Views.Match.class)	
	protected int movement;
	
	@Column(name = "Locomotion_Type")
	@Enumerated(EnumType.ORDINAL)
	//@JsonView(Views.Match.class)
	protected LocomotionType locomotionType;
	
	@Column(name = "Movement", nullable = false)
	//@JsonView(Views.Match.class)	
	protected int cost;
	
	@Column(name = "Movement", nullable = false)
	//@JsonView(Views.Match.class)	
	protected int vision;
	
	protected Tile tile;
	
	@Column(name = "Player", nullable = false)
	//@JsonView(Views.Match.class)	
	protected int player;
	
	@Column(name = "Name_Unit")
	@Enumerated(EnumType.ORDINAL)
	//@JsonView(Views.Match.class)
	protected NameUnit nameUnit;
	
	@Column(name = "Ripost", nullable = false)
	//@JsonView(Views.Match.class)	
	protected boolean ripost;
	
	protected List<Tile> autorizedShot;
	
	@Column(name = "Range_Min", nullable = false)
	//@JsonView(Views.Match.class)	
	protected int rangeMax;
	
	@Column(name = "Range_Max", nullable = false)
	//@JsonView(Views.Match.class)	
	protected int rangeMin;
	
	@Column(name = "Secondary_Weapon", nullable = true)
	//@JsonView(Views.Match.class)	
	protected boolean secondaryWeapon;
	
}
