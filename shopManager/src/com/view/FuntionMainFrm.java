/*
 * FuntionMainFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.view;

import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class FuntionMainFrm extends JFrame {

	/** Creates new form FuntionMainFrm */
	public FuntionMainFrm() {
		initComponents();
		//������� ��
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		table = new javax.swing.JDesktopPane();
		jMenuBar1 = new javax.swing.JMenuBar();
		jmi_viewProduct = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jmi_registerMember = new javax.swing.JMenu();
		jmi_customerAdd = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jmi_viewProduct.setText("�����̳�");
		jmi_viewProduct.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmi_viewProductActionPerformed(evt);
			}
		});

		jMenuItem1.setText("�����Ʒ");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jmi_viewProduct.add(jMenuItem1);

		jMenuBar1.add(jmi_viewProduct);

		jmi_registerMember.setText("���û�ע��");

		jmi_customerAdd.setText("ע���Ա");
		jmi_customerAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmi_customerAddActionPerformed(evt);
			}
		});
		jmi_registerMember.add(jmi_customerAdd);

		jMenuBar1.add(jmi_registerMember);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jmi_customerAddActionPerformed(java.awt.event.ActionEvent evt) {
		CustomerAddInterFrm CustomerAddInterFrm = new CustomerAddInterFrm();
		CustomerAddInterFrm.setVisible(true);
		this.table.add(CustomerAddInterFrm);
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		ProductBuyInterFrm productBuyInterFrm = new ProductBuyInterFrm();
		productBuyInterFrm.setVisible(true);
		this.table.add(productBuyInterFrm);
	}

	private void jmi_viewProductActionPerformed(java.awt.event.ActionEvent evt) {
		ProductBuyInterFrm productBuyInterFrm = new ProductBuyInterFrm();
		productBuyInterFrm.setVisible(true);
		this.table.add(productBuyInterFrm);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FuntionMainFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jmi_customerAdd;
	private javax.swing.JMenu jmi_registerMember;
	private javax.swing.JMenu jmi_viewProduct;
	javax.swing.JDesktopPane table;
	// End of variables declaration//GEN-END:variables

}