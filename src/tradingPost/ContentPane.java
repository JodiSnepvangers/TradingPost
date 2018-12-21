package tradingPost;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class ContentPane extends JPanel {
	
	private Database db;
	private int amount;
	private int height;

	public ContentPane(Database db, ItemListRegister itemReg){
		this.db = db;
		amount = db.getSize();
		height = 0;
		
		for(int i = 1; i < amount; i++){
			this.add(new ItemPanel(db, itemReg, i));
			height = height + 51;
		}
		if(height < 700){
			height = 700;
		}
		this.setBackground(new Color(45, 23, 12));
		this.setPreferredSize(new Dimension(770, height));
	}
	//creates the contentPane, with the amount off item panels

}
