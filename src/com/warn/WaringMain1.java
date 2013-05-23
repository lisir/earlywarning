package com.warn;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.warn.calender.CalendarFrame;

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
public class WaringMain1 extends JFrame{
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JPanel jPanel9;
	private JPanel jPanel10;
	private JPanel jPanel8;
	private JPanel jPanel7;
	private JPanel jPanel6;
	private JButton jButtonqzqh;
	private JButton jButtonqdbj;
	private JButton jButtongbgj;
	private JButton jButtonexit;
	private JPanel jPanel5;
	private JList jList2;
	private JList jList1;
	private JPanel jPanel4;
	private JPanel jPanel3;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JPanel jPanelTopLeft;
	private JPanel jPanelTopRight;
	private JPanel jPanel2;
	public WaringMain1(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initGUI();
	}
	private void initGUI() {
		try {
			{
				this.setSize(1024, 571);
				jPanel1 = new JPanel(){
					Image bj =  new ImageIcon(getClass().getClassLoader().getResource("1.jpg")).getImage();

		    		@Override
		    		public void paintComponent(Graphics g) {
		    			super.paintComponent(g);
		    			g.drawImage(bj, 0, 0,this.getWidth(),this.getHeight(), this);
		    		}
				};
				GridBagLayout jPanel1Layout = new GridBagLayout();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				jPanel1Layout.rowWeights = new double[] {0.1, 0.1, 0.3, 0.05};
				jPanel1Layout.rowHeights = new int[] {7, 8, 9, 7};
				jPanel1Layout.columnWeights = new double[] {0.1};
				jPanel1Layout.columnWidths = new int[] {7};
				jPanel1.setLayout(jPanel1Layout);
				{
					jPanel2 = new JPanel();
					jPanel2.setOpaque(false);
					GridLayout jPanel2Layout = new GridLayout(1, 1);
					jPanel2.setLayout(jPanel2Layout);
					jPanel1.add(jPanel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
					//jPanel2.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					{
						jPanelTopLeft = new JPanel();
						jPanelTopLeft.setOpaque(false);
						jPanel2.add(jPanelTopLeft);
						GridLayout jPanelTopLeftLayout = new GridLayout(1, 1);
						jPanelTopLeftLayout.setHgap(5);
						jPanelTopLeftLayout.setVgap(5);
						jPanelTopLeftLayout.setColumns(1);
						jPanelTopLeft.setLayout(jPanelTopLeftLayout);
						{
							jLabel1 = new JLabel();
							jPanelTopLeft.add(jLabel1);
							jLabel1.setText("jLabel1");
							jLabel2 = new JLabel();
							jPanelTopLeft.add(jLabel2);
							jLabel2.setText("\u76d1\u63a7\u7cfb\u7edf");
							jLabel2.setHorizontalAlignment(SwingConstants.TRAILING);
							jLabel2.setFont(new java.awt.Font("微软雅黑",1,26));
						}
						jPanelTopRight = new JPanel();
						GridLayout jPanelTopRightLayout = new GridLayout(1, 1);
						jPanelTopRightLayout.setHgap(5);
						jPanelTopRightLayout.setVgap(5);
						jPanelTopRightLayout.setColumns(1);
						jPanelTopRight.setLayout(jPanelTopRightLayout);
						jPanelTopRight.setOpaque(false);
						jPanel2.add(jPanelTopRight);
						{
							jLabel3 = new JLabel();
							jPanelTopRight.add(jLabel3);
							jLabel3.setText("V1.0");
							jLabel3.setFont(new java.awt.Font("微软雅黑",1,26));
						}
					}
				}
				{
					jPanel3 = new JPanel();
					jPanel3.setOpaque(false);
					GridBagLayout jPanel3Layout = new GridBagLayout();
					jPanel1.add(jPanel3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
					jPanel3Layout.rowWeights = new double[] {0.1};
					jPanel3Layout.rowHeights = new int[] {1};
					jPanel3Layout.columnWeights = new double[] {0.3, 0.1, 0.7};
					jPanel3Layout.columnWidths = new int[] {7, 7, 7};
					jPanel3.setLayout(jPanel3Layout);
					{
						 
						
					}
					{
						jPanel6 = new JPanel();
						GridBagLayout jPanel6Layout = new GridBagLayout();
						jPanel6Layout.rowWeights = new double[] {0.1};
						jPanel6Layout.rowHeights = new int[] {7};
						jPanel6Layout.columnWeights = new double[] {0.2, 0.1};
						jPanel6Layout.columnWidths = new int[] {7, 7};
						jPanel6.setLayout(jPanel6Layout);
						jPanel3.add(jPanel6, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(30, 0, 0, 0), 0, 0));
						{
							jPanel8 = new JPanel();
							jPanel6.add(jPanel8, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
							jPanel8.setBorder(BorderFactory.createTitledBorder("服务器状态"));
							JPanel j=new JPanel();
							j.setOpaque(false);
							jPanel6.add(j, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
						}
						jPanel6.setOpaque(false);
						{
							jPanel7 = new JPanel();
							//jPanel6.add(jPanel7);
							jPanel7.setPreferredSize(new java.awt.Dimension(374, 147));
							jPanel7.setBorder(BorderFactory.createTitledBorder("服务器状态"));
						}
					}
					{
						jPanel9 = new JPanel();
						jPanel9.setOpaque(false);
						GridBagLayout jPanel9Layout = new GridBagLayout();
						jPanel3.add(jPanel9, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
						jPanel9Layout.rowWeights = new double[] {0.1};
						jPanel9Layout.rowHeights = new int[] {7};
						jPanel9Layout.columnWeights = new double[] {0.4, 0.1};
						jPanel9Layout.columnWidths = new int[] {7, 7};
						jPanel9.setLayout(jPanel9Layout);
						{
							CalendarFrame clock1=new CalendarFrame();
							  clock1.setBorder(BorderFactory.createTitledBorder(""));
							jPanel9.add(clock1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(30, 0, 0, 0), 0, 0));
						}
					}
				}
				{
					jPanel4 = new JPanel();
					jPanel4.setOpaque(false);
					GridBagLayout jPanel4Layout = new GridBagLayout();
					jPanel1.add(jPanel4, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 20), 0, 0));
					jPanel4Layout.rowWeights = new double[] {0.1};
					jPanel4Layout.rowHeights = new int[] {7};
					jPanel4Layout.columnWeights = new double[] {0.3, 0.1, 0.3};
					jPanel4Layout.columnWidths = new int[] {7, 7, 7};
					jPanel4.setLayout(jPanel4Layout);
					{
						jScrollPane1 = new JScrollPane();
						jPanel4.add(jScrollPane1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(10, 20, 0, 0), 0, 0));
						{
							ListModel jList1Model = 
								new DefaultComboBoxModel(
										new String[] { "Item One", "Item Two" });
							jList1 = new JList();
							jScrollPane1.setViewportView(jList1);
							jList1.setModel(jList1Model);
							jList1.setBackground(new java.awt.Color(0,0,0));
							jList1.setForeground(new java.awt.Color(255,255,255));
						}
					}
					{
						jScrollPane2 = new JScrollPane();
						jPanel4.add(jScrollPane2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(10, 0, 0, 0), 0, 0));
						{
							ListModel jList2Model = 
								new DefaultComboBoxModel(
										new String[] { "Item One", "Item Two" });
							jList2 = new JList();
							jScrollPane2.setViewportView(jList2);
							jList2.setModel(jList2Model);
							jList2.setBackground(new java.awt.Color(0,0,0));
							jList2.setForeground(new java.awt.Color(255,255,255));
						}
					}
					{
						jPanel10 = new JPanel();
						jPanel10.setOpaque(false);
						jPanel4.add(jPanel10, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
					}
				}
				{
					jPanel5 = new JPanel();
					jPanel5.setOpaque(false);
					GridBagLayout jPanel5Layout = new GridBagLayout();
					jPanel5Layout.rowWeights = new double[] {0.1};
					jPanel5Layout.rowHeights = new int[] {7};
					jPanel5Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
					jPanel5Layout.columnWidths = new int[] {7, 7, 7, 7};
					jPanel5.setLayout(jPanel5Layout);
					jPanel1.add(jPanel5, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(10, 10, 10, 0), 0, 0));
					jPanel5.setBorder(BorderFactory.createTitledBorder(new RoundBorder(),"操作"));
					{
					    jButtonqzqh = new JButton();
						jPanel5.add(jButtonqzqh, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 600, 0, 0), 0, 0));
						jButtonqzqh.setText("\u5f3a\u5236\u5207\u6362");
						jButtonqdbj = new JButton();
					   	 jPanel5.add(jButtonqdbj, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					   	jButtonqdbj.setText("\u542f\u52a8\u62a5\u8b66");
					   	jButtongbgj = new JButton();
					     jPanel5.add(jButtongbgj, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					     jButtongbgj.setText("\u5173\u95ed\u62a5\u8b66");
					     jButtonexit = new JButton();
						 jPanel5.add(jButtonexit, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
						 jButtonexit.setText("\u9000\u51fa");
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]){
		WaringMain1 f=new WaringMain1();
		f.setVisible(true);
	}
}
