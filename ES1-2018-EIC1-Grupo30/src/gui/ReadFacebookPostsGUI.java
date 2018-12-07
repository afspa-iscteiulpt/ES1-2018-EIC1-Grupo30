package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.List;
import java.awt.TextArea;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JList;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;

public class ReadFacebookPostsGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReadFacebookPostsGUI window = new ReadFacebookPostsGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReadFacebookPostsGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 685, 399);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		TextArea textArea = new TextArea();
		panel.add(textArea, BorderLayout.EAST);
		
		List list = new List();
		panel.add(list, BorderLayout.CENTER);
		
		Panel panel_1 = new Panel();
		panel.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblSelecioneOEmail = new JLabel("Selecione o tweet \u00E0 esquerda e leia-o \u00E0 direita");
		lblSelecioneOEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblSelecioneOEmail);
	}

}