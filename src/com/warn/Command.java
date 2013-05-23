package com.warn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class Command {

	//执行命令
	public static String executeCommand(String command){
		String result="";
		 try {
			 String[] commands=new String[] { "/bin/sh","-c", command};
			Process process = Runtime.getRuntime().exec(commands);
			process.waitFor();
//		 InputStreamReader ir = new InputStreamReader(process.getInputStream());  
//		 LineNumberReader input = new LineNumberReader(ir);   
			 BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream(),"UTF-8"));
			 OutputStreamWriter out = new OutputStreamWriter(process.getOutputStream(),"UTF-8");
			 int i=0;
			 String line;   
			 if(input!=null)
			 while ((line = input.readLine()) != null) {  
				 //JOptionPane.showMessageDialog(null, line, "提示",  JOptionPane.ERROR_MESSAGE);
				// if(i==0){
			    		//System.out.println(line+"    383");
						 //out.write("dir \n");
					 //out.write("n \n  e \n  3 \n q \n");
						 //out.flush();
					//	 i++;
					 //} 
				 result+=line;
					 }
			 out.close();
			 process.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	//执行命令
	public static String executeCommand(String command,String language){
		String result="";
		 try {
			Process process = Runtime.getRuntime().exec(command);
			process.waitFor();
			String lg="GBK";
			if(null!=language){
				if(language.toLowerCase().contains("utf-8")){
					lg="UTF-8";
				}
			}
			 BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream(),lg));
			 OutputStreamWriter out = new OutputStreamWriter(process.getOutputStream(),"UTF-8");
			 int i=0;
			 String line;   
			 if(input!=null)
			 while ((line = input.readLine()) != null) {  
				 result+=line;
					 }
			 out.close();
			 process.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//执行多个命令
	//1.     exec的必须是可执行的程序，如果是命令行的命令则还需另外处理
	//2.     在windows中process = runtime.exec(new String[] { "cmd.exe","/C", "dir"});
	//3.     在linux中process = runtime.exec(new String[] { "/bin/sh","-c", "echo $PATH"}); 
	public static String executeCommand(String[] command){
		String result="";
		if(command!=null){
			String[] commands=new String[command.length+2];
			commands[0]="/bin/sh";
			commands[1]="-c";
			for(int i=0;i<command.length;i++){
				commands[i+2]=command[i];
			}
		 try {
			Process process = Runtime.getRuntime().exec(commands);
			process.waitFor();
			 BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			 OutputStreamWriter out = new OutputStreamWriter (process.getOutputStream());
			 int i=0;
			 String line;   
			 if(input!=null)
			 while ((line = input.readLine()) != null) {  
				 result+=line;
					 }
			 out.close();
			 process.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return result;
	}
	
}
