package io.github.dhbr;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class SimpleSwing2 {
SimpleSwing2() {

JFrame jfrm = new JFrame("Aplicação simples de swing");
	jfrm.setSize(300,60);
	
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfrm.setResizable(false);
	JLabel jlab = new JLabel("Esse programa é bastante simples");
	jfrm.add(jlab,BorderLayout.PAGE_START);
	jfrm.setVisible(true);
}
	public static void main(String[] args) {

SwingUtilities.invokeLater(new Runnable() {
	public void run() {
		new SimpleSwing2();
	}});
	
		}

}
