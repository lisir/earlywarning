package com.warn.dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JLabel;
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
public class Dialog extends JDialog implements Runnable{
     JPanel panel1 = new JPanel(){

    	Image bj =  new ImageIcon(getClass().getClassLoader().getResource("1.gif")).getImage();

    		@Override
    		public void paintComponent(Graphics g) {
    			super.paintComponent(g);
    			g.drawImage(bj, 0, 0, this);
    		}
    	 
     };
     Thread t;
     int x;
     JButton jButton1 = new JButton();
     public Dialog(Frame owner, String title, boolean modal) {
         super(owner, title, modal);
         try {
        	 setBak();
             setDefaultCloseOperation(DISPOSE_ON_CLOSE);
             jbInit();
             pack();
         	int w=485;
	    	int h=267;
             this.setSize(w, h);
         } catch (Exception exception) {
             exception.printStackTrace();
         }
     }
 
    public Dialog() {
         this(new Frame(), "Dialog1", false);
     }
 
    private void jbInit() throws Exception {
	    	int w=485;
	    	int h=267;
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
         panel1.setLayout(null);
         this.getContentPane().setLayout(null);
         this.getContentPane().add(panel1, null);
         panel1.add(jButton1, null);
         jButton1.setBounds(new Rectangle(119, 98, 129, 33));
         jButton1.setText("jButton1");
         jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("add.ico")));
         panel1.setBounds(10, 10, 447, 219);
         panel1.setOpaque(false);
         t=new Thread(this);
         t.start();
       //重写这个方法  
       //激活窗口事件  
                this.enableEvents(AWTEvent.WINDOW_EVENT_MASK);  

        

     }
    public void setBak(){ 
    	  ((JPanel)this.getContentPane()).setOpaque(false);
    	   ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("add.ico")); //添加图片
    	   JLabel background = new JLabel(img);this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE)); 
    	   background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight()); 
    	  } 

    protected void processWindowEvent(WindowEvent e) {  
        if (e.getID() == WindowEvent.WINDOW_CLOSING)  
           return; //直接返回，阻止默认动作，阻止窗口关闭  
         super.processWindowEvent(e); //该语句会执行窗口事件的默认动作(如：隐藏)  
   }  
     public void run()
     {
         for(x=5;x>0;x--)
         {
             jButton1.setText("退出(" + Integer.toString(x) + ")");
             try {
                 t.sleep(1000);
             } catch (Exception e) {
                 System.out.println("异常:" + e);
             }
         }
         this.dispose();
     }
 	public static void main(String[] args){
 		Dialog d=new Dialog();
 		d.setVisible(true);
 	}
 } 