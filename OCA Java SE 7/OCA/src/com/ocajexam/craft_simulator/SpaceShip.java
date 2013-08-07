package com.ocajexam.craft_simulator;

/**
 * <b>SpaceShip Class</b>
 * @author PEDRO
 * @version 1.0
 *
 */
public class SpaceShip /*extends Ship implements Dockable*/ {
	
	// Data Members
	public enum ShipType {
		FRIGATE, BATTLESHIP, MINELAYER, ESCORT, DEFENCE
	}
	
	ShipType shipType = ShipType.ESCORT;
	
	// Constructors
	public SpaceShip() {
		System.out.println("\nSpaceShip created with default ship type");
	}
	
	public SpaceShip(ShipType shipType) {
		System.out.println("\nSpaceShip created with specified ship type");
		this.shipType = shipType;
	}
	/*
	// Methods
	@Override
	public void dockShip() {
		// TODO
	}*/
	
	@Override	
	public String toString() {
		String shipTypeRefined = this.shipType.name().toLowerCase();
		return "The pirate ship is a " + shipTypeRefined + " ship.";
	}

}
