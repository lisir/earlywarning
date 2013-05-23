package com.warn;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

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
public class GridBagWindow  extends JFrame{
	private JPanel jPanel1;
	private JButton jButton1;
	public GridBagWindow(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(781, 544);
		initGUI();
	}

	private void initGUI() {
		GridBagLayout thisLayout = new GridBagLayout();
		thisLayout.rowWeights = new double[] {0.3, 0.5,0.1};
		thisLayout.rowHeights = new int[] {7, 7, 7};
		thisLayout.columnWeights = new double[] {10, 10};
		thisLayout.columnWidths = new int[] {10, 7};
		getContentPane().setLayout(thisLayout);
		{
			jPanel1 = new JPanel();
			getContentPane().add(jPanel1, new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(50, 50, 0, 0), 0, 0));
			jPanel1.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
			{
				jButton1 = new JButton();
				jPanel1.add(jButton1);
				jButton1.setText("jButton1");
			}
		}
		{
			
		}

	}
	public static void main(String args[]){
		GridBagWindow f=new GridBagWindow();
		f.setVisible(true);
	}

}
