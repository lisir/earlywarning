package com.warn;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.warn.utils.EncryptionDecryption;
import com.warn.utils.FileOperate;
import com.warn.utils.Md5;


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
public class RegisterWindow extends JFrame {
	private JPanel jPanel1;
	private JButton jButton1;
	private JButton jButton2;
	private JTextField jTextField2;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JTextField jTextField1;

    public RegisterWindow(){
    	
    	initGUI();
    }
	private void initGUI() {
		try {
			{
				int w = 478;
				 int h = 198;
				 this.setSize(478, 198);
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
				  final EncryptionDecryption des = new EncryptionDecryption("tourhb");// 自定义密钥
				  //设置位置
				  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				  this.setLocation((width-w)/2,(height-h)/2);
				getContentPane().setLayout(null);
				{
					jPanel1 = new JPanel(){
						Image bj =  new ImageIcon(getClass().getClassLoader().getResource("1.jpg")).getImage();

			    		@Override
			    		public void paintComponent(Graphics g) {
			    			super.paintComponent(g);
			    			g.drawImage(bj, 0, 0,this.getWidth(),this.getHeight(), this);
			    		}
					};
					getContentPane().add(jPanel1);
					jPanel1.setBounds(0, 0, 472, 170);
					jPanel1.setLayout(null);
					{
						jTextField1 = new JTextField();
						jPanel1.add(jTextField1);
						jTextField1.setFont(new java.awt.Font("新宋体",0,12));
						jTextField1.setBounds(112, 25, 265, 24);
					}
					{
						jLabel1 = new JLabel();
						jPanel1.add(jLabel1);
						jLabel1.setText("\u7528\u6237\u540d\uff1a");
						jLabel1.setFont(new java.awt.Font("新宋体",0,12));
						jLabel1.setBounds(47, 28, 53, 17);
					}
					{
						jLabel2 = new JLabel();
						jPanel1.add(jLabel2);
						jLabel2.setText("\u6ce8\u518c\u7801\uff1a");
						jLabel2.setFont(new java.awt.Font("新宋体",0,12));
						jLabel2.setBounds(50, 69, 54, 17);
					}
					{
						jTextField2 = new JTextField();
						jPanel1.add(jTextField2);
						jTextField2.setFont(new java.awt.Font("新宋体",0,12));
						jTextField2.setBounds(113, 66, 264, 24);
					}
					{
						jButton1 = new JButton();
						jPanel1.add(jButton1);
						jButton1.setText("\u786e\u5b9a");
						jButton1.setFont(new java.awt.Font("新宋体",0,12));
						jButton1.setBounds(96, 115, 99, 24);
						jButton1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								String usrname=jTextField1.getText();
								String zcm=jTextField2.getText();
								if(null!=usrname&&usrname.length()>0){
									if(null!=zcm&&zcm.length()>0){
										try {
											String ip=Command.executeCommand("ifconfig");
											if(null!=ip){
												int b=ip.indexOf("HWaddr");
												int e=ip.indexOf("inet addr");
												usrname=usrname+ip.substring(b+6,e).trim();
											}
											String zc=Md5.encryptmd5(des.encrypt(usrname));
											if(zcm.trim().equals(zc)){
												StringBuilder str=new StringBuilder();
												str.append("username=");
												str.append(usrname);
												str.append("\r\n");
												str.append("registernum=");
												str.append(zc);
												FileOperate.wirtefile("/etc/temp/2.properties",str.toString(),"");
												init();
											}else{
												JOptionPane.showMessageDialog(null, "注册码错误", "友情提示",  JOptionPane.ERROR_MESSAGE);
											}
										} catch (Exception e) {
											// TODO Auto-generated catch block
										}
									}else{
										JOptionPane.showMessageDialog(null, "注册码不能为空", "友情提示",  JOptionPane.ERROR_MESSAGE);
									}
								}else{
									JOptionPane.showMessageDialog(null, "用户名不能为空", "友情提示",  JOptionPane.ERROR_MESSAGE);
								}
							}
						});
					}
					{
						jButton2 = new JButton();
						jPanel1.add(jButton2);
						jButton2.setText("\u53d6\u6d88");
						jButton2.setFont(new java.awt.Font("新宋体",0,12));
						jButton2.setBounds(283, 115, 77, 24);
						jButton2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.exit(0);
							}
						});
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//验证成功登陆
	private void init(){
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
	}
	public static void main(String[] args) {
		RegisterWindow g=new RegisterWindow();
		g.setVisible(true);
	}

}
