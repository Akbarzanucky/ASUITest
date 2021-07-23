package com.example.uasmoop.Army;

public class cavalry extends soldier{
	public cavalry(int armysize) {
		this.size = armysize;
		this.group = "Cavalry";
		this.category = "Cavalry";
		skillbonus = 10;
		atkstat = 20;
	}
}
