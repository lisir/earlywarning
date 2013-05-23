package com.warn.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOperate {
	/**
	 * 在path路径上写入ip地址
	 * @param path
	 * @param ip1
	 * @param ip2
	 */
	public static void wirtefile(String path,String ip1,String ip2){
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
			//file.delete();
		}
		BufferedWriter write = null;
		try {
			write = new BufferedWriter(new FileWriter(file));
			write.write(ip1);
			if(null!=ip2&&!"".equals(ip1)){
				write.write("\r\n");
				write.write(ip2);
			}
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
	
	
	/**
	 * 在path路径上追加文字
	 * @param path
	 * @param ip1
	 * @param ip2
	 */
	public static void appendfile(String path,String ip1,String ip2){
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
			//file.delete();
		}
		BufferedWriter write = null;
		try {
			write = new BufferedWriter(new FileWriter(file,true));
			write.write(ip1);
			if(null!=ip2&&!"".equals(ip1)){
				write.write("\r\n");
				write.write(ip2);
			}
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
	
	//读取文件
	public static String readfile(String path){
		String result="";
		File file=new File(path);
		if(!file.exists()){
			return null;
		}
		BufferedReader read=null;
		try {
			 read=new BufferedReader(new FileReader(file));
			String str=null;
			while((str=read.readLine())!=null){
				result+=","+str;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(result!=null&&result.trim().length()>0){
			result=result.substring(1);
		}
		return result;
		
	}
	
	 /**
     * 文件file进行加密
     * @param fileUrl 文件路径
     * @param key 密码
     * @throws Exception
     */
    public static void copyfile(InputStream in, String destFile) throws Exception {
//        File file = new File(fileUrl);
//        if(!file.exists()){
//            return;
//        }
       // String destFile = path.substring(0, index)+"\\"+"abc";
        File dest = new File(destFile);
        if(!dest.exists()){
        	dest.getParentFile().mkdirs();
        	dest.createNewFile();
        }
       //InputStream in = new FileInputStream(fileUrl);
        OutputStream out = new FileOutputStream(destFile);
        byte[] buffer = new byte[1024];
        int r;
        //byte[] buffer2=new byte[1024];
        while (( r= in.read(buffer)) > 0) {
                out.write(buffer, 0, r);
                out.flush();
        }
        in.close();
        out.close();
    }
}
