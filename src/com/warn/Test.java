package com.warn;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {
 public Test(){
  Clock clock=new Clock();
  Calender cal=new Calender();
  JPanel jp2 = new JPanel();
  
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setSize(600, 300);
  this.setVisible(true);
  this.setContentPane(clock);
  
  this.getContentPane().add(cal,BorderLayout.WEST);
  this.setResizable(false);
  
 }
 public static void main(String[] args){
  Test test =new Test();
  test.setTitle("万年历和时钟");
  
  
 }
}