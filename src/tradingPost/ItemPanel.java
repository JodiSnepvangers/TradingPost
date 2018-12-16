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
	
	public ItemPanel(Database db){
		this.db = db;
//		trade = new JButton("Trade");
//		trade.setPreferredSize(new Dimension(100, 80));
//		trade.setBackground(Color.white);
//		trade.setBorder(BorderFactory.createLineBorder(Color.black));
		stats = new JTextField();
		stats.setEditable(false);
		stats.setPreferredSize(new Dimension(200,80));
		stats.setText(db.getStats(1));
		stats.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setPreferredSize(new Dimension(250 ,150));
		this.setBackground(new Color(122, 98, 86));
		
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(stats);
//		this.add(trade);
		
	}
	
	//stats off the item panel
}
