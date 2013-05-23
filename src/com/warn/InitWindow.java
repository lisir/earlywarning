package com.warn;

import java.io.File;

import javax.swing.JOptionPane;

import com.warn.utils.EncryptionDecryption;
import com.warn.utils.FileOperate;
import com.warn.utils.Md5;
import com.warn.utils.PropertiesUtil;

public class InitWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
						WaringMain main=new WaringMain();
						main.setVisible(true);
					
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
}
