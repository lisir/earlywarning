package com.warn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Calender extends JPanel implements ActionListener {
 /**
	 * 
	 */
	private static final long serialVersionUID = -6724565622249846373L;
public static final String HOUR_OF_DAY=null;
 JComboBox yearCom=new JComboBox();
 JComboBox monthCom = new JComboBox();
 JLabel year_i=new JLabel("年");
 JLabel month_i=new JLabel("月");
 Date nowDate =new Date();
 JLabel[]  labDay= new JLabel[49];
 int now_year=nowDate.getYear()+1900;
 int now_month=nowDate.getMonth();
 
 boolean  bool =false;
 String year_int=null;
 int month_int=0;
 JPanel paneYM=new JPanel();
 JPanel paneDay =new JPanel();
 public Calender(){
  super();
  for(int year=now_year-30;year<=now_year+30;year++){
   yearCom.addItem(year+"");
   
  }
  for(int i=1;i<13;i++){
   monthCom.addItem(i+"");
  }
  yearCom.setSelectedIndex(30);
  paneYM.add(new JLabel(" "));
  paneYM.add(yearCom);
  paneYM.add(year_i);
  monthCom.setSelectedIndex(now_month);
  paneYM.add(monthCom);
  paneYM.add(month_i);
  paneYM.add(new JLabel(" "));
  
  monthCom.addActionListener( this);
  yearCom.addActionListener(this);
  
  paneDay.setLayout(new GridLayout(7,7,10,10));
  for(int i=0;i<49;i++){
   labDay[i] =new JLabel("  ");
   paneDay.add(labDay[i]);
  }
  this.setDay();
  this.setLayout(new BorderLayout());
  this.add(paneDay,BorderLayout.CENTER);
  this.add(paneYM,BorderLayout.NORTH);
  this.setSize(100,200);
  this.setBorder(new TitledBorder("日历"));
  setSize(300,300);
 }
 //设置日历中的日期
  void setDay() {
  if(bool){
   year_int=now_year+"";
   month_int=now_month;
   
  }else{
   year_int=yearCom.getSelectedItem().toString();
   month_int=monthCom.getSelectedIndex();
  }
  int year_sel=Integer.parseInt(year_int)-1900;
  Date date= new Date(year_sel,month_int,1);
  GregorianCalendar cal=new GregorianCalendar();
  cal.setTime(date);
  String[] week={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
  int day=0;
  int day_week=0;
  
  for(int i=0;i<7;i++){
   labDay[i].setText(week[i]);
  }
  if(month_int==0||month_int==2||month_int==4||month_int==6||month_int==9||month_int==11){
   day=31;
  }else if(month_int==1 ||month_int==3||month_int==5||month_int==7||month_int==8||month_int==10){
   day=30;
  }else{
   if(cal.isLeapYear(year_sel)){
    day=29;
   }else{
    day=28;
   }
  }
  day_week=7+date.getDay();
  int count=1;
  for(int i=day_week;i<day_week+day;count++,i++){
   if(i %7==0||i==13||i==20||i==27||i==48||i==34||i==41){
    if(i==day_week+nowDate.getDate()-1){
     labDay[i].setForeground(Color.BLUE);
     labDay[i].setText(count+"'");
    }else{
     labDay[i].setForeground(Color.RED);
     labDay[i].setText(count+"");
    }
    
   }else{
    if(i==day_week+nowDate.getDate()-1){
     labDay[i].setForeground(Color.BLUE);
     labDay[i].setText(count+"'");
    }else{
     labDay[i].setForeground(Color.BLACK);
     labDay[i].setText(count+"");
    }
   }
   
  }
  if(day_week==0){
   for(int i=day;i<49;i++){
    labDay[i].setText(" ");
   }
  }else{
   for(int i=7;i<day_week;i++){
    labDay[i].setText(" ");
   }
   for(int i=day_week+day;i<49;i++){
    labDay[i].setText(" ");
   }
  }
 }
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==yearCom||e.getSource()==monthCom){
   bool=false;
   this.setDay();
  }
 }
}