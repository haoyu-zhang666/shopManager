package com.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

	/**
	 *面板类 
	 * Java中的面板类:JPanel
	 * 写一个类，继承JPanel
	 * 写一个构造方法，确定面板的特点
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
