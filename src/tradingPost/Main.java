package tradingPost;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();
		Frame frame = new Frame(db);
		System.out.println(db.getStats(1));
		System.out.println(db.getSize());
	}

}
