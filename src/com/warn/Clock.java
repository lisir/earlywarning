package com.warn;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class Clock extends JPanel {
 private  UIManager.LookAndFeelInfo  looks[];
 private DrawClock clock;
 private JPanel paneClock;
 JPanel paneCal;
 public Clock(){
  super();
  looks=UIManager.getInstalledLookAndFeels();
  changeTheLookAndFeel(2);
  clock=new DrawClock();
  clock.start();
  this.setBackground(Color.GRAY);
  this.setLayout(new BorderLayout());
  this.setOpaque(false);
  this.add(clock);
  this.setBorder(new TitledBorder("时间日期 "));
  setSize(300,300);
  setVisible(true);
 }
 private void changeTheLookAndFeel(int i) {
  try{
   UIManager.setLookAndFeel(looks[i].getClassName());
   SwingUtilities.updateComponentTreeUI(this);
  }catch(Exception e){
   e.printStackTrace();
  }
 }
}