package com.warn.dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 import javax.swing.JPanel;
 import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

import javax.swing.JButton;
 

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
public class ErrorDialog extends JDialog implements Runnable{
	private int i=0;
     Thread t;
     private JLabel jLabel1;
     private JPanel panel1;
     private JButton jButton1;
     private JPanel jPanelback;
     int x;
     public ErrorDialog(Frame owner, String title, boolean modal) {
         super(owner, title, modal);
         try {
             //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
             jbInit();
            // pack();
         } catch (Exception exception) {
             exception.printStackTrace();
         }
     }
 
    public ErrorDialog() {
         this(new Frame(), "友情提示", false);
        
     }
 
    private void jbInit() throws Exception {
    	int w=281;
    	int h=175;
         this.setSize(281, 175);
    	 //设置窗口的大小不可改变
		  this.setResizable(false);
		 //获取屏幕分辨率的工具集
		  Toolkit tool = Toolkit.getDefaultToolkit(); 
		  //利用工具集获取屏幕的分辨率
		  Dimension dim = tool.getScreenSize();
		  //获取屏幕分辨率的高度
		  int height = (int)dim.getHeight();
		  //获取屏幕分辨率的宽度
		  int width = (int)dim.getWidth();
		  //设置位置
		  this.setLocation((width-w)/2,(height-h)/2);
         this.getContentPane().setLayout(null);
         {
        	 jPanelback = new JPanel(){
        		 Image bj =  new ImageIcon(getClass().getClassLoader().getResource("1.jpg")).getImage();

 	    		@Override
 	    		public void paintComponent(Graphics g) {
 	    			super.paintComponent(g);
 	    			g.drawImage(bj, 0, 0, this);
 	    		}
        	 };
        	 getContentPane().add(jPanelback);
        	 jPanelback.setLayout(null);
        	 jPanelback.setBounds(0, 0, 281, 145);
        	 {
        		 jLabel1 = new JLabel();
        		 jPanelback.add(jLabel1);
        		 jLabel1.setBounds(67, 53, 174, 17);
        	 }
        	 {
        		 panel1 = new JPanel(){
        			 Image bj =  new ImageIcon(getClass().getClassLoader().getResource("error.png")).getImage();

     	    		@Override
     	    		public void paintComponent(Graphics g) {
     	    			super.paintComponent(g);
     	    			g.drawImage(bj, 0, 0, this);
     	    		}
        		 };
        		 jPanelback.add(panel1);
        		 panel1.setOpaque(false);
        		 panel1.setLayout(null);
        		 panel1.setBounds(29, 48, 49, 42);
        	 }
        	 {
        		 jButton1 = new JButton();
        		 jPanelback.add(jButton1);
        		 jButton1.setText("\u786e\u5b9a");
        		 jButton1.setBounds(102, 103, 84, 24);
        		 jButton1.addActionListener(new ActionListener() {
        			 public void actionPerformed(ActionEvent evt) {
        				 setVisible(false);
        			 }
        		 });
        	 }
         }

     }

    public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	protected void processWindowEvent(WindowEvent e) {  
        if (e.getID() == WindowEvent.WINDOW_CLOSING)  
           return; //直接返回，阻止默认动作，阻止窗口关闭  
         super.processWindowEvent(e); //该语句会执行窗口事件的默认动作(如：隐藏)  
   }  
	 public void run()
     {
    	this.setVisible(true);
    	while(i!=3){
    		//System.out.println("执行");
    	}
    	this.setVisible(false);
    	this.dispose();
     }
	 
	 public static void main(String args[]){
		 ErrorDialog init=new ErrorDialog();
		init.setVisible(true);
		 
	 }
     //显示错误窗口
	 public void showError(String message){
		 jLabel1.setText(message);
		 setVisible(true);
	 }
	 
	public JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(JLabel jLabel1) {
	}
 } 