package tradingPost;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();
		
		ItemListRegister itemReg = new ItemListRegister(db);
		itemReg.update();
		
		Frame frame = new Frame(db, itemReg);
		
		System.out.println(db.getSize());
	}

}
