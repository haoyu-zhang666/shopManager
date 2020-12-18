package com.view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TestBackgroundColor extends JFrame {
	    public static void main(String[] args) {
	// TODO Auto-generated method stub
	        TestBackgroundColor tbc = new TestBackgroundColor();
	        tbc.setVisible(true);
	    }
	    private JPanel imagePanel;
	    private ImageIcon background;

	    public TestBackgroundColor() {
	        background = new ImageIcon("./images/background.png");// 背景图片
	        JLabel label = new JLabel(background);// 把背景图片显示在一个标签里面
	// 把标签的大小位
	// 置设置为图片刚好填充整个面板
	        label.setBounds(0,0, background.getIconWidth(), background
	                .getIconHeight());
	// 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
	        imagePanel = (JPanel) this.getContentPane();
	        imagePanel.setOpaque(false);
	// 内容窗格默认的布局管理器为BorderLayout
	        imagePanel.setLayout(new FlowLayout());
	        imagePanel.add(new JButton("测试按钮"));
	        this.getLayeredPane().setLayout(null);
	// 把背景图片添加到分层窗格的最底层作为背景
	        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(background.getIconWidth(), background.getIconHeight());
	        this.setVisible(true);
	    }
	}

