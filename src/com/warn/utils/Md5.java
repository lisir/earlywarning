package com.warn.utils;

import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.warn.dialog.Initdeploy;

public class Md5 {
	public static String  encryptmd5(String plainText) { 
		StringBuffer buf = new StringBuffer(""); 
		try { 
		MessageDigest md = MessageDigest.getInstance("MD5"); 
		md.update(plainText.getBytes()); 
		byte b[] = md.digest(); 

		int i; 

		
		for (int offset = 0; offset < b.length; offset++) { 
		i = b[offset]; 
		if(i<0) i+= 256; 
		if(i<16) 
		buf.append("0"); 
		buf.append(Integer.toHexString(i)); 
		} 

		//System.out.println("result: " + buf.toString());//32位的加密 

		//System.out.println("result: " + buf.toString().substring(8,24));//16位的加密 

		} catch (Exception e) { 
		// TODO Auto-generated catch block 
		e.printStackTrace(); 
		} 
		return buf.toString();
	} 
	
	 public static void main(String[]args){
//		 try {
//			 	                String test = "123456789@fdj.com";
//			 	                EncryptionDecryption des = new EncryptionDecryption("tourhb");// 自定义密钥
//			 	                System.out.println("加密前的字符：" + test);
//			 	                System.out.println("加密后的字符：" + des.encrypt(test));
//			 	                System.out.println("解密后的字符：" + des.decrypt(des.encrypt(test)));
//			 	               System.out.println("加密后MD5的字符：" + Md5.encryptmd5(des.encrypt(test)).equals(Md5.encryptmd5(des.encrypt("123456789@fdj.com"))));
//			 	                System.out.println("解密后的字符："
//			 	                        + des.decrypt("fe14c7c41f7d2a94b07d7928b21346e7"));
//			 	 
//			 	            } catch (Exception e) {
//			 	                e.printStackTrace();
//			 	            }
		 
		 try {
			 Initdeploy d=new Initdeploy();
//			 FileOperate.appendfile("D:/a/222.txt", "\r\n22222", "rrrr");
//			 String str="sync'ed: 48.9% (4880/9544)M finish: 0:07:10 speed: 11,584 (10,924) K/sec";
//			System.out.println(str.substring(str.indexOf("sync'ed:")+9,str.indexOf("finish:")));
//			 Pattern pa = Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
//			Matcher m= pa.matcher("255.255.255.256");
//			System.out.println(m.find());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
