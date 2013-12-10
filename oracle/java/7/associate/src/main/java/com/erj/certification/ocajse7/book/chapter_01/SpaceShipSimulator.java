package com.erj.certification.ocajse7.book.chapter_01;

import com.erj.certification.ocajse7.book.chapter_01.SpaceShip.ShipType;

public class SpaceShipSimulator {
	public static void main(String[] args) {
		SpaceShip ship1 = new SpaceShip();
		System.out.println(ship1);
		
		SpaceShip ship2 = new SpaceShip(ShipType.FRIGATE);
		System.out.println(ship2);
	}
}
