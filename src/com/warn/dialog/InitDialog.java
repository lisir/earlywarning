package com.warn.dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

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
public class InitDialog extends JDialog implements Runnable{
	private int i=0;
     private JLabel jLabel1;
     private JPanel panel1;
     private JPanel jPanelback;
     int x;
     public InitDialog(Frame owner, String title, boolean modal) {
         super(owner, title, modal);
         try {
        	 setBak();
             //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
             jbInit();
            // pack();
         } catch (Exception exception) {
             exception.printStackTrace();
         }
     }
 
    public InitDialog() {
         this(new Frame(), "友情提示", false);
        
     }
 
    private void jbInit() throws Exception {
    	int w=299;
    	int h=173;
         this.setSize(299, 173);
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
        	 jPanelback.setBounds(0, 0, 293, 145);
        	 {
        		 jLabel1 = new JLabel();
        		 jPanelback.add(jLabel1);
        		 jLabel1.setText("\u6b63\u5728\u5904\u7406\u8bf7\u7a0d\u540e....");
        		 jLabel1.setBounds(119, 51, 141, 17);
        	 }
        	 {
        		 panel1 = new JPanel(){
        			 Image bj =  new ImageIcon(getClass().getClassLoader().getResource("1.gif")).getImage();

     	    		@Override
     	    		public void paintComponent(Graphics g) {
     	    			super.paintComponent(g);
     	    			g.drawImage(bj, 0, 0, this);
     	    		}
        		 };
        		 jPanelback.add(panel1);
        		 panel1.setOpaque(false);
        		 panel1.setLayout(null);
        		 panel1.setBounds(12, 12, 95, 95);
        	 }
         }
     }
    public void setBak(){ 
    	  ((JPanel)this.getContentPane()).setOpaque(false);
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
		 InitDialog init=new InitDialog();
		 Thread r=new Thread(init);
		 r.start();
		 int i=JOptionPane.showConfirmDialog(null, "本机已经安装双击热备，是否重新安装,点击是则重新安装,点击否则进入监控页面.", "友情提示",  JOptionPane.INFORMATION_MESSAGE);
		 System.out.print(i);
		 
	 }

	public JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(JLabel jLabel1) {
	}
 } 