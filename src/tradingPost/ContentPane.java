package tradingPost;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class ContentPane extends JPanel {
	
	private int amount;
	private int height;

	public ContentPane(int a) {
		amount = a;
		height = 0;
		
		for(int i = 0; i < amount; i++){
			this.add(new ItemPanel());
			height = height + 105;
		}
		if(height < 800){
			height = 800;
		}
		this.setBackground(new Color(45, 23, 12));
		this.setPreferredSize(new Dimension(770, height));
	}
	//creates the contentPane, with the amount off item panels

}
