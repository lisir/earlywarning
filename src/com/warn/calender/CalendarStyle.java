package com.warn.calender;

public class CalendarStyle {
	
	private String fontColor="000000"; // 字体颜色，默认情况下，字体的颜色为黑色
	
	private String selectedFontColor="FF0000";  // 被选中字体颜色，默认情况下，字体的颜色为红色

	public String getFontColor() {
		return fontColor;
	}

	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}

	public String getSelectedFontColor() {
		return selectedFontColor;
	}

	public void setSelectedFontColor(String selectedFontColor) {
		this.selectedFontColor = selectedFontColor;
	}
	
	

}
