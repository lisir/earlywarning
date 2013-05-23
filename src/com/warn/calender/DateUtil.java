package com.warn.calender;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	/**
	 * 判断是否闰年
	 * @param year
	 * @return
	 */
	private boolean isLeapYear(int year){
		if(year%100==0){
			if(year%400==0){
				return true;
			}else{
				return false;
			}
		}else{
			if(year%4==0){
				return true;
			}else{
				return false;
			}
		}
	}
	
	/**
	 * 返回该年该月，有多少天
	 * @param year
	 * @param month
	 * @return
	 */
	public int getDatesOfMonth(int year,int month){
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			return 31;
		}else if(month==2){
			if(isLeapYear(year))
				return 29;
			else
				return 28;
		}else{
			return 30;
		}
	}
	
	/**
	 * 拿当前日期在当前月的头一天
	 * @param date
	 * @return
	 */
	public Date getFirstDateOfMonth(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		Date result = new Date(date.getTime()-(dayOfMonth-1)*24l*3600*1000);
		return result;
	}
	
	/**
	 * 拿年份
	 * @param date
	 * @return
	 */
	public int getYear(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		return year;
	}
	
	/**
	 * 拿月份
	 * @param date
	 * @return
	 */
	public int getMonth(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int month = calendar.get(Calendar.MONTH)+1;
		return month;
	}
	
	/**
	 * 拿号数
	 * @param date
	 * @return
	 */
	public int getDate(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int d = calendar.get(Calendar.DAY_OF_MONTH);
		return d;
	}
	
	public static void main(String[] args){
		
	}
}
