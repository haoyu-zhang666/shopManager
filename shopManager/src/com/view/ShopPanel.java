package com.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

	/**
	 *����� 
	 * Java�е������:JPanel
	 * дһ���࣬�̳�JPanel
	 * дһ�����췽����ȷ�������ص�
	 */
public class ShopPanel extends JPanel{
    Image im;
    public static final int WTH=300;
    public static final int HHT=200;
    
    public ShopPanel() {
		// TODO Auto-generated constructor stub
    	 im=Toolkit.getDefaultToolkit().getImage("background.png");
	}
    
    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	int imWidth=im.getWidth(this); 
		int imHeight=im.getHeight(this);
		int FWidth=getWidth(); 
		int FHeight=getHeight();
		int x=(FWidth-imWidth)/2; 
		int y=(FHeight-imHeight)/2;
		g.drawImage(im,x,y,null);
    }
   

}
