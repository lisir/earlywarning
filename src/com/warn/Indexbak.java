package com.warn;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.warn.dialog.InitDialog;



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
public class Indexbak extends JFrame {
	
			public Indexbak(){
				super();
				initGUI();
			}
	/**
	 * 
	 */
	private static final long serialVersionUID = -6860557936104901611L;
	private JButton jButton1;
	private JPanel jPanelbj;
	private JLabel jLabel2;
	private JScrollPane jScrollPane1;
	private JButton jButton3;
	private JButton jButton2;
	private JPanel jPanelopertion;
	private JPanel jPanelbeij;
	private JList jList1;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField8;
	private JLabel jLabel9;
	private JTextField jTextField7;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JPanel jPanel1;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JButton jButton4;
	private JLabel jLabel1;
	private InitDialog d=null;
	public InitDialog getD() {
		d=new InitDialog(this, "提示", true);
		return d;
	}
	private DefaultListModel  jList1Model ;
	private DefaultComboBoxModel servicecombo;
	private void initGUI() {
		try {
			{
				 int w = 745;
				 int h = 429;
				this.setSize(w,h);
				getContentPane().setLayout(null);
				getContentPane().setBackground(new java.awt.Color(238,238,238));
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
//				this.setResizable(false);
//				this.setLocation(new java.awt.Point(200, 100));
//				{
//					jScrollPane1 = new JScrollPane();
//					getContentPane().add(jScrollPane1);
//					jScrollPane1.setBounds(523, 55, 187, 143);
//					{
//						jList1Model = 
//							new DefaultListModel ();
//						//					jList1Model.addElement("item 1");
//						//					jList1Model.addElement("item 2");
//						//					jList1Model.addElement("item 3");
//						jList1 = new JList();
//						jScrollPane1.setViewportView(jList1);
//						jList1.setModel(jList1Model);
//						jList1.setBounds(50, 177, 78, 168);
//						jList1.setAutoscrolls(false);
//						jList1.getModel();
//						//jList1.setCaretPosition(jList1.length());
//					}
					
					
//				}
				{
					jPanelbj = new JPanel();
					getContentPane().add(jPanelbj);
					jPanelbj.setBounds(59, 21, 337, 91);
					jPanelbj.setBorder(BorderFactory.createTitledBorder(" \u672c\u673a\u914d\u7f6e"));
					jPanelbj.setLayout(null);
					{
						jLabel1 = new JLabel();
						jPanelbj.add(jLabel1);
						jLabel1.setText("\u4e3b\u673aip\u5730\u5740\uff1a");
						jLabel1.setBounds(5, 22, 105, 17);
					}
					{
						jLabel4 = new JLabel();
						jPanelbj.add(jLabel4);
						jLabel4.setText("\u4e3b\u673a\u540d\u79f0\uff1a");
						jLabel4.setBounds(5, 58, 73, 17);
					}
					{
						jTextField1 = new JTextField();
						jPanelbj.add(jTextField1);
						jTextField1.setBounds(88, 19, 120, 24);
						jTextField1.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					}
					{
						jTextField2 = new JTextField();
						jPanelbj.add(jTextField2);
						jTextField2.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
						jTextField2.setBounds(90, 55, 118, 24);
					}
					{
						jLabel6 = new JLabel();
						jPanelbj.add(jLabel6);
						jLabel6.setText("\u865a\u62dfip\u5730\u5740:");
						jLabel6.setBounds(220, 22, 95, 17);
					}
					{
						jTextField5 = new JTextField();
						jPanelbj.add(jTextField5);
						jTextField5.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
						jTextField5.setBounds(214, 55, 118, 24);
					}
				}
				{
					jPanelbeij = new JPanel();
					getContentPane().add(jPanelbeij);
					jPanelbeij.setBounds(428, 21, 227, 91);
					jPanelbeij.setLayout(null);
					jPanelbeij.setBorder(BorderFactory.createTitledBorder("\u5907\u673a\u914d\u7f6e"));
					{
						jLabel2 = new JLabel();
						jPanelbeij.add(jLabel2);
						jLabel2.setText("\u5907\u673aip\u5730\u5740\uff1a");
						jLabel2.setBounds(9, 22, 105, 17);
					}
					{
						jLabel5 = new JLabel();
						jPanelbeij.add(jLabel5);
						jLabel5.setText("\u5907\u673a\u540d\u79f0\uff1a");
						jLabel5.setBounds(11, 58, 66, 17);
					}
					{
						jTextField3 = new JTextField();
						jPanelbeij.add(jTextField3);
						jTextField3.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
						jTextField3.setBounds(89, 55, 118, 24);
					}
					{
						jTextField4 = new JTextField();
						jPanelbeij.add(jTextField4);
						jTextField4.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
						jTextField4.setBounds(88, 19, 118, 24);
					}
				}
				{
					jPanelopertion = new JPanel();
					getContentPane().add(jPanelopertion);
					jPanelopertion.setLayout(null);
					jPanelopertion.setBounds(59, 248, 596, 86);
					jPanelopertion.setBorder(BorderFactory.createTitledBorder(null, "\u64cd\u4f5c", TitledBorder.LEADING, TitledBorder.TOP));
					{
						jButton1 = new JButton();
						jPanelopertion.add(jButton1);
						jButton1.setText("\u786e\u5b9a");
						jButton1.setBounds(375, 40, 93, 24);
						int i=10;
						jButton1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								String[] command={"cd","/etc","dir"};
								String result=Command.executeCommand("cat /proc/drbd");
								if(result.contains("Secondary/Unknown")){
									JOptionPane.showMessageDialog(null, "没有备机", "标题",  JOptionPane.ERROR_MESSAGE);
								}
								//jList1Model.addElement("房价肯定是空房"+new Date().getSeconds());
								//设置滚动条在最下端
								//jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getValue()+jScrollPane1.getHeight());
								JOptionPane.showMessageDialog(null, result, "标题",  JOptionPane.ERROR_MESSAGE);
								try {
									//							RandomAccessFile randomFile = new RandomAccessFile("E:/1.txt", "rw");
									//							 // 文件长度，字节数
									//							    long fileLength = randomFile.length();
									//							    //将写文件指针移到文件尾。
									//							    randomFile.seek(fileLength);
									//							    randomFile.writeChars("ffffffffff");
									//							    randomFile.close();
									//							 File file=new File("/etc/hosts");
									//							 if(file.exists()){
										//							 FileWriter writer = new FileWriter(file, true);
										//							  writer.write("\r\n");
										//							  writer.write(jEditorPane1.getText()+" "+jEditorPane3.getText());
										//							    writer.write("\r\n");
										//							   writer.write(jEditorPane2.getText()+" "+jEditorPane4.getText());
										//							    writer.close();
										//							 }else{
											//								 JOptionPane.showMessageDialog(null, "/etc/hosts文件不存在", "提示",  JOptionPane.ERROR_MESSAGE);
											//							 }
									//执行命令
									//							 Process process = Runtime.getRuntime().exec("ifconfig");          
									//							 InputStreamReader ir = new InputStreamReader(process.getInputStream());  
									//							 LineNumberReader input = new LineNumberReader(ir);           
									//							 String line;           
									//							 while ((line = input.readLine()) != null) {        
										//								 JOptionPane.showMessageDialog(null, line, "提示",  JOptionPane.ERROR_MESSAGE);   
										//								 }
									
									//添加文件
//									File file=new File("/etc/drbd.conf");
//									if(file.exists()){
//										file.delete();
//										file.createNewFile();
//									}
//									OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(file),"GB2312");
//									InputStream is=this.getClass().getResourceAsStream("/brdb.txt");   
//									BufferedReader br=new BufferedReader(new InputStreamReader(is,"GBK"));
//									String s;
//									while((s=br.readLine())!=null)
//									{ 
//										JOptionPane.showMessageDialog(null, s, "标题",  JOptionPane.ERROR_MESSAGE);
//										osw.write("\r\n");
//										osw.write(s.replace("192.168.1.10:7898", "192.168.170.128").replace("192.168.1.20:7898", "ip22222"));
//									}
//									br.close();
//									osw.close();
									// OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(""),"UTF-8");
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									JOptionPane.showMessageDialog(null, "不正常", "提示",  JOptionPane.ERROR_MESSAGE);
								} 
								
								//TODO add your code for jButton1.actionPerformed
														/* Connection conn = new Connection("192.168.170.132");
															try {																	conn.connect();
									
																 //Authenticate 
																	boolean isAuthenticated = conn.authenticateWithPassword(
																					"root", "lsmwmcom");
																			throw new IOException("连接服务器失败");
																	
																	Session sess = conn.openSession();
																	sess.requestDumbPTY();
																	System.out.println(sess);
																	// ----------------------------------------执行命令-------------------------
																	String[] cmd = new String[]{"fdisk /dev/sda", "n", "e"};
																	//sess.execCommand("fdisk /dev/sda ");		
																	sess.execCommand("fdisk /dev/sda && n ");
																	//sess.execCommand("n");
																    System.out.println("Here is some information about the remote host:");
//																    OutputStreamWriter out = new OutputStreamWriter (sess.getStdin());
//																    out.write("lo");
//																    InputStream stdout = new StreamGobbler(sess.getStdout());
																    showresult(sess);
																    System.out.print("=================290");
																     //Show exit status, if available (otherwise "null") 									
																    System.out.println("ExitCode: " + sess.getExitStatus());
									
																    //Thread.currentThread().sleep(5000);
															  System.out.print("=================");
																	//sess.execCommand("n");
																     //Close this session 
																	 showresult(sess);
																    sess.close();
									
																    // Close the connection 
									
																    conn.close();
									
									
																	
																} catch (Exception e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}*/
							}
						});
					}
					{
						jButton2 = new JButton();
						jPanelopertion.add(jButton2);
						jButton2.setText("\u6d4b\u8bd5\u8fde\u63a5");
						jButton2.setBounds(111, 40, 86, 24);
					}
					{
						jButton3 = new JButton();
						jPanelopertion.add(jButton3);
						jButton3.setText("\u8bbe\u7f6e");
						jButton3.setBounds(242, 40, 98, 24);
						jButton3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
//								 Thread t=new Thread(getD());
//								 t.start();
								//配置主机名，IP，网络等
								Command.executeCommand("chmod a+x /etc/aaa/HOST1-MASTER/HOST1-network.sh");
								StringBuilder commands=new StringBuilder();
								commands.append("/etc/aaa/HOST1-MASTER/HOST1-network.sh ");
								commands.append(jTextField1.getText());
								commands.append(" ");
								commands.append(jTextField4.getText());
								commands.append(" ");
								commands.append(jTextField2.getText());
								commands.append(" ");
								commands.append(jTextField3.getText());
								commands.append(" ");
								commands.append(jTextField7.getText());
								commands.append(" ");
								commands.append(jTextField6.getText());
								String s1 =Command.executeCommand(commands.toString());
								JOptionPane.showMessageDialog(null, s1, "标题",  JOptionPane.ERROR_MESSAGE);
								//安装软件
								Command.executeCommand("chmod a+x /etc/aaa/HOST1-MASTER/INSTALL.sh");
								String s =Command.executeCommand("/etc/aaa/HOST1-MASTER/INSTALL.sh");
								JOptionPane.showMessageDialog(null, s, "标题",  JOptionPane.ERROR_MESSAGE);
								
								//配置DRBD
								commands=new StringBuilder();
								commands.append("/etc/aaa/HOST1-MASTER/HOST1-DRBD-CONF.SH ");
								commands.append(jTextField1.getText());
								commands.append(" ");
								commands.append(jTextField4.getText());
								commands.append(" ");
								commands.append(jTextField2.getText());
								commands.append(" ");
								commands.append(jTextField3.getText());
								commands.append(" ");
								commands.append(jTextField8.getText());
								Command.executeCommand("chmod a+x /etc/aaa/HOST1-MASTER/HOST1-DRBD-CONF.SH");
								String s2 =Command.executeCommand(commands.toString());
								JOptionPane.showMessageDialog(null, s2, "标题",  JOptionPane.ERROR_MESSAGE);
								//执行同步
								while(true){
									String coms=Command.executeCommand("cat /proc/drbd");
									if(!coms.contains("Secondary/Unknown")){
										break;
									}
								}
								//完成后，过大约2分钟再执行脚本
								Command.executeCommand("chmod a+x /etc/aaa/HOST1-MASTER/HOST1-DRBD-MKFS.sh");
								String s5 =Command.executeCommand("/etc/aaa/HOST1-MASTER/HOST1-DRBD-MKFS.sh");
								JOptionPane.showMessageDialog(null, s5+"第五步", "标题",  JOptionPane.ERROR_MESSAGE);
								//配置HA
								commands=new StringBuilder();
								commands.append("/etc/aaa/HOST1-MASTER/HOST1-HA-CONF.SH ");
								commands.append(jTextField1.getText());
								commands.append(" ");
								commands.append(jTextField5.getText());
								commands.append(" ");
								commands.append(jTextField2.getText());
								commands.append(" ");
								commands.append(jTextField3.getText());
								commands.append(" ");
								commands.append(jTextField4.getText());
								Command.executeCommand("chmod a+x /etc/aaa/HOST1-MASTER/HOST1-HA-CONF.SH");
								String s3 =Command.executeCommand(commands.toString());
								//执行同步
								while(true){
									String coms=Command.executeCommand("cat /proc/drbd");
									if(coms.contains("UpToDate/UpToDate")){
										break;
									}
								}
								JOptionPane.showMessageDialog(null, "设置完成", "提示",  JOptionPane.ERROR_MESSAGE);
								wirtefile("/etc.temp/1.txt",jTextField1.getText(),jTextField4.getText());
							}
						});
					}
					{
						jButton4 = new JButton();
						jPanelopertion.add(jButton4);
						jButton4.setText("\u9000\u51fa");
						jButton4.setBounds(497, 40, 90, 24);
						jButton4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.exit(0);
							}
						});
					}
				}
				{
					jPanel1 = new JPanel();
					getContentPane().add(jPanel1);
					jPanel1.setBounds(59, 139, 596, 73);
					jPanel1.setBorder(BorderFactory.createTitledBorder(""));
					jPanel1.setLayout(null);
					{
						jLabel7 = new JLabel();
						jPanel1.add(jLabel7);
						jLabel7.setText("\u5b50\u7f51\u63a9\u7801\uff1a");
						jLabel7.setBounds(5, 10, 74, 17);
					}
					{
						jTextField6 = new JTextField();
						jPanel1.add(jTextField6);
						jTextField6.setBounds(73, 7, 139, 24);
						jTextField6.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					}
					{
						jLabel8 = new JLabel();
						jPanel1.add(jLabel8);
						jLabel8.setText("\u9ed8\u8ba4\u7f51\u5173\uff1a");
						jLabel8.setBounds(239, 10, 81, 17);
					}
					{
						jTextField7 = new JTextField();
						jPanel1.add(jTextField7);
						jTextField7.setBounds(320, 7, 135, 24);
						jTextField7.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					}
					{
						jLabel9 = new JLabel();
						jPanel1.add(jLabel9);
						jLabel9.setText("\u5206\u533a\u540d\u79f0\uff1a");
						jLabel9.setBounds(5, 39, 68, 17);
					}
					{
						jTextField8 = new JTextField();
						jPanel1.add(jTextField8);
						jTextField8.setBounds(73, 36, 139, 24);
						jTextField8.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					}
				}

			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*private void showresult(Session stdout) throws IOException{
		  System.out.println("371");
		   BufferedReader br = new BufferedReader(new InputStreamReader(stdout.getStdout()));
		   int i=0;
		   OutputStreamWriter out = new OutputStreamWriter (stdout.getStdin());
		    while (true)

			    {

			    String line = br.readLine();

			    if (line != null){
			    	System.out.print("==============="+i);
			    	if(line.trim().equalsIgnoreCase("(e.g., DOS FDISK, OS/2 FDISK)")){
			    		System.out.println(line+"    383");
						 out.write("n \n");
						 out.flush();
						 i++;
					 }else if(line.trim().equalsIgnoreCase("Command action")){
						 //System.out.println(line+"         387");
						 out.write("e \n");
						 out.flush();
						 i++;
						
					 }else if(line.trim().equals("e")){
						 System.out.println(line+"         395");
						 out.write("1 \n");
						 out.flush();
						 i++;
						 
					 }
			    }else{
			    	break;
			    }
 i++;
			    System.out.println(line+"=f====================="+i);
			   

			    }
		   //System.out.println("401");
	}
	
*/
	private void wirtefile(String path,String ip1,String ip2){
		File file=new File(path);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}else{
			file.delete();
		}
		BufferedWriter write = null;
		try {
			write = new BufferedWriter(new FileWriter(file));
			write.write(ip1);
			write.write("\r\n");
			write.write(ip2);
			write.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				write.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
//		String command=Command.executeCommand("cat /proc/drbd");
//		if(command.contains("Primary/Secondary")||command.contains("Primary/Secondary")){
			WaringMain main=new WaringMain();
			main.setVisible(true);
//		}else{
//			Indexbak index=new Indexbak();
//			index.setVisible(true);
//	   }
	
	
//	try {
//		
//		InputStream in = Index.class.getResourceAsStream("/ALARM1.WAV");
//		AudioStream as = new AudioStream(in);
//		AudioPlayer.player.start(as);
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} 
//	 System.out.print("ff");
//  System.out.print("\n");
//  System.out.print("ff");
}
}
