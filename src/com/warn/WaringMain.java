package com.warn;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import com.warn.calender.CalendarFrame;
import com.warn.dialog.InitDialog;
import com.warn.socket.Client;
import com.warn.socket.Server;
import com.warn.utils.FileOperate;

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
public class WaringMain extends JFrame{
	private DefaultListModel  jleftModel ;
	private JScrollPane jScrollPane2;
	private JList jList1;
	private JScrollPane jScrollPane1;
	private JList jerrorList;
	private CalendarFrame clock1;
	private JLabel jLabel1;
	private JPanel jPanel1;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JButton jButton1;
	private JPanel jPanel2;
	private JLabel jresultbj;
	private JLabel jresult;
	private JPanel jPanel3;
	private JLabel jLabel2;
	private JPanel jPanelbackground;
	private DefaultListModel  jrightModel ;
	//构造方法
	public WaringMain(){
		super();
		initGUI();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//启动socket服务
		new Server().start();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2021606223241661001L;
	private  Clock clock;
	private Timer timer;
	private void initGUI() {
		try {
			{
				int w = 1147;
				 int h = 653;
				this.setSize(1147, 653);
				getContentPane().setBackground(new java.awt.Color(238,238,238));
				getContentPane().setLayout(null);
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
				  this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("logo.png")).getImage());
				  {
					  jPanelbackground = new JPanel(){
							Image bj =  new ImageIcon(getClass().getClassLoader().getResource("1.jpg")).getImage();

				    		@Override
				    		public void paintComponent(Graphics g) {
				    			super.paintComponent(g);
				    			g.drawImage(bj, 0, 0,this.getWidth(),this.getHeight(), this);
				    		}
					  };
					  getContentPane().add(jPanelbackground);
					  jPanelbackground.setLayout(null);
					  jPanelbackground.setBounds(0, 0, 1141, 625);
					  {
						  jLabel2 = new JLabel();
						  jPanelbackground.add(jLabel2);
						  jLabel2.setText("Linux\u7248\u53cc\u673a\u70ed\u5907\u5fc3\u8df3\u76d1\u6d4b\u7cfb\u7edfV1.0");
						  jLabel2.setBounds(227, 18, 513, 34);
						  jLabel2.setFont(new java.awt.Font("新宋体",1,26));
					  }
					  {
						  jPanel3 = new JPanel();
						  jPanelbackground.add(jPanel3);
						  jPanel3.setBounds(548, 72, 368, 154);
						  jPanel3.setBackground(new java.awt.Color(238,238,238));
						  jPanel3.setLayout(null);
						 // jPanel3.setOpaque(false);
						  jPanel3.setBorder(BorderFactory.createTitledBorder("\u670d\u52a1\u5668\u72b6\u6001"));
						  {
							  jresult = new JLabel();
								jresult.addPropertyChangeListener(new PropertyChangeListener() {
									public void propertyChange(PropertyChangeEvent evt) {
										if(jresult.getText().contains("异常"))
										 jresult.setForeground(new java.awt.Color(255,0,0));
										else{
											jresult.setForeground(new java.awt.Color(0,0,0));
										}
									}
								});
							  jPanel3.add(jresult);
							  jresult.setText("\u4e3b\u673aip 192.168.1.120  \u6b63\u5e38");
							  jresult.setBounds(40, 34, 311, 17);
							  jresult.setFont(new java.awt.Font("新宋体",0,16));
						  }
						  {
							  jresultbj = new JLabel();
							  jresultbj.addPropertyChangeListener(new PropertyChangeListener() {
									public void propertyChange(PropertyChangeEvent evt) {
										if(jresultbj.getText().contains("异常"))
											jresultbj.setForeground(new java.awt.Color(255,0,0));
										else
											jresultbj.setForeground(new java.awt.Color(0,0,0));
									}
								});
							  jPanel3.add(jresultbj);
							  jresultbj.setText("\u5907\u673aip 192.168.1.110  \u6b63\u5e38");
							  jresultbj.setBounds(40, 71, 311, 17);
							  jresultbj.setFont(new java.awt.Font("新宋体",0,16));
						  }
					  }
					  {
						  jPanel2 = new JPanel();
						  jPanel2.setOpaque(false);
						  jPanelbackground.add(jPanel2);
						  jPanel2.setBounds(22, 537, 1054, 68);
						  jPanel2.setBorder(BorderFactory.createTitledBorder(null,"\u64cd\u4f5c",TitledBorder.LEADING,TitledBorder.TOP));
						  jPanel2.setLayout(null);
						  {
							  jButton1 = new JButton();
							  jPanel2.add(jButton1);
							  jButton1.setText("\u5f3a\u5236\u5207\u6362");
							  jButton1.setBounds(304, 28, 87, 23);
							  jButton1.setFont(new java.awt.Font("新宋体",0,12));
							  jButton1.addActionListener(new ActionListener() {
								  public void actionPerformed(ActionEvent evt) {
									  //System.out.println("jButton1.actionPerformed, event="+evt);
									  //TODO add your code for jButton1.actionPerformed
									  //jresult.setText("ff");
									  String ip=FileOperate.readfile("/etc/temp/1.txt");
									  String bjip="";
									  if(null!=ip&&!"".equals(ip)){
										  String[] ips=ip.split(",");
										   bjip=ips[0];
										  String zjip=Command.executeCommand("ifconfig");
										  if(zjip.contains(ips[0])){
											  bjip=ips[1];
										  }
									  }
									  String command=Command.executeCommand("cat /proc/drbd");
									  if(command.contains("Primary/Secondary")){
											  Command.executeCommand("service heartbeat stop");
											  Client client=new Client();
											  qhzt(client.sendMessage(bjip, "qhzbj", 10800));
										  
									  }else{
										  //JOptionPane.showMessageDialog(null, "不是主机不能切换", "提示",  JOptionPane.ERROR_MESSAGE);
										//启动mysql
											Command.executeCommand("service mysqld restart");
											//启动httpd
											Command.executeCommand("service httpd start");
											//启动drbd
											Command.executeCommand("service drbd start");
											Client client=new Client();
											 qhzt(client.sendMessage(bjip, "qhbj", 10800));
									  }
								  }
							  });
						  }
						  {
							  jButton2 = new JButton();
							  jPanel2.add(jButton2);
							  jButton2.setText("\u542f\u52a8\u62a5\u8b66");
							  jButton2.setBounds(505, 28, 92, 23);
							  jButton2.setFont(new java.awt.Font("新宋体",0,12));
							  jButton2.addActionListener(new ActionListener() {
								  public void actionPerformed(ActionEvent evt) {
									  if(timer==null){
										  timer=new Timer();
										  timer.schedule(new WaringTask(), 1000, 2000);
									  }
								  }
							  });
						  }
						  {
							  jButton3 = new JButton();
							  jPanel2.add(jButton3);
							  jButton3.setText("\u5173\u95ed\u62a5\u8b66");
							  jButton3.setBounds(706, 28, 87, 23);
							  jButton3.setFont(new java.awt.Font("新宋体",0,12));
							  jButton3.addActionListener(new ActionListener() {
								  public void actionPerformed(ActionEvent evt) {
									  if(timer!=null){
										  timer.cancel();
										  timer=null;
									  }
								  }
							  });
						  }
						  {
							  jButton4 = new JButton();
							  jPanel2.add(jButton4);
							  jButton4.setText("\u9000\u51fa");
							  jButton4.setBounds(910, 28, 96, 23);
							  jButton4.setFont(new java.awt.Font("新宋体",0,12));
							  jButton4.addActionListener(new ActionListener() {
								  public void actionPerformed(ActionEvent evt) {
									  //TODO add your code for jButton4.actionPerformed
									  System.exit(0);
								  }
							  });
						  }
					  }
					  {
						  jPanel1 = new JPanel();
						  jPanelbackground.add(jPanel1);
						  jPanel1.setBounds(500, 318, 85, 59);
						  jPanel1.setBorder(BorderFactory.createTitledBorder("\u76d1\u63a7"));
						  {
							  jLabel1 = new JLabel();
							  jPanel1.add(jLabel1);
							  jLabel1.setText("\u5b9e\u65f6\u76d1\u63a7");
							  jLabel1.setFont(new java.awt.Font("新宋体",0,12));
						  }
					  }
					  {
						  //					clock=new Clock();
						  //					getContentPane().add(clock);
						  //					clock.setBounds(34, -22, 325, 267);
						  CalendarFrame clock1=new CalendarFrame();
						  jPanelbackground.add(clock1);
						  clock1.setBounds(169, 83, 249, 149);
						  clock1.setBorder(BorderFactory.createTitledBorder(""));
						  clock1.setFont(new java.awt.Font("新宋体",0,12));
					  }
					  {
						  jScrollPane2 = new JScrollPane();
						  jPanelbackground.add(jScrollPane2);
						  jScrollPane2.setBounds(592, 251, 464, 276);
						  {
							  jrightModel=new DefaultListModel();
							  jerrorList = new JList();
							  jScrollPane2.setViewportView(jerrorList);
							  jerrorList.setModel(jrightModel);
							  jerrorList.setAutoscrolls(false);
							  jerrorList.setBounds(94, 217, 400, 273);
							  jerrorList.setBackground(new java.awt.Color(0,0,0));
							  jerrorList.setForeground(new java.awt.Color(255,128,128));
							  jerrorList.setFont(new java.awt.Font("新宋体",0,12));
							  //jerrorList.setPreferredSize(new java.awt.Dimension(361, 229));
						  }
						  //jScrollPane2.setAutoscrolls(true);
					  }
					  {
						  jScrollPane1 = new JScrollPane();
						  jPanelbackground.add(jScrollPane1);
						  jScrollPane1.setBounds(32, 249, 464, 276);
						  {
							  jleftModel=new DefaultListModel();
							  jList1 = new JList();
							  jScrollPane1.setViewportView(jList1);
							  jList1.setModel(jleftModel);
							  jList1.setBounds(366, 323, 361, 273);
							  jList1.setBackground(new java.awt.Color(0,0,0));
							  jList1.setForeground(new java.awt.Color(255,255,128));
							  jList1.setFont(new java.awt.Font("新宋体",0,12));
							  //jList1.setPreferredSize(new java.awt.Dimension(361, 228));
						  }
					  }
				  }
			}
			{
				//启动定时器 定时扫描主备机ip是否正常
				final String ip=FileOperate.readfile("/etc/temp/1.txt");
				final String flagzbjtemp=FileOperate.readfile("/etc/temp/2.txt");
				if(ip.contains(",")){
					final String[] ips=ip.split(",");
					 String zjipzdtemp=ips[1];//主机ip
					 String bjiptemp=ips[0];//备机ip
					//查看主机是否连接正常
					String zjip=Command.executeCommand("ifconfig");
					if(zjip.contains(ips[0])){
						bjiptemp=ips[1];
						zjipzdtemp=ips[0];
						
					}
					if(flagzbjtemp.equals("主机")){
						Command.executeCommand("service mysqld restart");
						jresult.setText(flagzbjtemp+"："+zjipzdtemp+" 正常");
						jresultbj.setText("备机："+bjiptemp+" 正常");
					}else{
						jresultbj.setText(flagzbjtemp+"："+zjipzdtemp+" 正常");
						jresult.setText("主机："+bjiptemp+" 正常");
					}
					final String zjipzd=zjipzdtemp;
					final String bjip=bjiptemp;
				Timer timer = new Timer();
			  timer.schedule(new TimerTask() {
				public void run() {
					//boolean flag=true;
					// TODO Auto-generated method stub
					//jrightModel.addElement("不正常不正常不正常不正常不正常不正常不正常不正常..........");
					if(jleftModel.size()>200){
						jleftModel.clear();
					}
					if(jrightModel.size()>200){
						jrightModel.clear();
					}
					boolean bjzk=true;//通
					boolean nl=true;
					String sflt=Command.executeCommand("ping "+bjip+" -c1").trim().toLowerCase();
					//JOptionPane.showMessageDialog(null, sflt+"====="+sflt.contains("unreachable"), "标题",  JOptionPane.ERROR_MESSAGE);
					if(sflt.contains("unreachable")||sflt.contains("无法访问")||sflt.contains("失败")||"".equals(sflt)){
						bjzk=false;//不通
//						Command.executeCommand("service network restart");
//						sflt=Command.executeCommand("ping "+bjip+" -c1").trim().toLowerCase();
//						if(sflt.contains("unreachable")||sflt.contains("无法访问")||sflt.contains("失败")||"".equals(sflt)){
//							bjzk=false;//不通
//						}else
//							bjzk=true;
						//JOptionPane.showMessageDialog(null, bjzk+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
					}
					 String  flagzbj=flagzbjtemp;
					String command=Command.executeCommand("cat /proc/drbd");
					if(command.contains("Primary/Secondary")){
						flagzbj="主机";
						FileOperate.wirtefile("/etc/temp/2.txt","主机",null);
						String gzflag=Command.executeCommand("df");
						if(!gzflag.contains("/dev/drbd1")){
							 Client client=new Client();
						     client.sendMessage(bjip, "drbdadm -- --discard-my-data connect r1", 10800);
						     Command.executeCommand("mount /dev/drbd1 /var/www/html");
						}
					}else if(command.contains("Secondary/Primary")){
						flagzbj="备机";
						FileOperate.wirtefile("/etc/temp/2.txt","备机",null);
					}else{
						//处理闹裂
						flagzbj=FileOperate.readfile("/etc/temp/2.txt");
						jrightModel.addElement("主备机状态异常");
						nl=false;
						if(flagzbj.equals("主机")){
							try {
								Thread.sleep(20000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
							}
							command=Command.executeCommand("cat /proc/drbd");
							if(bjzk){
							     if(command.contains("cs:StandAlone ro:Primary/Unknown ds:UpToDate/DUnknown")){
									  Client client=new Client();
									  String result=client.sendMessage(bjip, "cat /proc/drbd", 10800);
//									  if(result.contains("cs:StandAlone ro:Secondary/Unknown ds:UpToDate/DUnknown")){
									  if(result.contains("ro:Secondary/Unknown ds:UpToDate/DUnknown")){
										  client=new Client();
										  client.sendMessage(bjip, "drbdadm -- --discard-my-data connect r1", 10800);
										  Command.executeCommand("drbdadm connect r1");
									  }
//									  else if(result.contains("cs:StandAlone ro:Primary/Unknown ds:UpToDate/DUnknown")){
									  else if(result.contains("ro:Primary/Unknown ds:UpToDate/DUnknown")){
										  client=new Client();
										  client.sendMessage(bjip, "umount -l /var/www/html", 10800);
										  client=new Client();
										  client.sendMessage(bjip, "drbdadm secondary r1", 10800);
										  client=new Client();
										  client.sendMessage(bjip, "drbdadm -- --discard-my-data connect r1", 10800);
										  Command.executeCommand("drbdadm connect r1");
									  }
								}
							     else if(command.contains("cs:StandAlone ro:Secondary/Unknown ds:UpToDate/DUnknown")){
							    	 Client client=new Client();
									  String result=client.sendMessage(bjip, "cat /proc/drbd", 10800);
									  if(result.contains("cs:StandAlone ro:Secondary/Unknown ds:UpToDate/DUnknown")){
										  Command.executeCommand("drbdsetup /dev/drbd1 primary -o");
										  Command.executeCommand("mount /dev/drbd1 /var/www/html");
										  client=new Client();
										  client.sendMessage(bjip, "drbdadm -- --discard-my-data connect r1", 10800);
										  Command.executeCommand("drbdadm connect r1");
									  }
								}
							     else if(command.contains("cs:WFConnection ro:Primary/Unknown ds:UpToDate/DUnknown")){
							    	  Client client=new Client();
									  String result=client.sendMessage(bjip, "cat /proc/drbd", 10800);
									  if(result.contains("cs:StandAlone ro:Secondary/Unknown ds:UpToDate/DUnknown")){
										  client=new Client();
										  client.sendMessage(bjip, "drbdadm -- --discard-my-data connect r1", 10800);
										  Command.executeCommand("drbdadm connect r1");
									  }else if(result.contains("cs:StandAlone ro:Primary/Unknown ds:UpToDate/DUnknown")){
										  client=new Client();
										  client.sendMessage(bjip, "umount -l /var/www/html", 10800);
										  client=new Client();
										  client.sendMessage(bjip, "drbdadm secondary r1", 10800);
										  client=new Client();
										  client.sendMessage(bjip, "drbdadm -- --discard-my-data connect r1", 10800);
										  Command.executeCommand("drbdadm connect r1");
									  }
									}
							     else if(command.contains("cs:Connected ro:Secondary/Secondary ds:UpToDate/UpToDate")){
									Client client=new Client();
									  String result=client.sendMessage(bjip, "cat /proc/drbd", 10800);
									  if(result.contains("cs:Connected ro:Secondary/Secondary ds:UpToDate/UpToDate")){
										  Command.executeCommand("drbdsetup /dev/drbd1 primary -o");
										  Command.executeCommand("mount /dev/drbd1 /var/www/html");
									  }
									
								}
							}
					  }else{
						  if(!bjzk){
							  try {
								Thread.sleep(20000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
							}
							 command=Command.executeCommand("cat /proc/drbd");
							 if(command.indexOf("Primary")<0){
								  Command.executeCommand("drbdadm primary r1");
								  Command.executeCommand("mount /dev/drbd1 /var/www/html");
							 }
						  }
					  }
					}
					try {
						
						Thread.sleep(2000);
						String languag=Command.executeCommand("locale");
						boolean heartbeat=jcheartbeat(languag);
						//JOptionPane.showMessageDialog(null, mysql+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
						int i=0;
						while(!heartbeat&&i<6){
							Command.executeCommand("service heartbeat start");
							heartbeat=jcheartbeat(languag);
							i++;
						}
						//String heartbeat=Command.executeCommand("service heartbeat status");
						if(heartbeat){
							 jButton3.doClick();
							jleftModel.addElement("正在检测切换服务:正常");
							String zjbs="";
							String bj="";
							if(flagzbj.equals("主机")){
								zjbs="主机";
								bj="备机";
							}else{
								zjbs="备机";
								bj="主机";
								jresultbj.setText(zjbs+"："+zjipzd+" 正常");
							}
							
							Thread.sleep(2000);
							//JOptionPane.showMessageDialog(null, bjzk+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
							if(!bjzk){
								 //jButton3.doClick();
								 jButton2.doClick();
								 if(bj.equals("主机")){
									 jresult.setText(bj+"："+bjip+" 网络连接异常");
								 }else{
								    jresultbj.setText(bj+"："+bjip+" 网络连接异常");
								 }
								 jrightModel.addElement("正在检测"+bj+":"+bjip+":异常");
							 }else{
								 Client client=new Client();
								 String result=client.sendMessage(bjip, "ipconfig", 10800);
									if(result.equals("连接超时")){
										 jButton2.doClick();
										 if(bj.equals("主机")){
											 jresult.setText(bj+"："+bjip+" 异常");
										 }else{
										    jresultbj.setText(bj+"："+bjip+" 异常");
										 }
										 jrightModel.addElement("正在检测"+bj+":"+bjip+":检测程序没有打开");
									}else{
										 if(bj.equals("主机")){
										   jresult.setText(bj+"："+bjip+" 正常");
											   jButton3.doClick();
										      jrightModel.clear();
										 }
										 else{
											 jresultbj.setText(bj+"："+bjip+" 正常"); 
										 }
										 jleftModel.addElement("正在检测"+bj+":"+bjip+":正常");
									}
								 //jrightModel.clear();
							 }
							//JOptionPane.showMessageDialog(null, zjbs+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
							if(zjbs.equals("主机")){
								Thread.sleep(2000);
								//检测mysql
								boolean mysql=jcmysq(languag);
								//JOptionPane.showMessageDialog(null, mysql+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
								 i=0;
								while(!mysql&&i<6){
									Command.executeCommand("service mysqld start");
									mysql=jcmysq(languag);
									i++;
								}
								if(!mysql){
									//JOptionPane.showMessageDialog(null, "正在检测mysql服务=====", "标题",  JOptionPane.ERROR_MESSAGE);
									jrightModel.addElement("正在检测mysql服务:异常");
									jresult.setText("主机："+zjipzd+" 异常");
									 jButton2.doClick();
									 Command.executeCommand("service heartbeat stop");
									 Client client=new Client();
									 qhzt(client.sendMessage(bjip, "qhzbj", 10800));
								}else{
									 //jButton3.doClick();
									//jrightModel.clear();
									jleftModel.addElement("正在检测mysql服务:正常");
									Thread.sleep(2000);
									//检测drbd
									 i=0;
									 boolean drbd=jcdrbd();
									while(!drbd&&i<6){
										Command.executeCommand("service drbd start");
										drbd=jcdrbd();
										i++;
									}
									if(!drbd){
										jrightModel.addElement("正在检测同步服务:异常");
										jresult.setText("主机："+zjipzd+" 异常");
										 jButton2.doClick();
										 Command.executeCommand("service heartbeat stop");
										 Client client=new Client();
										 qhzt(client.sendMessage(bjip, "qhzbj", 10800));
									}else{
										jleftModel.addElement("正在检测同步服务:正常");
										 
										Thread.sleep(2000);
										//检测mysql
										boolean httpd=jchttpd(languag);
										//JOptionPane.showMessageDialog(null, mysql+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
										 i=0;
										while(!httpd&&i<6){
											Command.executeCommand("service httpd start");
											httpd=jchttpd(languag);
											i++;
										}
										if(!httpd){
											jrightModel.addElement("正在检测httpd服务:异常");
											jresult.setText("主机："+zjipzd+" 异常");
											 jButton2.doClick();
											 Command.executeCommand("service heartbeat stop");
											 Client client=new Client();
											 qhzt(client.sendMessage(bjip, "qhzbj", 10800));
										}else{
											jleftModel.addElement("正在检测httpd服务:正常");
											if(nl){
												jresult.setText("主机："+zjipzd+" 正常");
											    jButton3.doClick();
											    jrightModel.clear();
											}
										}
										
										
									}
								}
								
							}
							
						}else{
							//JOptionPane.showMessageDialog(null, heartbeat+" ====》"+flagzbj, "提示",  JOptionPane.ERROR_MESSAGE);
							jrightModel.addElement("正在检测切换服务:异常");
							if(flagzbj.equals("主机")){
							   jresult.setText("主机："+zjipzd+" 异常");
							   Client client=new Client();
							   qhzt(client.sendMessage(bjip, "qhzbj", 10800));
							}
							else
								jresultbj.setText("备机："+zjipzd+" 异常");
							
							 jButton2.doClick();
							
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
					jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getValue()+jScrollPane1.getHeight());
					jScrollPane2.getVerticalScrollBar().setValue(jScrollPane2.getVerticalScrollBar().getValue()+jScrollPane2.getHeight());
				}
			   }, 100, 3000);
		     }
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//检测heartbeat服务
	private boolean jcheartbeat(String languag){
		String heartbeat=Command.executeCommand("service heartbeat status",languag);
		//String defaultCharsetName=System.getProperty("file.encoding");  
		//JOptionPane.showMessageDialog(null, mysql+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
		if(heartbeat.contains("is running")||heartbeat.contains("正在运行")||heartbeat.contains("pid")){
			return true;
		}
		return false;
	}
	
	//检测mysql服务
	private boolean jcmysq(String languag){
		String mysql=Command.executeCommand("service mysqld status",languag);
		//String mysqllock=Command.executeCommand("find / -name mysql.sock",languag);
		//String defaultCharsetName=System.getProperty("file.encoding");  
		//JOptionPane.showMessageDialog(null, mysql+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
//		if((mysql.contains("is running")||mysql.contains("正在运行")||mysql.contains("pid"))&&mysqllock.contains("var/www/html/mysql/mysql.sock")){
		if(mysql.contains("is running")||mysql.contains("正在运行")||mysql.contains("pid")){
			return true;
		}
		return false;
	}
	
	//检测mysql服务
	private boolean jchttpd(String languag){
		String mysql=Command.executeCommand("service httpd status",languag);
		//String defaultCharsetName=System.getProperty("file.encoding");  
		//JOptionPane.showMessageDialog(null, mysql+"=====", "标题",  JOptionPane.ERROR_MESSAGE);
		if(mysql.contains("is running")||mysql.contains("正在运行")||mysql.contains("pid")){
			return true;
		}
		return false;
	}
	//检测drbd服务
	private boolean jcdrbd(){
		String drbd=Command.executeCommand("service drbd status");
		if(drbd.contains("loaded OK")||drbd.contains("Primary/Secondary")||drbd.contains("Primary/Secondary")){
			return true;
		}
		return false;
	}
	//将切换是否成功的消息输出到界面
	private void qhzt(String result){
		if(result.contains("wc")){
          this.jleftModel.addElement("切换成功");
		}else
			 this.jrightModel.addElement("切换失败");
	}
	
	public static void main(String[] args) {
		WaringMain m=new WaringMain();
		m.setVisible(true);
		InitDialog d=new InitDialog(m, "提示", true);
//		 Thread t=new Thread(d);
//		 t.start();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	   d.setI(3);
	}
	
}

