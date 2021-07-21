package com.example.uasmoop.Army;
import java.util.ArrayList;

public class player {
	protected String name;
	protected castle castletype;
	
	public String getName() {
		return name;
	}
	
	public castle getCastletype() {
		return castletype;
	}
	
	public void setName(String gname) {
		this.name = gname;
	}
	
	public void setCastletype(castle gtype) {
		this.castletype = gtype;
	}
	
	public player(String name, castle castletype) {
		this.name = name;
		this.castletype = castletype;
	}
}
