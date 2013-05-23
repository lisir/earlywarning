package com.warn.dialog;

import java.io.InputStream;

import javax.swing.JOptionPane;

import com.warn.Command;
import com.warn.utils.FileEncryptAndDecrypt;
import com.warn.utils.FileOperate;
import com.warn.utils.Md5;
import com.warn.utils.ZIPUtil;

public class Initdeploy implements Runnable {
	private final static  String network="/etc/temp/HOST1-MASTER/HOST1-network.sh";
	private final static  String install="/etc/temp/HOST1-MASTER/INSTALL.sh";
	private final static  String conf="/etc/temp/HOST1-MASTER/HOST1-DRBD-CONF.SH";
	private final static  String mkfs="/etc/temp/HOST1-MASTER/HOST1-DRBD-MKFS.sh";
	private final static  String haconf="/etc/temp/HOST1-MASTER/HOST1-HA-CONF.SH";
	private String ip1;//ip地址1
	private String ip2;//ip地址1
	private String host1;//host地址1
	private String host2;//host地址1
	private String invented;//虚拟地址地址1
	private String dns;//dns地址
	private String gateway;//网关
	private String diskadr;//地址
	private InitDialog init;
	
	public Initdeploy(){
		//InputStream is=this.getClass().getResourceAsStream("/host/HOST1-MASTER.zip");  
		try {
//		  FileOperate.copyfile(is, "d:/fd/ha.tar.gz");
//		  FileEncryptAndDecrypt.encrypt("D:/a/HOST1-MASTER/HOST1-DRBD-CONF.SH","#$#$");
//		  FileEncryptAndDecrypt.encrypt("D:/a/HOST2-SLAVE/HOST1-DRBD-CONF.SH","#$#$");
//		  FileEncryptAndDecrypt.encrypt("D:/a/HOST1-MASTER/HOST1-DRBD-MKFS.sh","#$#$");
//	      FileEncryptAndDecrypt.encrypt("D:/a/HOST2-SLAVE/HOST1-DRBD-MKFS.sh","#$#$");
//	      FileEncryptAndDecrypt.encrypt("D:/a/HOST1-MASTER/HOST1-HA-CONF.SH","#$#$");
//	      FileEncryptAndDecrypt.encrypt("D:/a/HOST2-SLAVE/HOST1-HA-CONF.SH","#$#$");
//	      FileEncryptAndDecrypt.encrypt("D:/a/HOST1-MASTER/HOST1-network.sh","#$#$");
//	      FileEncryptAndDecrypt.encrypt("D:/a/HOST2-SLAVE/HOST1-network.sh","#$#$");
//	      FileEncryptAndDecrypt.encrypt("D:/a/HOST1-MASTER/INSTALL.sh","#$#$");
//	      FileEncryptAndDecrypt.encrypt("D:/a/HOST2-SLAVE/INSTALL.sh","#$#$");
//		  FileEncryptAndDecrypt.decrypt("D:/a/HOST2-SLAVE/HOST1-DRBD-CONF.SH","D:/a/HOST2-SLAVE/HOST1-DRBD-CONF1.SH",4);
//			FileEncryptAndDecrypt.encrypt(conf,"#$#$");
//			FileEncryptAndDecrypt.encrypt(mkfs,"#$#$");
//			FileEncryptAndDecrypt.encrypt(install,"#$#$");
//			FileEncryptAndDecrypt.encrypt(haconf,"#$#$");
			//System.out.println(this.getClass().getResource("/"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
		   //e.printStackTrace();
		}
	}
	public Initdeploy(String ip1,String ip2,String host1,String host2,String invented,String dns,String gateway,String diskadr,InitDialog d){
		
		this.ip1=ip1;
		this.ip2=ip2;
		this.host1=host1;
		this.host2=host2;
		this.invented=invented;
		this.dns=dns;
		this.gateway=gateway;
		this.diskadr=diskadr;
		this.init=d;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		Command.executeCommand("rm -rf /etc/temp/HOST1-MASTER");
		Command.executeCommand("rm -rf /etc/temp/HOST1-MASTER.zip");
		String restart=FileOperate.readfile("/etc/temp/iprestart.txt");
		//配置主机名，IP，网络等
		String ip=Command.executeCommand("ifconfig");
		String zbjbs="备机";
		
		 try {
			 if(ip.contains(ip1)){
					InputStream is=this.getClass().getResourceAsStream("/host/HOST1-MASTER.zip"); 
					FileOperate.copyfile(is, "/etc/temp/HOST1-MASTER.zip");
					zbjbs="主机";
				}else{
					InputStream is=this.getClass().getResourceAsStream("/host/host2/HOST1-MASTER.zip"); 
					FileOperate.copyfile(is, "/etc/temp/HOST1-MASTER.zip");
				}
			 ZIPUtil.unzip("/etc/temp/HOST1-MASTER.zip", "/etc/temp");
			if(FileEncryptAndDecrypt.readFileLastByte(network,4).equals("#$#$")){
				FileEncryptAndDecrypt.decrypt(network, "/etc/temp/HOST1-MASTER/HOST1-network1.sh", 4);
			 }
			if(FileEncryptAndDecrypt.readFileLastByte(install,4).equals("#$#$")){
				FileEncryptAndDecrypt.decrypt(install, "/etc/temp/HOST1-MASTER/INSTALL1.sh", 4);
			 }
			if(FileEncryptAndDecrypt.readFileLastByte(conf,4).equals("#$#$")){
				FileEncryptAndDecrypt.decrypt(conf, "/etc/temp/HOST1-MASTER/HOST1-DRBD-CONF1.SH", 4);
			 }
			if(FileEncryptAndDecrypt.readFileLastByte(mkfs,4).equals("#$#$")){
				FileEncryptAndDecrypt.decrypt(mkfs, "/etc/temp/HOST1-MASTER/HOST1-DRBD-MKFS1.sh", 4);
			 }
			if(FileEncryptAndDecrypt.readFileLastByte(haconf,4).equals("#$#$")){
				FileEncryptAndDecrypt.decrypt(haconf, "/etc/temp/HOST1-MASTER/HOST1-HA-CONF1.SH", 4);
			 }	
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StringBuilder str=new StringBuilder();
		str.append("ip1=");
		str.append(ip1);
		str.append("\r\n");
		str.append("ip2=");
		str.append(ip2);
		str.append("\r\n");
		str.append("host1=");
		str.append(host1);
		str.append("\r\n");
		str.append("host2=");
		str.append(host2);
		str.append("\r\n");
		str.append("invented=");
		str.append(invented);
		str.append("\r\n");
		str.append("dns=");
		str.append(dns);
		str.append("\r\n");
		str.append("gateway=");
		str.append(gateway);
		str.append("\r\n");
		str.append("diskadr=");
		str.append(diskadr);
		FileOperate.wirtefile("/etc/temp/1.properties",str.toString(),"");
		FileOperate.wirtefile("/etc/temp/1.txt",ip1,ip2);
		FileOperate.wirtefile("/etc/temp/2.txt",zbjbs,null);
		Command.executeCommand("chmod a+x "+network);
		StringBuilder commands=new StringBuilder();
	    if(null==restart||!restart.equals("0")){
	    	commands.append(network);
			commands.append(" ");
			commands.append(ip1);
			commands.append(" ");
			commands.append(ip2);
			commands.append(" ");
			commands.append(host1);
			commands.append(" ");
			commands.append(host2);
			commands.append(" ");
			commands.append(gateway);
			commands.append(" ");
			commands.append(dns);
	    	init.getjLabel1().setText("正在修改ip....");
	    	String s1 =Command.executeCommand(commands.toString());
	    	FileOperate.wirtefile("/etc/temp/iprestart.txt", "0", "");
	    	Command.executeCommand("reboot");
	    	try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
			}
	    	//return;
		}
		
//		commands.append(" ");
//		String path=this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
//		commands.append(path);
		//JOptionPane.showConfirmDialog(null,commands.toString() , "友情提示",  JOptionPane.INFORMATION_MESSAGE);
		init.getjLabel1().setText("正在安装软件....");
		//JOptionPane.showMessageDialog(null, s1, "标题",  JOptionPane.ERROR_MESSAGE);
		//安装软件
		Command.executeCommand("chmod a+x "+install);
		String s =Command.executeCommand(install);
		//JOptionPane.showMessageDialog(null, s, "标题",  JOptionPane.ERROR_MESSAGE);
		
		//配置DRBD
		init.getjLabel1().setText("正在配置DRBD....");
		commands=new StringBuilder();
		commands.append(conf);
		commands.append(" ");
		commands.append(ip1);
		commands.append(" ");
		commands.append(ip2);
		commands.append(" ");
		commands.append(host1);
		commands.append(" ");
		commands.append(host2);
		commands.append(" ");
		commands.append(diskadr);
		Command.executeCommand("chmod a+x "+conf);
		String s2 =Command.executeCommand(commands.toString());
		//JOptionPane.showMessageDialog(null, s2, "标题",  JOptionPane.ERROR_MESSAGE);
		//执行同步
		while(true){
			String coms=Command.executeCommand("cat /proc/drbd");
			if(!coms.contains("Secondary/Unknown")){
				break;
			}
		}
		//完成后，过大约2分钟再执行脚本
		String path=this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		String sflt=Command.executeCommand("ping "+ip2+" -c1").trim().toLowerCase();
		sflt+=Command.executeCommand("ping "+ip1+" -c1").trim().toLowerCase();
		if(sflt.contains("unreachable")||sflt.contains("无法访问")||sflt.contains("失败")||"".equals(sflt)){
			Command.executeCommand("service network restart");
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
		}
		init.getjLabel1().setText("正在设置主机....");
		Command.executeCommand("chmod a+x "+mkfs);
		path=path.contains(".jar")&&path.lastIndexOf("/")>-1?path.substring(0,path.lastIndexOf("/")):path;
		path=path.endsWith("/")?path.substring(0,path.length()-1):path;
		String s5 =Command.executeCommand(mkfs+" "+path);
		
		//JOptionPane.showMessageDialog(null, path, "标题",  JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(null, s5+"第五步", "标题",  JOptionPane.ERROR_MESSAGE);
		while(true){
			String coms=Command.executeCommand("cat /proc/drbd");
			if(coms.contains("Primary")){
				break;
			}
			if(zbjbs.equals("主机")){
			//	JOptionPane.showMessageDialog(null, path, "标题",  JOptionPane.ERROR_MESSAGE);
			    Command.executeCommand(mkfs+" "+path);
			}
		}
		init.getjLabel1().setText("正在配置HA....");
		//配置HA
		commands=new StringBuilder();
		commands.append(haconf);
		commands.append(" ");
		commands.append(ip1);
		commands.append(" ");
		commands.append(invented);
		commands.append(" ");
		commands.append(host1);
		commands.append(" ");
		commands.append(host2);
		commands.append(" ");
		commands.append(ip2);
		Command.executeCommand("chmod a+x "+haconf);
		String s3 =Command.executeCommand(commands.toString());
		
		//执行同步
		while(true){
			String coms=Command.executeCommand("cat /proc/drbd");
			if(coms.contains("UpToDate/UpToDate")){
				break;
			}
//			else{
////				JOptionPane.showMessageDialog(null, coms+"====="+192, "标题",  JOptionPane.ERROR_MESSAGE);
////				JOptionPane.showMessageDialog(null, coms.substring(coms.indexOf("sync'ed:")+9,coms.indexOf("finish:"))+"====="+193, "标题",  JOptionPane.ERROR_MESSAGE);
//				int index=-10;
//				int end=-10;
//				if(coms.indexOf("sync'ed:")!=-1){
//					index=coms.indexOf("sync'ed:")+9;
//				}else if(coms.indexOf("WFBitMapT:")!=-1){
//					index=coms.indexOf("WFBitMapT:")+11;
//				}
//				if(coms.indexOf("finish:")!=-1){
//					end=coms.indexOf("finish:");
//				}
//				if(index!=-10&&end!=-10){
//					String str=coms.substring(index,end);
//					init.getjLabel1().setText("正在同步数据.."+str);
//				}
//			}
		}
		init.setI(3);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
		//加密文件
//		try {
//			FileEncryptAndDecrypt.encrypt(network,"#$#$");
//			FileEncryptAndDecrypt.encrypt(conf,"#$#$");
//			FileEncryptAndDecrypt.encrypt(mkfs,"#$#$");
//			FileEncryptAndDecrypt.encrypt(install,"#$#$");
//			FileEncryptAndDecrypt.encrypt(haconf,"#$#$");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Command.executeCommand("service mysqld restart");
		Command.executeCommand("rm -rf /etc/temp/HOST1-MASTER");
		Command.executeCommand("rm -rf /etc/temp/HOST1-MASTER.zip");
		Command.executeCommand("rm -rf /etc/temp/iprestart.txt");
		JOptionPane.showMessageDialog(null, "设置完成！", "友情提示",  JOptionPane.INFORMATION_MESSAGE);
		Command.executeCommand("reboot");
	}
	
	public String getIp1() {
		return ip1;
	}
	public void setIp1(String ip1) {
		this.ip1 = ip1;
	}
	public String getIp2() {
		return ip2;
	}
	public void setIp2(String ip2) {
		this.ip2 = ip2;
	}
	public String getHost1() {
		return host1;
	}
	public void setHost1(String host1) {
		this.host1 = host1;
	}
	public String getHost2() {
		return host2;
	}
	public void setHost2(String host2) {
		this.host2 = host2;
	}
	public String getInvented() {
		return invented;
	}
	public void setInvented(String invented) {
		this.invented = invented;
	}
	public String getDns() {
		return dns;
	}
	public void setDns(String dns) {
		this.dns = dns;
	}
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	public String getDiskadr() {
		return diskadr;
	}
	public void setDiskadr(String diskadr) {
		this.diskadr = diskadr;
	}

	public InitDialog getInit() {
		return init;
	}

	public void setInit(InitDialog init) {
		this.init = init;
	}
	
	

}
