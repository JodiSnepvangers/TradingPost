package tradingPost;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ItemPanel extends JPanel{
	
	private JButton trade;
	private JTextField stats;
	private Database db;
	private ItemListRegister itemReg;
	private ITEM item;
	
	public ItemPanel(Database db, ItemListRegister itemReg, int itemId){
		this.db = db;
		this.itemReg = itemReg;
		item = itemReg.getItem(itemId);
//		trade = new JButton("Trade");
//		trade.setPreferredSize(new Dimension(100, 80));
//		trade.setBackground(Color.white);
//		trade.setBorder(BorderFactory.createLineBorder(Color.black));
		stats = new JTextField();
		stats.setEditable(false);
		stats.setPreferredSize(new Dimension(200,80));
		
		
		stats.setText(item.getName());
		//stats.setText(db.getName(1));
		stats.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setPreferredSize(new Dimension(250 ,150));
		this.setBackground(new Color(122, 98, 86));
		
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(stats);
//		this.add(trade);
		
	}
	
	//stats off the item panel
}
