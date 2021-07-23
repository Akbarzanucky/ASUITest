package com.example.uasmoop.Army;
import java.util.ArrayList;

public class castle {
	protected String name;
	protected String type;
	protected ArrayList<soldier> armyList = new ArrayList();
	protected ArrayList<hero> heroList = new ArrayList();
	protected double sum;
	protected double CastleStat;

	public double getCastleStat() {
		return CastleStat;
	}
	
	public castle(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public void addSoldier(soldier armyList) {
		this.armyList.add(armyList);
	}
	
	public void addHero(hero heroList) {
		this.heroList.add(heroList);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void castlestat() {
		String ntype = type.toLowerCase();
		int totalCavH = 0;
		int totalInfH = 0;
		int totalCatH = 0;
		int totalArchH = 0;

		//Calculating castle-type boost
		switch (ntype) {
			case "wood" :
				for (soldier army : armyList) {
					if (army.category == "Archer") {
						army.skillbonus = Math.floor(army.skillbonus + army.skillbonus*0.2);
					}
				}
				break;
			case "steel" :
				for (soldier army : armyList) {
					if (army.category == "Infantry") {
						army.skillbonus = Math.floor(army.skillbonus + army.skillbonus*0.3);
					}
				}
				break;
			case "stone" :
				for (soldier army : armyList) {
					if (army.category == "Catapult") {
						army.skillbonus = Math.floor(army.skillbonus + army.skillbonus*0.2);
					}
				}
				break;
			case "horse" :
				for (soldier army : armyList) {
					if (army.category == "Cavalry") {
						army.skillbonus = Math.floor(army.skillbonus + army.skillbonus*0.2);
					}
				}
				break;
		}

		//Calculating total hero on one player
		for (hero Hero : heroList) {
			if (Hero.name.equals("Archer Hero")){
				totalArchH +=1;
			}
			else if (Hero.name.equals("Cavalry Hero")){
				totalCavH +=1;
			}
			else if (Hero.name.equals("Infantry Hero")){
				totalInfH +=1;
			}
			else if (Hero.name.equals("Catapult Hero")){
				totalCatH +=1;
			}
		}

		//Calculating Hero boost
		for (hero Hero : heroList) {
			if (Hero.name.contains("Archer Hero")){
				for (soldier army : armyList) {
					if (army.category == "Archer") {
						army.atkstat = Math.floor(army.atkstat+(army.atkstat*0.4));
					}
					else if (army.category == "Cavalry") {
						army.atkstat = Math.floor(army.atkstat-(army.atkstat*0.1));
					}
					else if (army.category == "Infantry") {
						army.atkstat = Math.floor(army.atkstat-(army.atkstat*0.1));
					}
				}
			}
			if (Hero.name.contains("Cavalry Hero")){
				for (soldier army : armyList) {
					if (army.category == "Cavalry") {
						army.atkstat = Math.floor(army.atkstat+(army.atkstat*0.4));
					}
					else if (army.category == "Catapult") {
						army.atkstat = Math.floor(army.atkstat-(army.atkstat*0.1));
					}
				}
			}
			if (Hero.name.contains("Catapult Hero")){
				for (soldier army : armyList) {
					if (army.category == "Catapult") {
						army.atkstat = Math.floor(army.atkstat+(army.atkstat*0.4));
					}
					else if (army.category == "Infantry") {
						army.atkstat = Math.floor(army.atkstat-(army.atkstat*0.1));
					}
				}
			}
			if (Hero.name.contains("Infantry Hero")){
				for (soldier army : armyList) {
					if (army.category == "Infantry") {
						army.atkstat = Math.floor(army.atkstat+(army.atkstat*0.4));
					}
					else if (army.category == "Archer") {
						army.atkstat = Math.floor(army.atkstat-(army.atkstat*0.1));
					}
				}
			}
		}
		//Totalling attack stat for one castle
		sum = 0;
		for (soldier army : armyList) {
			sum = sum + Math.floor(((army.atkstat + army.skillbonus)*0.1) * (0.001 * army.size));
		}
		CastleStat = sum;
	}
}