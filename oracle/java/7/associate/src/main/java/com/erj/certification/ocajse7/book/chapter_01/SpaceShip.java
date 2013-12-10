package com.erj.certification.ocajse7.book.chapter_01;

public class SpaceShip extends Ship implements Dockable{
	
	public enum ShipType {
		FRIGATE, BATTLESHIP, MINELAYER, ESCORT, DEFENSE
	}
	
	ShipType shipType = ShipType.ESCORT;
	
	public SpaceShip() {
		System.out.println("\nSpaceShip created with default ship type.");
	}
	
	public SpaceShip(ShipType shipType) {
		System.out.println("\nSpaceShip created with specified ship type.");
		this.shipType = shipType;
	}
	
	@Override
	public void dockShip() {
		
	}
	
	@Override
	public String toString() {
		String shipTypeRefined = this.shipType.name().toLowerCase();
		return "The pirate ship is a " + shipTypeRefined + " ship.";
	}
}
