package com.warn;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class DrawClock extends JPanel implements Runnable {

 Thread newThread;
 public static int RADIUS=80;
 public int centerX=150;
 public int centerY=120;
 
 public int hr,min,sec;
 public int[] xPoint=new int[4];
 public int[] yPoint=new int[4];
 public double hrAlpha,minAlpha,secAlpha,theta;
 
 private JTextField timezone;
 
 public void start(){
  newThread=new Thread(this);
  newThread.start();
 }
 
 public void stop(){
  newThread=null;
 }
 
 public void paint(Graphics g){
  super.paint(g);
  //画出刻度
  double minuteAlpha = Math.PI/30.0;
  int count =0;
  for(double alpha=0;alpha<2.0*Math.PI;alpha+=minuteAlpha){
   int tX= (int)(centerX+RADIUS*0.9*Math.sin(alpha));
   int tY= (int)(centerY-RADIUS*0.9*Math.cos(alpha));
   if(count%5==0){
    g.setColor(Color.BLUE);
    g.fill3DRect(tX, tY, 3, 3, false);
    if(count%3==0){
     g.setColor(Color.RED);
     int m=count/15;
     switch(m){
     case 1:g.drawString("3", centerX+RADIUS-18,centerY+5);
     break;
     case 2:g.drawString("6", centerX-3, centerY+RADIUS-10);
     break;
     case 3:g.drawString("9", centerX-RADIUS+11, centerY+6);
     break;
     default :g.drawString("12", centerX-5, centerY-RADIUS+22);
     }
    }
   }else{
    g.setColor(Color.GRAY);
    g.fill3DRect(tX, tY, 2, 2, false);
   }
   count++;
  }
  //画出时针
  g.setColor(Color.gray);
  drawPointer(g,centerX+2,centerY+2,(int)(RADIUS*0.75),hrAlpha);
  g.setColor(Color.CYAN);
  drawPointer(g,centerX,centerY,(int)(RADIUS*0.75),hrAlpha);
  //画出分针
  g.setColor(Color.GRAY);
  drawPointer(g,centerX+2,centerY+2,(int)(RADIUS*0.83),minAlpha);
  g.setColor(Color.CYAN);
  drawPointer(g,centerX,centerY,(int)(RADIUS*0.83),minAlpha);
  //画出秒针
  g.setColor(Color.GRAY);
  g.drawLine(centerX, centerY, (int)(centerX+(RADIUS*0.79)*Math.sin(secAlpha)), (int)(centerY-(RADIUS*0.79)*Math.cos(secAlpha)));
  setBorder(new TitledBorder("系统时间"));
  setBackground(Color.WHITE);
  
  g.drawRect(85, 210, 130, 20); 
  g.setColor(Color.WHITE);
  g.setColor(Color.DARK_GRAY);
  
  Date nowDate =new Date();
  g.drawString(nowDate.toLocaleString(), 100, 225);
  
 }
 //得到系统时间
 public Date getDate(){
  Date nowDate =new Date();
  return nowDate;
 }
 //刷新图层
 public void update(Graphics g){
   paint(g);
 }

 public void run() {
  while(newThread!=null){
   repaint();
   try {
    Thread.sleep(800);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
   Date timeNow =new Date();
   int hours=timeNow.getHours();
   int minutes=timeNow.getMinutes();
   int seconds =timeNow.getSeconds();
   hr=hours%12;
   min=minutes;
   sec=seconds;
   
   theta=Math.PI/6.0/20.0 ;
   
   hrAlpha=(double)(hr*3600+min*60+sec)/(12*3600.0)*2.0*Math.PI;
   minAlpha=(double)(min*60+sec)/3600.0*2.0*Math.PI;
   secAlpha =(double)(sec)/60.0*2.0*Math.PI;
   
  }
 }
 private void drawPointer(Graphics g, int x, int y, int len, double theta) {
  xPoint[0]=(int)(x+len*0.3*Math.sin(theta-Math.PI));
  yPoint[0]=(int)(y-len*0.3*Math.cos(theta-Math.PI));
  xPoint[1]=(int)(xPoint[0]+len*0.3*Math.sin(theta-(5.0/180)*Math.PI));
  yPoint[1]=(int)(yPoint[0]-len*0.3*Math.cos(theta-(5.0/180)*Math.PI));
  xPoint[2]=(int)(xPoint[0]+len*Math.sin(theta));
  yPoint[2]=(int)(yPoint[0]-len*Math.cos(theta));
  xPoint[3]=(int)(xPoint[0]+len*0.3*Math.sin(theta+(5.0/180)*Math.PI));
  yPoint[3]=(int)(yPoint[0]-len*0.3*Math.cos(theta+(5.0/180)*Math.PI));
  
  g.fillPolygon(xPoint, yPoint,4);
 }
}