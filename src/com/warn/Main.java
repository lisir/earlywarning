package com.warn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Timer;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Index index=new Index();
//		index.show();
		Timer timer = new Timer();
		   timer.schedule(new MyTask(), 1000, 2000);//在1秒后执行此任务,以后每隔1秒执行这个MyTask任务.
		  
		  while(true){
		   Scanner scan = new Scanner(System.in);
		   String str = scan.nextLine();
		   if(str.equals("ok")){
		   timer.cancel();// 终止此计时器，丢弃所有当前已安排的任务。
		   }
		   }
		  
		    
		  }
		   static class MyTask extends java.util.TimerTask{
		  
		  public void run() {
			  try {
					
					InputStream in = Index.class.getResourceAsStream("/ALARM1.WAV");
					AudioStream as = new AudioStream(in);
					AudioPlayer.player.start(as);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		   System.out.println("------itcast-----------间隔3秒打印一次！----------csdn-------------");
		   }
		 
	}

}
