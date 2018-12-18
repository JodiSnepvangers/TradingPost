package tradingPost;

import java.util.ArrayList;
import java.util.List;

public class ItemListRegister {
	Database data;
	List<ITEM> itemList = new ArrayList<>();
	ItemListRegister(Database data){
		this.data = data;
	}
	
	public void update(){
		int itemCount = data.getSize();
		for(int index = 1; index <= itemCount; index++){
			String name = data.getName(index);
			String description = data.getDescription(index);
			int id = data.getid(index);
			String type = data.getType(index).toUpperCase();
			String ownerId = data.getOwner(index);
			String racePref = data.getRace(index).toUpperCase();
			String material = data.getMaterial(index);
			int damage = data.getDamage(index);
			int healing = data.getHealing(index);
			int protection = data.getProtection(index);
			int weight = data.getWeight(index);
			itemList.add(new ITEM(id, ItemTypes.valueOf(type), ownerId, Races.valueOf(racePref), material, name, weight, damage, protection, healing, description));
		}
	}
	
	public ITEM getItem(int id){
		if(itemList.size() == 0){
			System.out.print("Error! item list empty. called update()?");
			return null;
		}
		if((id == 0)) id = 1;
		return itemList.get(id - 1); //+1 to avoid id 0
	}
}
