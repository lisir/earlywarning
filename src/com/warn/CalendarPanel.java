package com.warn;

import java.awt.BorderLayout;  
import java.awt.Container;  
import java.awt.Font;  
import java.awt.GridLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.util.Calendar;  
import java.util.GregorianCalendar;  
  
import javax.swing.Box;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
  
public class CalendarPanel extends JFrame {  
  
    private static final long serialVersionUID = 1L;  
    Calendar cal = null;  
    JPanel operationPanel = null;  
    JPanel dateContainerPanel = null;  
    JButton pMonth = new JButton("<");  
    JButton nMonth = new JButton(">");  
    JButton pYear = new JButton("<<");  
    JButton nYear = new JButton(">>");  
    JLabel monthLabel = new JLabel();  
  
    private int year;  
    private int month;  
  
    public CalendarPanel() {  
        Calendar cal = Calendar.getInstance();  
        this.year = cal.get(Calendar.YEAR);  
        this.month = cal.get(Calendar.MONTH);  
        buildJFrame(cal);  
    }  
  
    public void buildJFrame(Calendar cal) {  
        Container contentPane = getContentPane();  
        contentPane.add(getOprPanel(), BorderLayout.NORTH);  
        contentPane.add(getPanel(cal), BorderLayout.CENTER);  
        setSize(500, 500);  
        setVisible(true);  
        setLocationRelativeTo(null);  
        setResizable(false);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
  
    public static void main(String args[]) {  
        new CalendarPanel();  
    }  
  
    // 操作按钮及月份显示  
    public JPanel getOprPanel() {  
        if (operationPanel == null) {  
            operationPanel = new JPanel();  
        }  
        Box hBox = Box.createHorizontalBox();  
        monthLabel.setText(this.year + "年 " + (this.month + 1) + "月");  
        hBox.add(pYear);  
        hBox.add(Box.createHorizontalStrut(20));  
        hBox.add(pMonth);  
        hBox.add(Box.createHorizontalStrut(20));  
        hBox.add(monthLabel);  
        hBox.add(Box.createHorizontalStrut(20));  
        hBox.add(nMonth);  
        hBox.add(Box.createHorizontalStrut(20));  
        hBox.add(nYear);  
        pYear.addActionListener(new previousYear());  
        nYear.addActionListener(new nextYear());  
        pMonth.addActionListener(new previousMonth());  
        nMonth.addActionListener(new nextMonth());  
        operationPanel.add(hBox);  
        return operationPanel;  
    }  
  
    // 日期面板生成  
    public JPanel getPanel(Calendar cal) {  
        if (dateContainerPanel == null) {  
            dateContainerPanel = new JPanel();  
        }  
        dateContainerPanel.removeAll();  
        cal.set(Calendar.DAY_OF_MONTH, 1);  
        cal.add(Calendar.MONTH, 1);  
        cal.add(Calendar.DAY_OF_MONTH, -1);  
        int weeks = cal.get(Calendar.WEEK_OF_MONTH);  
  
        GridLayout grid = new GridLayout(weeks + 1, 7);  
        dateContainerPanel.setLayout(grid);  
        cal.set(Calendar.DAY_OF_MONTH, 1);  
        int weekday = cal.get(Calendar.DAY_OF_WEEK);  
        cal.add(Calendar.DAY_OF_MONTH, 1 - weekday);  
  
        String[] weekTitle = { "日", "一", "二", "三", "四", "五", "六" };  
  
        // 其他月份日期字体  
        Font hFont = new Font("宋体", 2, 12);  
        for (int i = 0; i < weeks + 1; i++) {  
            for (int j = 0; j < 7; j++) {  
                if (i == 0) {  
                    JButton button = new JButton(weekTitle[j]);  
                    button.setEnabled(false);  
                    dateContainerPanel.add(button);  
                } else {  
                    JButton button = new JButton(cal.get(Calendar.DAY_OF_MONTH) + "");  
                    if (cal.get(Calendar.MONTH) != month) {  
                        button.setFont(hFont);  
                    }  
                    dateContainerPanel.add(button);  
                    cal.add(Calendar.DAY_OF_MONTH, 1);  
                }  
            }  
        }  
        return dateContainerPanel;  
    }  
  
    // 向后翻一月  
    class nextMonth implements ActionListener {  
        public void actionPerformed(ActionEvent e) {  
            Calendar cal = new GregorianCalendar(year, month, 1);  
            cal.add(Calendar.MONTH, 1);  
            year = cal.get(Calendar.YEAR);  
            month = cal.get(Calendar.MONTH);  
            monthLabel.setText(year + "年 " + (month + 1) + "月");  
            getPanel(cal);  
        }  
    }  
  
    // 向前翻一月  
    class previousMonth implements ActionListener {  
        public void actionPerformed(ActionEvent e) {  
            Calendar cal = new GregorianCalendar(year, month, 1);  
            cal.add(Calendar.MONTH, -1);  
            year = cal.get(Calendar.YEAR);  
            month = cal.get(Calendar.MONTH);  
            monthLabel.setText(year + "年 " + (month + 1) + "月");  
            getPanel(cal);  
        }  
    }  
  
    // 向后翻一年  
    class nextYear implements ActionListener {  
        public void actionPerformed(ActionEvent e) {  
            Calendar cal = new GregorianCalendar(year, month, 1);  
            cal.add(Calendar.YEAR, 1);  
            year = cal.get(Calendar.YEAR);  
            month = cal.get(Calendar.MONTH);  
            monthLabel.setText(year + "年 " + (month + 1) + "月");  
            getPanel(cal);  
        }  
    }  
  
    // 向前翻一年  
    class previousYear implements ActionListener {  
        public void actionPerformed(ActionEvent e) {  
            Calendar cal = new GregorianCalendar(year, month, 1);  
            cal.add(Calendar.YEAR, -1);  
            year = cal.get(Calendar.YEAR);  
            month = cal.get(Calendar.MONTH);  
            monthLabel.setText(year + "年 " + (month + 1) + "月");  
            getPanel(cal);  
        }  
    }  
}  