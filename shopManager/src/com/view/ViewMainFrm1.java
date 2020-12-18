package com.view;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewMainFrm1 extends JFrame {

    private JPanel contentPane;
    private ImageIcon background;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewMainFrm1 frame = new ViewMainFrm1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ViewMainFrm1() throws IOException {
        background = new ImageIcon("./images/background.png");// ±≥æ∞Õº∆¨
        JLabel labelImage = new JLabel(background);// ∞—±≥æ∞Õº∆¨œ‘ æ‘⁄“ª∏ˆ±Í«©¿Ô√Ê

        labelImage.setBounds(0, 0, background.getIconWidth(), background
                .getIconHeight());

        setBackground(new Color(20, 28, 210));

        setTitle("\u54C8\u4FE1\u606F\u4E8C\u624B\u4EA4\u6613\u5E73\u53F0");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 490, 327);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel label = new JLabel("");
        JPanel panel = new JPanel();
        //ÃÌº”±≥æ∞Õº
        panel.add(labelImage);


        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(166)
                                .addComponent(label)
                                .addContainerGap(296, Short.MAX_VALUE))
                        .addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(label)
                                .addContainerGap(26, Short.MAX_VALUE))
        );

        JButton btnNewButton = new JButton("\u7BA1\u7406\u5458\u767B\u5F55");

        JButton btnNewButton_1 = new JButton("\u65B0\u7528\u6237\u6CE8\u518C");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jb_viewProductActionPerformed(e);
            }
        });

        JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\background.png"));

        JButton button = new JButton("\u8FDB\u5165\u5546\u57CE");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shoppingActionPerformed(e);
            }
        });

        JLabel label_2 = new JLabel("\u54C8\u5C14\u6EE8\u4FE1\u606F\u5DE5\u7A0B\u4E8C\u624B\u4EA4\u6613\u5E73\u53F0");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(27)
                                                .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(50)
                                                .addComponent(button)
                                                .addGap(31)
                                                .addComponent(btnNewButton)
                                                .addGap(26)
                                                .addComponent(btnNewButton_1))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(133)
                                                .addComponent(label_2)))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_2)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                .addGap(7)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(button)
                                        .addComponent(btnNewButton)
                                        .addComponent(btnNewButton_1)))
        );
        panel.setLayout(gl_panel);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jb_ManagetLogOnActionPerformed(e);
            }
        });
        contentPane.setLayout(gl_contentPane);
    }

    private void shoppingActionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        new FuntionMainFrm().setVisible(true);
    }

    private void jb_viewProductActionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        new FuntionMainFrm().setVisible(true);
    }

    private void jb_ManagetLogOnActionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        new ManagerLogOnFrm().setVisible(true);
    }
}
