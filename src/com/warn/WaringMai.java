package com.warn;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
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
public class WaringMai  extends JFrame{
	private JPanel jPanel1;
	private JButton jButton1;
	private JScrollPane jScrollPane2;
	private JList jList2;
	private JList jList1;
	private JPanel jPanelMidRight;
	private JPanel jPaneMidLeft;
	private JLabel jLabel2;
	private JScrollPane jScrollPane1;
	private JPanel jPanel3;
	private JLabel jLabel_IL;
	private JLabel jLabel1;
	private JPanel jPanel4;
	private JPanel jPanel2;
	public WaringMai(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(811, 638);
		initGUI();
	}

	private void initGUI() {
		GridBagLayout thisLayout = new GridBagLayout();
		thisLayout.rowWeights = new double[] {0.2,0.3, 0.5,0.1};
		thisLayout.rowHeights = new int[] {7,7, 7, 7};
		thisLayout.columnWeights = new double[] {5,0.1,10};
		thisLayout.columnWidths = new int[] {5,1,10};
		getContentPane().setLayout(thisLayout);
		{
			jPanel1 = new JPanel();
			getContentPane().add(jPanel1, new GridBagConstraints(0, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 50, 10, 0), 0, 0));
			jPanel1.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
			{
				jButton1 = new JButton();
				jPanel1.add(jButton1);
				jButton1.setText("jButton1");
			}
		}
		{
			jPanel2 = new JPanel();
			GridLayout jPanel2Layout = new GridLayout(1, 2);
			
			jPanel2.setLayout(jPanel2Layout);
			getContentPane().add(jPanel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(30, 50, 0, 0), 0, 0));
			{
				jLabel1 = new JLabel();
				jPanel2.add(jLabel1);
				jLabel1.setText("jLabel1");
			}
			{
				jLabel_IL = new JLabel("fffff");
				jPanel2.add(jLabel_IL);
				jLabel_IL.setText("\u76d1\u63a7\u7cfb\u7edf");
				jLabel_IL.setHorizontalAlignment(SwingConstants.TRAILING);
				jLabel_IL.setHorizontalTextPosition(SwingConstants.CENTER);
				jLabel_IL.setFont(new java.awt.Font("微软雅黑",1,26));
			}
		}
		{
			jPanel4 = new JPanel();
			GridLayout jPanel4Layout = new GridLayout(1, 1);
			jPanel4Layout.setHgap(5);
			jPanel4Layout.setVgap(5);
			jPanel4Layout.setColumns(1);
			jPanel4.setLayout(jPanel4Layout);
			getContentPane().add(jPanel4, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(30, 0, 0, 0), 0, 0));
			{
				jLabel2 = new JLabel();
				jPanel4.add(jLabel2);
				jLabel2.setText("V1.0");
				jLabel2.setFont(new java.awt.Font("微软雅黑",1,26));
			}
		}
		{
			jPaneMidLeft = new JPanel();
			GridLayout jPaneMidLeftLayout = new GridLayout(1, 1);
			jPaneMidLeftLayout.setHgap(5);
			jPaneMidLeftLayout.setVgap(5);
			jPaneMidLeftLayout.setColumns(1);
			jPaneMidLeft.setLayout(jPaneMidLeftLayout);
			getContentPane().add(jPaneMidLeft, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 50, 0, 0), 0, 0));
			{
				jScrollPane1 = new JScrollPane();
				jPaneMidLeft.add(jScrollPane1);
				{
					ListModel jList2Model = 
						new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
					jList2 = new JList();
					jScrollPane1.setViewportView(jList2);
					jList2.setModel(jList2Model);
				}
			}
		}
		{
			jPanelMidRight = new JPanel();
			GridLayout jPanelMidRightLayout = new GridLayout(1, 1);
			jPanelMidRightLayout.setHgap(5);
			jPanelMidRightLayout.setVgap(5);
			jPanelMidRightLayout.setColumns(1);
			jPanelMidRight.setLayout(jPanelMidRightLayout);
			getContentPane().add(jPanelMidRight, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		}
		{
			jPanel3 = new JPanel();
			GridLayout jPanel3Layout = new GridLayout(1, 1);
			jPanel3Layout.setHgap(5);
			jPanel3Layout.setVgap(5);
			jPanel3Layout.setColumns(1);
			jPanel3.setLayout(jPanel3Layout);
			getContentPane().add(jPanel3, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			{
				jScrollPane2 = new JScrollPane();
				jPanel3.add(jScrollPane2);
				{
					ListModel jList1Model = 
						new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
					jList1 = new JList();
					jScrollPane2.setViewportView(jList1);
					jList1.setModel(jList1Model);
				}
			}
		}
		{
			
		}

	}
	public static void main(String args[]){
		WaringMai f=new WaringMai();
		f.setVisible(true);
	}

}
