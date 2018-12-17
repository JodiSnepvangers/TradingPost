package tradingPost;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();
		Frame frame = new Frame(db);
		ItemListRegister itemReg = new ItemListRegister(db);
		
		System.out.println(db.getSize());
	}

}
