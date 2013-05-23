package com.warn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

//启动报警声音
public class WaringTask extends java.util.TimerTask{
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
	   //System.out.println("------itcast-----------间隔3秒打印一次！----------csdn-------------");
	   }
}
