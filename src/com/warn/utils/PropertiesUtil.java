package com.warn.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * properties 帮助类
 * @author lism
 *
 */

public class PropertiesUtil {
	private  Properties p;
	 public PropertiesUtil(String url){
		 File file=new File(url);
		 if(file.exists()){
		  p=new Properties();
			 try {
				p.load(new FileInputStream(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 }
	 public PropertiesUtil(File file){
		 if(file.exists()){
		  p=new Properties();
			 try {
				p.load(new FileInputStream(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}
	 }
	 /**
	  * 根据属性名称得到属性值
	  * @param name
	  * @return
	  */
	 public String getProper(String name){
		 if(p!=null)
		  return p.getProperty(name); 
		 return "";
	 }

	public Properties getP() {
		return p;
	}

	public void setP(Properties p) {
		this.p = p;
	}
}
