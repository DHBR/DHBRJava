package io.github.dhbr;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.*;

public class SimpleSwing {
SimpleSwing() {

JFrame jfrm = new JFrame("Aplicação simples de swing");
	jfrm.setSize(1000,600);
	
	JPanel jpanel = new JPanel() { 
		public void paint(Graphics g) { 
		g.drawString("THE JAVA",500,300); 

		} 
		}; 
		jpanel.setLayout(new FlowLayout());
	jfrm.add(jpanel);
	jfrm.setVisible(true);
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfrm.setResizable(false);
	
	
}
	public static void main(String[] args) {

SwingUtilities.invokeLater(new Runnable() {
	public void run() {
		new SimpleSwing();
	}});
	
		}

}
