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
	        background = new ImageIcon("./images/background.png");// ����ͼƬ
	        JLabel label = new JLabel(background);// �ѱ���ͼƬ��ʾ��һ����ǩ����
	// �ѱ�ǩ�Ĵ�Сλ
	// ������ΪͼƬ�պ�����������
	        label.setBounds(0,0, background.getIconWidth(), background
	                .getIconHeight());
	// �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��
	        imagePanel = (JPanel) this.getContentPane();
	        imagePanel.setOpaque(false);
	// ���ݴ���Ĭ�ϵĲ��ֹ�����ΪBorderLayout
	        imagePanel.setLayout(new FlowLayout());
	        imagePanel.add(new JButton("���԰�ť"));
	        this.getLayeredPane().setLayout(null);
	// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
	        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(background.getIconWidth(), background.getIconHeight());
	        this.setVisible(true);
	    }
	}

