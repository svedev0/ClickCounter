package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class Counter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton start;
	private JButton exit;
	private JPanel panel;
	private JLabel statusBar;
	private JLabel timeLeft;
	private String congrats;
	private int clickCount;
	ImageIcon icon = new ImageIcon("/icons/icon.png");
	
	public Counter() {
		
		super("Click Counter!");
		setIconImage(icon.getImage());
		setSize(400, 200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		start = new JButton("start");
		start.setBounds(100, 30, 200, 50);
		add(start);
		start.addActionListener(new StartListener());
		
		exit = new JButton("Exit");
		exit.setBounds(100, 90, 200, 50);
		add(exit);
		exit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setVisible(false);
		add(panel, BorderLayout.CENTER);
		panel.addMouseListener(new PanelListener());
		
		statusBar = new JLabel();
		add(statusBar, BorderLayout.SOUTH);
		
		TimeListenerClass tc = new TimeListenerClass();
	}
	
	private class StartListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			start.setVisible(false);
			exit.setVisible(false);
			panel.setVisible(true);
			clickCount = 0;
		}
	}
	
	private class PanelListener extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			clickCount++;
			statusBar.setText(String.format("You clicked %d times.", clickCount));
		}
	}
	
	private class TimeListenerClass implements ActionListener {
		private int x = 30;
		
		public void actionPerformed(ActionEvent e) {
			x--;
			
			if (x >= 0) {
			} else {
				if (clickCount >= 0 && clickCount < 100) {
					congrats = String.format("You clicked %d times. You are slow!", clickCount);
					JOptionPane.showMessageDialog(null, congrats);
				} else if (clickCount > 100 && clickCount <= 200) {
					congrats = String.format("You clicked %d times. You are quick!", clickCount);
					JOptionPane.showMessageDialog(null, congrats);
				} else if (clickCount > 200 && clickCount <= 300) {
					congrats = String.format("You clicked %d times. You could get a job as a pro clicker!", clickCount);
					JOptionPane.showMessageDialog(null, congrats);
				} else if (clickCount > 300) {
					congrats = String.format("You clicked %d times. Stop cheating!", clickCount);
					JOptionPane.showMessageDialog(null, congrats);
				}
				start.setVisible(true);
				exit.setVisible(true);
				panel.setVisible(false);
				x = 30;
			}
		}
	}
}
