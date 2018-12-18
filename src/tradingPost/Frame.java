package tradingPost;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

public class Frame extends JFrame {
	
	private Database db;
	private JMenuBar menuBar;
	private JMenu Menu;
	private JMenu Items;
	private JMenuItem MMenu;
	private JMenuItem Weapons;
	private JMenuItem Appearal;
	private JMenuItem Armour;
	private JMenuItem Drinks;
	private JMenuItem Materials;
	private JMenuItem Food;
	private JMenuItem Potion;

	public Frame(Database db, ItemListRegister itemReg){
		this.db = db;
		ContentPane cp = new ContentPane(db, itemReg);
		JScrollPane scroll = new JScrollPane(cp);
		//Making the frame that contains everything in the frame.
		//7 is the amount off item boxes inside
		
		menuBar = new JMenuBar();
		Menu = new JMenu("Menu");
		Items = new JMenu("Types");
		MMenu = new JMenuItem("Main Menu");
		Weapons = new JMenuItem("Weapons");
		Armour = new JMenuItem("Armour");
		Drinks = new JMenuItem("Drinks");
		Materials = new JMenuItem("Materials");
		Appearal = new JMenuItem("Appearal");
		Food = new JMenuItem("Food");
		Potion = new JMenuItem("Potions");
		menuBar.add(Menu);
		menuBar.add(Items);
		Menu.add(MMenu);
		Items.add(Appearal);
		Items.add(Armour);
		Items.add(Drinks);
		Items.add(Food);
		Items.add(Materials);
		Items.add(Potion);
		Items.add(Weapons);
		this.setJMenuBar(menuBar);
		//creates the whole menu bar
		
		//scroll.setSize(200, 200);
		setPreferredSize(new Dimension(800, 800));
		scroll.setVisible(true);
		this.setContentPane(scroll);
		
		
		Weapons.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		Appearal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		Food.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		
		Potion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		//action listeners add functions to the buttons on the menubar
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Trading Post");
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
