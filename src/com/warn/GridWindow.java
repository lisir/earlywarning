package com.warn;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class GridWindow extends JFrame {
	
	public GridWindow(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(2, 3);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			getContentPane().setLayout(thisLayout);
			{
				this.setSize(685, 301);
				this.add(new JButton("test2"));
				this.add(new JButton("test3"));
				this.add(new JButton("test4"));
				this.add(new JButton("test5"));
				this.add(new JButton("test6"));
				this.add(new JButton("test7"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
 public static void main(String[]agrs){
	 GridWindow g=new GridWindow();
	 g.setVisible(true);
 }
}
