package com.util;

import java.awt.image.BufferedImage;

import java.io.IOException;

import javax.imageio.ImageIO;
	
public class ImageUtil {
		
		/**
		 * ����ͼƬ·����ȡͼƬ
		 * @param path
		 * @return
		 */
		public static BufferedImage getImg(String path){
			//����ͼƬ
			try {
				//�������ŵ�ַȥ��ͼƬ
				BufferedImage img = ImageIO.read(ImageUtil.class.getResource(path));
				//�ҵ��ˣ��ͽ�ͼƬ����
				return img;
			} catch (IOException e) {
				//������Ҳ�����ԭ��
				e.printStackTrace();
			}
			return null;
		}

	}

