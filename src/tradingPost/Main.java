package tradingPost;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Frame frame = new Frame();
		Database db = new Database();
		System.out.println(db.getStats(1));
		System.out.println(db.getSize());
	}

}
