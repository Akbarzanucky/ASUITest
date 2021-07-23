package com.example.uasmoop.Army;

public class infantry extends soldier{
	public infantry(int armysize) {
		this.size = armysize;
		this.group = "Infantry";
		this.category = "Infantry";
		skillbonus = 5;
		atkstat = 15;
	}
}
