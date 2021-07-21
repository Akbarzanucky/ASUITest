package com.example.uasmoop.Army;
import java.util.ArrayList;

public class castle {
	protected String name;
	protected String type;
	protected ArrayList<soldier> armyList = new ArrayList();
	protected ArrayList<hero> heroList = new ArrayList();
	protected double sum;

	public double getCastleStat() {
		return CastleStat;
	}

	protected double CastleStat;
	
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
						army.skillbonus = Math.floor(army.skillbonus + army.skillbonus*0.2);
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

		
		for (hero Hero : heroList) {
			if (Hero.name.contains("Archer Hero")){
				for (soldier army : armyList) {
					if (army.category == "Archer") {
						army.atkstat = Math.floor(army.atkstat+(army.atkstat*0.4));
					}
				}
			}
			if (Hero.name.contains("Cavalry Hero")){
				for (soldier army : armyList) {
					if (army.category == "Cavalry") {
						army.atkstat = Math.floor(army.atkstat+(army.atkstat*0.4));
					}
				}
			}
			if (Hero.name.contains("Catapult Hero")){
				for (soldier army : armyList) {
					if (army.category == "Catapult") {
						army.atkstat = Math.floor(army.atkstat+(army.atkstat*0.4));
					}
				}
			}
			if (Hero.name.contains("Infantry Hero")){
				for (soldier army : armyList) {
					if (army.category == "Infantry") {
						army.atkstat = Math.floor(army.atkstat+(army.atkstat*0.4));
					}
				}
			}
		}

		System.out.println("Castle name : " + name + " | " + "Type : " + " " + type + "\n"); 
		System.out.println("----------- ARMY LIST ---------------");
		System.out.println();
		if(totalCatH > 0) {
			System.out.println("Catapult Hero : " + totalCatH);
		}
		if(totalCavH > 0) {
			System.out.println("Cavalry Hero : " + totalCavH);
		}
		if(totalInfH > 0) {
			System.out.println("Infantry Hero : " + totalInfH);
		}
		if(totalArchH > 0) {
			System.out.println("Archer Hero : " + totalArchH);
		}
		sum = 0;
		for (soldier army : armyList) {
			sum = sum + army.atkstat;
		}
		CastleStat = sum;
	}
}