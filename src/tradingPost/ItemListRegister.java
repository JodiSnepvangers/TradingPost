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
		for(int index = 0; index < itemCount; index++){
			data.getStats(index);
		}
	}
}
