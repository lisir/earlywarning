package com.warn.socket;

import java.io.*;
import java.net.*;
import java.util.Date;

import javax.swing.JOptionPane;

import com.warn.Command;
import com.warn.utils.FileOperate;

/**
 * socket 客户端
 * @author lism
 */
public class Client {
	Socket socket = null;
	BufferedReader in = null;
	PrintWriter out = null;

	public Client() {

	}

	/**
	 * 客户端发送消息
	 * 
	 * @param ip
	 *            服务端ip地址
	 * @param message
	 *            消息内容
	 * @param port
	 *            端口号
	 */
	public String sendMessage(String ip, String message, int port) {
		String result="";
		try {
			socket = new Socket(ip, port);
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));// 接收服务器端返回的信息
			out = new PrintWriter(socket.getOutputStream(), true);// 向服务器端发送消息
			// BufferedReader line = new BufferedReader(new InputStreamReader(
			// System.in));

			out.println(message);
			 result=in.readLine();
			result=result==null?"":result.trim();
			 FileOperate.appendfile("/etc/temp/222.txt", "\r\n", message+"---------"+new Date());
			if(result.equals("qhwc")){
				Command.executeCommand("service heartbeat start");
				FileOperate.wirtefile("/etc/temp/2.txt", "备机", "");
				//JOptionPane.showMessageDialog(null, "切换成功", "提示",  JOptionPane.INFORMATION_MESSAGE);
			}else if(result.equals("qhbjwc")){
				FileOperate.wirtefile("/etc/temp/2.txt", "主机", "");
			}
				return result;
			
			// System.out.print(in.readLine());
			// out.println("启动drbd");
		} catch (IOException e) {
			result="连接超时";
		} finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			}

		}
		return result;
	}
	
	public static void main(String[] args) {
		new Client().sendMessage("192.167.12.12", "fff", 1000);
	}
}
