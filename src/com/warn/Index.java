package com.warn;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Calendar;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JPanel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.warn.dialog.ErrorDialog;
import com.warn.dialog.InitDialog;
import com.warn.dialog.Initdeploy;
import com.warn.utils.EncryptionDecryption;
import com.warn.utils.FileOperate;
import com.warn.utils.Md5;
import com.warn.utils.PropertiesUtil;



/*import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;*/


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
/**
 * 配置界面
 * java -cp heartbeat-detection.jar com.warn.InitWindow
*/
public class Index extends JFrame {
	
			public Index(){
				super();
				initGUI();
				init();
			}
	/**
	 * 
	 */
	private static final long serialVersionUID = -6860557936104901611L;
	private JTextField jTextField1;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JLabel jLabel10;
	private JPanel jPanel4;
	private JPanel jPanel3;
	private JLabel jLabel3;
	private JButton jButton4;
	private JButton jButton3;
	private JPanel jPanelopertion;
	private JTextField jTextField8;
	private JLabel jLabel9;
	private JTextField jTextField7;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JPanel jPanel1;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JLabel jLabel5;
	private JLabel jLabel2;
	private JPanel jPanelbeij;
	private JLabel jLabel6;
	private JTextField jTextField2;
	private JLabel jLabel4;
	private JLabel jLabel1;
	private JPanel jPanelbj;
	private JPanel jPanel2;
	private InitDialog d=null;
	public InitDialog getD() {
		d=new InitDialog(this, "提示", true);
		return d;
	}
	private void initGUI() {
		try {
			{
				 int w = 751;
				 int h = 484;
				this.setSize(751, 484);
				getContentPane().setLayout(null);
				getContentPane().setBackground(new java.awt.Color(238,238,238));
				getContentPane().add(getJPanel2());
				Image bj =  new ImageIcon(getClass().getClassLoader().getResource("logo.png")).getImage();
				this.setIconImage(bj);
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
				  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * main方法
	 * @param args
	 */
	public static void main(String[] args){
//		Command.executeCommand("chmod a+x /etc/temp/HOST1-MASTER/HOST1-HA-CONF.SH");
//		String s1=Command.executeCommand("/etc/temp/HOST1-MASTER/HOST1-HA-CONF.SH 192.168.170.128 192.168.170.254 db_a db_b 192.168.170.132");
//		JOptionPane.showMessageDialog(null, s1, "标题",  JOptionPane.ERROR_MESSAGE);
//		Index index1=new Index();
//		index1.setVisible(true);
//		  try {
//			UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedLookAndFeelException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//FileOperate.readfile("/etc/temp/")
		File file1=new File("/etc/temp/2.properties");
		if(file1.exists()){
			PropertiesUtil p=new PropertiesUtil(file1);
			String username=p.getProper("username");
			String zcm=p.getProper("registernum");
			try {
			EncryptionDecryption des = new EncryptionDecryption("tourhb");// 自定义密钥
			if(null!=username&&null!=zcm&&zcm.equals(Md5.encryptmd5(des.encrypt(username)))){
				//判断是否安装如果安装完成直接进入监测窗体否则进入设置页面
				Index index=new Index();
				String command=Command.executeCommand("cat /proc/drbd");
				if(command.contains("Primary")||command.contains("Secondary")){
					if(command.contains("Primary/Secondary")){
						//Command.executeCommand("service mysqld restart");
						FileOperate.wirtefile("/etc/temp/2.txt", "主机", "");
					}else if(command.contains("Secondary/Primary")){
						FileOperate.wirtefile("/etc/temp/2.txt","备机",null);
					}
					int i=JOptionPane.showConfirmDialog(null, "本机已经安装双击热备，是否重新安装,点击是则重新安装,点击否则进入监控页面.", "友情提示",  JOptionPane.INFORMATION_MESSAGE);
					if(i==1){
						WaringMain main=new WaringMain();
						main.setVisible(true);
					}else if(i==0){
						index.setVisible(true);
					}
					
					
				}else{
					index.setVisible(true);
			   }
			}else{
				RegisterWindow g=new RegisterWindow();
				g.setVisible(true);
			}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}else{
			RegisterWindow g=new RegisterWindow();
			g.setVisible(true);
		}
		
	
	
}

	private JPanel getJPanel2() {
		if(jPanel2 == null) {
			jPanel2 = new JPanel(){

				Image bj =  new ImageIcon(getClass().getClassLoader().getResource("1.jpg")).getImage();

	    		@Override
	    		public void paintComponent(Graphics g) {
	    			super.paintComponent(g);
	    			g.drawImage(bj, 0, 0, this);
	    		}
				
			};
			jPanel2.setBounds(0, 0, 745, 456);
			jPanel2.setLayout(null);
			jPanel2.add(getJPanelbj());
			jPanel2.add(getJPanelbeij());
			jPanel2.add(getJPanel1());
			jPanel2.add(getJPanelopertion());
			jPanel2.add(getJLabel3());
			//jPanel2.add(getJPanel3());
			jPanel2.add(getJPanel4());
			jPanel2.add(getJLabel10());
		}
		return jPanel2;
	}
	private JPanel getJPanelbj() {
		if (jPanelbj == null) {
			jPanelbj = new JPanel();
			jPanelbj.setBounds(69, 65, 337, 91);
			jPanelbj.setBorder(BorderFactory.createTitledBorder("\u4e3b\u673a\u914d\u7f6e"));
			jPanelbj.setLayout(null);
			jPanelbj.add(getJLabel1());
			jPanelbj.add(getJLabel4());
			jPanelbj.add(getJTextField1());
			jPanelbj.add(getJTextField2());
			jPanelbj.add(getJLabel6());
			jPanelbj.add(getJTextField5());
			jPanelbj.setOpaque(false);
		}
		return jPanelbj;
	}
	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("\u4e3b\u673aip\u5730\u5740\uff1a");
			jLabel1.setBounds(5, 22, 105, 17);
		}
		return jLabel1;
	}
	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("\u4e3b\u673a\u540d\u79f0\uff1a");
			jLabel4.setBounds(5, 58, 73, 17);
		}
		return jLabel4;
	}
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setBounds(88, 19, 120, 24);
			jTextField1.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
		}
		return jTextField1;
	}
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
			jTextField2.setBounds(90, 55, 118, 24);
		}
		return jTextField2;
	}
	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("\u865a\u62dfip\u5730\u5740:");
			jLabel6.setBounds(220, 22, 95, 17);
		}
		return jLabel6;
	}
	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
			jTextField5.setBounds(214, 55, 118, 24);
		}
		return jTextField5;
	}
	private JPanel getJPanelbeij() {
		if (jPanelbeij == null) {
			jPanelbeij = new JPanel();
			jPanelbeij.setBounds(438, 65, 227, 91);
			jPanelbeij.setLayout(null);
			jPanelbeij.setBorder(BorderFactory.createTitledBorder(new RoundBorder(),"\u5907\u673a\u914d\u7f6e"));
			jPanelbeij.add(getJLabel2());
			jPanelbeij.add(getJLabel5());
			jPanelbeij.add(getJTextField3());
			jPanelbeij.add(getJTextField4());
			jPanelbeij.setOpaque(false);
		}
		return jPanelbeij;
	}
	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("\u5907\u673aip\u5730\u5740\uff1a");
			jLabel2.setBounds(9, 22, 105, 17);
		}
		return jLabel2;
	}
	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("\u5907\u673a\u540d\u79f0\uff1a");
			jLabel5.setBounds(11, 58, 66, 17);
		}
		return jLabel5;
	}
	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
			jTextField3.setBounds(89, 55, 118, 24);
		}
		return jTextField3;
	}
	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
			jTextField4.setBounds(88, 19, 118, 24);
		}
		return jTextField4;
	}
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			
			jPanel1.setBounds(69, 183, 596, 73);
			jPanel1.setBorder(new RoundBorder());
			jPanel1.setLayout(null);
			jPanel1.add(getJLabel7());
			jPanel1.add(getJTextField6());
			jPanel1.add(getJLabel8());
			jPanel1.add(getJTextField7());
			jPanel1.add(getJLabel9());
			jPanel1.add(getJTextField8());
			jPanel1.setOpaque(false);
		}
		return jPanel1;
	}
	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("\u5b50\u7f51\u63a9\u7801\uff1a");
			jLabel7.setBounds(5, 10, 74, 17);
		}
		return jLabel7;
	}
	private JTextField getJTextField6() {
		if (jTextField6 == null) {
			jTextField6 = new JTextField();
			jTextField6.setBounds(73, 7, 139, 24);
			jTextField6.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
		}
		return jTextField6;
	}
	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("\u9ed8\u8ba4\u7f51\u5173\uff1a");
			jLabel8.setBounds(239, 10, 81, 17);
		}
		return jLabel8;
	}
	private JTextField getJTextField7() {
		if (jTextField7 == null) {
			jTextField7 = new JTextField();
			jTextField7.setBounds(320, 7, 135, 24);
			jTextField7.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
		}
		return jTextField7;
	}
	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setText("\u5206\u533a\u540d\u79f0\uff1a");
			jLabel9.setBounds(5, 39, 68, 17);
		}
		return jLabel9;
	}
	private JTextField getJTextField8() {
		if (jTextField8 == null) {
			jTextField8 = new JTextField();
			jTextField8.setBounds(73, 36, 139, 24);
			jTextField8.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
			jTextField8.setForeground(new java.awt.Color(0,0,0));
		}
		return jTextField8;
	}
	private JPanel getJPanelopertion() {
		if (jPanelopertion == null) {
			jPanelopertion = new JPanel();
			jPanelopertion.setLayout(null);
			jPanelopertion.setBounds(69, 292, 596, 86);
			jPanelopertion.setBorder(BorderFactory.createTitledBorder(new RoundBorder(),"\u64cd\u4f5c",TitledBorder.LEADING,TitledBorder.TOP));
			jPanelopertion.add(getJButton3());
			jPanelopertion.add(getJButton4());
			jPanelopertion.setOpaque(false);
		}
		return jPanelopertion;
	}
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("\u8bbe\u7f6e");
			jButton3.setBounds(283, 34, 98, 24);
			jButton3.setBorder(new RoundBorder());
			//设置按钮进行相关设置
			jButton3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					if(validateinit()){
						Thread t=new Thread(getD());
						t.start();
						//配置主机名，IP，网络等
						Initdeploy initDeploy=new Initdeploy(jTextField1.getText(), jTextField4.getText(), jTextField2.getText(), jTextField3.getText(), jTextField5.getText(), jTextField6.getText(), jTextField7.getText(), jTextField8.getText(),d);
						Thread t2=new Thread(initDeploy);
						t2.start();
					}
				}
			});
		}
		return jButton3;
	}
	private JButton getJButton4() {
		if (jButton4 == null) {
		
			jButton4 = new JButton();
			//{
//				Image bj =  new ImageIcon(getClass().getClassLoader().getResource("Security.jpg")).getImage();
//
//				@Override
//	    		public void paintComponent(Graphics g) {
//	    			super.paintComponent(g);
//	    			g.drawImage(bj, 0, 0, this);
//	    		}
//	    		public void paintBorder(Graphics g) {
//	    			//画边界区域
//	    			g.setColor(Color.GRAY);
//	    			g
//	    			    .drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1,
//	    			      20, 20);
//	    			}
//			};
			//jButton4.setContentAreaFilled(false);
			jButton4.setText("\u9000\u51fa");
			jButton4.setBounds(472, 34, 90, 24);
			jButton4.setBorder(new RoundBorder());
			
			jButton4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					System.exit(0);
				}
			});
		}
		return jButton4;
	}
	
	private JLabel getJLabel3() {
		if(jLabel3 == null) {
			jLabel3 = new JLabel();
			Calendar c=Calendar.getInstance();
			jLabel3.setText("Copyright2012 ");
			jLabel3.setBounds(195, 412, 110, 17);
		}
		return jLabel3;
	}
	
	private JPanel getJPanel3() {
		if(jPanel3 == null) {
			jPanel3 = new JPanel(){
				Image bj =  new ImageIcon(getClass().getClassLoader().getResource("logo.png")).getImage();

	    		@Override
	    		public void paintComponent(Graphics g) {
	    			super.paintComponent(g);
	    			g.drawImage(bj, 0, 0,this.getWidth(),this.getHeight(), this);
	    		}
			};
			jPanel3.setOpaque(false);
			jPanel3.setBounds(24, 18, 32, 32);
		}
		return jPanel3;
	}
	
	private JPanel getJPanel4() {
		if(jPanel4 == null) {
			jPanel4 = new JPanel(){
				Image bj =  new ImageIcon(getClass().getClassLoader().getResource("logo.png")).getImage();
	    		public void paintComponent(Graphics g) {
	    			super.paintComponent(g);
	    			g.drawImage(bj, 0, 0,this.getWidth(),this.getHeight(), this);
	    		}
			};
			jPanel4.setOpaque(false);
			jPanel4.setBounds(304, 403, 32, 32);
		}
		return jPanel4;
	}
	
	private JLabel getJLabel10() {
		if(jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("\u6d4e\u5357\u65b0\u4e91\u9e4f\u7535\u5668\u8bbe\u5907\u6709\u9650\u516c\u53f8");
			jLabel10.setBounds(336, 412, 203, 17);
		}
		return jLabel10;
	}
