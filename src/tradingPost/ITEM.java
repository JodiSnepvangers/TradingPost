package tradingPost;

import java.util.ArrayList;
import java.util.List;

public class ITEM {
	
	String name;
	String description;
	int id;
	String type;
	String ownerId;
	String racePref;
	String material;
	int damage;
	int healing;
	int protection;
	int weight;
	
	public ITEM(int id, ItemTypes type, String ownerId, Races race, String material, String name, int weight, int damage, int protection, int healing, String description){
		this.id = id;
		this.type =type.toString();
		this.ownerId = ownerId;
		this.racePref = race.toString();
		this.name = name;
		this.material = material;
		this.weight = weight;
		this.damage = damage;
		this.protection = protection;
		this.healing = healing;
		this.description = description;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getItemID(){
		return id;
	}
	public String getType(){
		return type;
	}
	
	public String getOwnerID(){
		return ownerId;
	}
	
	public String getRacePref(){
		return racePref;
	}
	
	public String getMaterial(){
		return material;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public int getProtection(){
		return protection;
	}
	
	public int getHealing(){
		return healing;
	}
	
	public int getWeight(){
		return weight;
	}
}
