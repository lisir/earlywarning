package com.warn.socket;

import java.net.*;
import java.util.Date;
import java.io.*;

import javax.swing.JOptionPane;


import com.warn.Command;
import com.warn.utils.FileOperate;

/**
 * socket服务器端
 * @author lism
 *
 */
public class Server extends Thread{
	private ServerSocket ss;
	private Socket socket;
	private BufferedReader in;
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			ss = new ServerSocket(10800);
			while (true) {
				socket = ss.accept();
				in = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);

				String line = in.readLine();
				//out.println("you input is :" + line);
				 FileOperate.appendfile("/etc/temp/222.txt", "\r\n", line+"---------"+new Date());
				if(line.equals("qhzbj")){
					changezbj();
					Thread.sleep(5000);
					String result=Command.executeCommand("cat /proc/drbd");
					if(result.contains("Primary/Secondary")){
						Command.executeCommand("service mysqld restart");
						out.println("qhwc");
						 FileOperate.appendfile("/etc/temp/222.txt", "\r\n", "切换主备机完成---------"+new Date());
						FileOperate.wirtefile("/etc/temp/2.txt", "主机", "");
					}else{
						 FileOperate.appendfile("/etc/temp/222.txt", "\r\n", "切换主备机失败---------"+new Date());
						out.println("qhsb");
					}
				}else if(line.equals("qhbj")){
					Command.executeCommand("service heartbeat stop");
					Thread.sleep(5000);
					String result=Command.executeCommand("cat /proc/drbd");
					if(result.contains("Secondary/Primary")){
						out.println("qhbjwc");
						Command.executeCommand("service heartbeat start");
						FileOperate.wirtefile("/etc/temp/2.txt", "备机", "");
					}else{
						out.println("qhsb");
					}
				}else{
					String result=Command.executeCommand(line);
					result=result==null?"":result;
					out.println(result);
				}
				//out.flush();
				//System.out.print(line);
				out.close();
				in.close();
				socket.close();
			}
			
		} catch (Exception e) {
		}finally{
			try {
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private PrintWriter out;

	public Server() {
		
	}

	//切换主备机
	private void changezbj(){
		//启动mysql
		Command.executeCommand("service mysqld start");
		//启动httpd
		Command.executeCommand("service httpd start");
		//启动drbd
		Command.executeCommand("service drbd start");
	}
	
	public static void main(String[] args) {
		new Client();
		System.out.print("fff");
	}
	
	
}
