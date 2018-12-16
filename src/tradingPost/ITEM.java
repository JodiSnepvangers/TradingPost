package tradingPost;

import java.util.ArrayList;
import java.util.List;

public class ITEM {
	
	String name;
	String description;
	int id;
	String type;
	int ownerId;
	String racePref;
	String material;
	int damage;
	int healing;
	int protection;
	int weight;
	
	public ITEM(int id, ItemTypes type, int ownerId, Races race, String material, String name, int weight, int damage, int protection, int healing, String description){
		this.id = id;
		this.type =type.toString();
		this.ownerId = ownerId;
		this.racePref = race.toString();
		this.material = material;
		this.weight = weight;
		this.damage = damage;
		this.protection = protection;
		this.healing = healing;
		this.description = description;
	}
}
