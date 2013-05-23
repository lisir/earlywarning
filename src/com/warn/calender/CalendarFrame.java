package com.warn.calender;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.swing.BorderFactory;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class CalendarFrame extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1093548178752227692L;
	
	/**
	 * 日历界面中号数的Label
	 */
	private final JLabel[] dateLabels = new JLabel[42];
	
	/**
	 * 输入年数的文本框
	 */
	private JTextField yearInput = new JTextField(5);
	
	/**
	 * 输入月份的文本框
	 */
	private JTextField monthInput = new JTextField(5);
	
	/**
	 * 输入号数的文本框
	 */
	private JTextField dateInput = new JTextField(5);
	
	/**
	 * 标志日历日期的开关
	 */
	private boolean markFlag = false;
	
	private CalendarFrame frame = this;
	
	/**
	 * 把文本框的文本转化为日期格式
	 * @return
	 */
	Date parseDate(){
		
		String dateStr = yearInput.getText();
		if(monthInput.getText().length()==1){
			dateStr+="0"+monthInput.getText();
		}else{
			dateStr+=monthInput.getText();
		}
		if(dateInput.getText().length()==1){
			dateStr+="0"+dateInput.getText();
		}else{
			dateStr+=dateInput.getText();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date result = null;
		try{
			result = sdf.parse(dateStr);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 清空日历界面
	 */
	private void clearCalendar(){
		for(int i=0;i<42;i++){
			JLabel label = dateLabels[i];
			label.setText("");
		}
	}
	
	private CalendarStyle readStyleFromConfig(){
		CalendarStyle style = new CalendarStyle();
				style.setFontColor("000000");
				style.setSelectedFontColor("FF0000");
		
		return style;
	}
	
	/**
	 * 显示日历界面的方法
	 * @param date
	 */
	void showCalendar(Date date){
		
		CalendarStyle style = readStyleFromConfig();// 读取设置
		
		DateUtil dateUtil = new DateUtil();
		
		Date firstDateOfMonth = dateUtil.getFirstDateOfMonth(date);
		
		int year = dateUtil.getYear(date);
		
		int month = dateUtil.getMonth(date);
		
		int d = dateUtil.getDate(date);
		
//		yearInput.setText(String.valueOf(year));
//		
//		monthInput.setText(String.valueOf(month));
//		
//		dateInput.setText(String.valueOf(d));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(firstDateOfMonth);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		int maxDateOfMonth = dateUtil.getDatesOfMonth(year,month);
		
		clearCalendar();
		
		for(int i=dayOfWeek-1;i<dayOfWeek+maxDateOfMonth-1;i++){
			JLabel label = dateLabels[i];
			String dateStr = String.valueOf(i-dayOfWeek+2);
			if(dateStr.equals(String.valueOf(d))){
				label.setText("<html><font color='#"+style.getSelectedFontColor()+"'>"+dateStr+"</font></html>");
			}else{
				label.setText("<html><font color='#"+style.getFontColor()+"'>"+dateStr+"</font></html>");
			}
		}
		//this.show();
	}
	
//	private void buildUpMenu(){
//		
//		// 菜单设置
//		JMenuBar menuBar = new JMenuBar();
//		
//		JMenu windowMenu = new JMenu("窗口");
//		
//		JMenuItem newWindowMenuItem = new JMenuItem("新建");
//		
//		newWindowMenuItem.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				CalendarFrame frame = new CalendarFrame();
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				Dimension scmSize = toolkit.getScreenSize();
//				int imgWidth = frame.getWidth();
//				int imgHeight = frame.getHeight();
//
//				frame.setLocation(scmSize.width/2 - (imgWidth/2), scmSize.height/2 - (imgHeight/2) );
//				frame.setSize(imgWidth, imgHeight);
//				frame.pack();
//				frame.setVisible(true);
//			}
//		});
//		
//		windowMenu.add(newWindowMenuItem);
//		
//		menuBar.add(windowMenu);
//		
//		JMenu operateMenu = new JMenu("操作");
//		
//		JCheckBoxMenuItem markFlagMenuItem = new JCheckBoxMenuItem("标志");
//		
//		markFlagMenuItem.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				if(markFlag){
//					markFlag = false;
//				}else{
//					markFlag = true;
//				}
//			}
//		});
//		
//		operateMenu.add(markFlagMenuItem);
//		
//		menuBar.add(operateMenu);
//		
//		JMenu toolMenu = new JMenu("工具");
//		
//		JMenuItem settingMenuItem = new JMenuItem("设置");
//		
//		settingMenuItem.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				SettingFrame settingFrame = new SettingFrame();
//				settingFrame.setParentFrame(frame);
//				settingFrame.showFrame();
//			}
//		});
//		
//		toolMenu.add(settingMenuItem);
//		
//		menuBar.add(toolMenu);
//		
//		JMenu helpMenu = new JMenu("帮助");
//		
//		JMenuItem helpItem = new JMenuItem("帮助");
//		
//		helpItem.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				HelperFrame helper = new HelperFrame();
//				helper.showFrame();
//			}
//		});
//		helpMenu.add(helpItem);
//		
//		menuBar.add(helpMenu);
//		
//		this.setJMenuBar(menuBar);
//	}

	/**
	 * 日历控件主窗口，构造函数
	 */
	public CalendarFrame(){
	
		//this.setTitle("Swing 日历控件");
		this.setSize(250,130);
		//buildUpMenu();
		
		//Container contentPane =getContentPane();
		
		// 显示当前月份的Panel
		JPanel inputDatePanel = new JPanel();
		inputDatePanel.setLayout(new FlowLayout());
		Calendar now=Calendar.getInstance();
		JLabel yearLabel = new JLabel(now.get(Calendar.YEAR)+"年");
		
		JLabel monthLabel = new JLabel(now.get(Calendar.MONTH)+1+"月");
		
		JLabel dateLabel = new JLabel(now.get(Calendar.DATE)+"日");
		
		JButton changeButton = new JButton("确定");
		changeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Date cDate = parseDate();
				showCalendar(cDate);
			}
		});
		
//		inputDatePanel.add(yearInput);
		inputDatePanel.add(yearLabel);
//		inputDatePanel.add(monthInput);
		inputDatePanel.add(monthLabel);
//		inputDatePanel.add(dateInput);
		inputDatePanel.add(dateLabel);
//		inputDatePanel.add(changeButton);
		
		// 装载日历的Panel
		CalendarPanel calendarPanel = new CalendarPanel();
		calendarPanel.setLayout(new GridLayout(7,9));
		JLabel zhouZi = new JLabel(" 周日 ");
		zhouZi.setOpaque(true);
		zhouZi.setForeground(Color.RED);
		//zhouZi.setBackground(Color.CYAN);
		JLabel zhou1 = new JLabel(" 周一 ");
		zhou1.setOpaque(true);
		//zhou1.setBackground(Color.CYAN);
		JLabel zhou2 = new JLabel(" 周二 ");
		//zhou2.setOpaque(true);
		zhou2.setBackground(Color.CYAN);
		JLabel zhou3 = new JLabel(" 周三 ");
		zhou3.setOpaque(true);
		//zhou3.setBackground(Color.CYAN);
		JLabel zhou4 = new JLabel(" 周四 ");
		//zhou4.setOpaque(true);
		zhou4.setBackground(Color.CYAN);
		JLabel zhou5 = new JLabel(" 周五 ");
		//zhou5.setOpaque(true);
		zhou5.setBackground(Color.CYAN);
		JLabel zhou6 = new JLabel(" 周六 ");
		zhou6.setOpaque(true);
		zhou6.setForeground(Color.RED);
		//zhou6.setBackground(Color.CYAN);
		
		calendarPanel.add(zhouZi);
		calendarPanel.add(zhou1);
		calendarPanel.add(zhou2);
		calendarPanel.add(zhou3);
		calendarPanel.add(zhou4);
		calendarPanel.add(zhou5);
		calendarPanel.add(zhou6);
		
		for(int i=0;i<42;i++){
			final JLabel label = new JLabel("   ",JLabel.CENTER);
			calendarPanel.add(label);
			dateLabels[i] = label;
			label.addMouseListener(new MouseListener(){
				public void mousePressed(MouseEvent e){
					if(markFlag){
						if(label.getBackground().equals(Color.BLUE)){
							label.setOpaque(false);
						}else{
							label.setOpaque(true);
							label.setBackground(Color.BLUE);
						}
					}
					
			    }
				public void mouseReleased(MouseEvent e){
			        
			    }
			    public void mouseEntered(MouseEvent e){
			        
			    }
			    public void mouseExited(MouseEvent e){
			        
			    }
			    public void mouseClicked(MouseEvent e){
	
			    }
			});
			
		}
		
		showCalendar(new Date(System.currentTimeMillis()));
		this.setLayout(new BorderLayout());
		this.add(inputDatePanel,BorderLayout.NORTH);
		inputDatePanel.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
		inputDatePanel.setPreferredSize(new java.awt.Dimension(250, 33));
		this.add(calendarPanel,BorderLayout.CENTER);
		calendarPanel.setPreferredSize(new java.awt.Dimension(250, 104));

		//this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