//初始化避免用户充分输入
	private void init(){
		File file=new File("/etc/temp/1.properties");
		if(file.exists()){
			PropertiesUtil p=new PropertiesUtil(file);
			jTextField1.setText(p.getProper("ip1"));
			jTextField4.setText(p.getProper("ip2"));
			jTextField2.setText(p.getProper("host1"));
			jTextField3.setText(p.getProper("host2"));
			jTextField5.setText(p.getProper("invented"));
			jTextField6.setText(p.getProper("dns"));
			jTextField7.setText(p.getProper("gateway"));
			jTextField8.setText(p.getProper("diskadr"));
			String restart=FileOperate.readfile("/etc/temp/iprestart.txt");
			 if(null!=restart&&restart.equals("0")){
				 this.jButton3.doClick();
			 }
		}
	}
	
	
	private  boolean validateinit(){
		Pattern pa = Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
		String ipzj=jTextField1.getText();
		String ipbj=jTextField4.getText();
		String ipxn=jTextField5.getText();
		String zjmc=jTextField2.getText();
		String bjmc=jTextField3.getText();
		String zym=jTextField6.getText();
		String wg=jTextField7.getText();
		String ypdz=jTextField8.getText();
		ErrorDialog init=new ErrorDialog(this,"友情提示",false);
		if(null==ipzj||!pa.matcher(ipzj).find()){
			///JOptionPane.showMessageDialog(this,"主机ip地址输入有误" , "友情提示",  JOptionPane.ERROR_MESSAGE);
			init.showError("主机ip地址输入有误");
			return false;
		}
		if(null==ipbj||!pa.matcher(ipbj).find()){
			init.showError("备机ip地址输入有误");
			return false;
		}
		if(null==ipxn||!pa.matcher(ipxn).find()){
			init.showError("虚拟ip输入有误");
			return false;
		}
		if(null==zjmc||zjmc.trim().length()<1){
			init.showError("请输入主机名称");
			return false;
		}
		if(null==bjmc||bjmc.trim().length()<1){
			init.showError("请输入备机名称");
			return false;
		}
		if(null==zym||!pa.matcher(zym).find()){
			init.showError("子网掩码输入有误");
			return false;
		}
		if(null==wg||!pa.matcher(wg).find()){
			init.showError("默认网关输入有误");
			return false;
		}
		if(null==ypdz||ypdz.trim().length()<1){
			init.showError("请输入分区名称");
			return false;
		}
		return true;
	}
}
