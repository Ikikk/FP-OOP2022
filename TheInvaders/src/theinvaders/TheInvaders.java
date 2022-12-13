/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package theinvaders;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static theinvaders.Commons.BOARD_HEIGHT;
import static theinvaders.Commons.BOARD_WIDTH;

/**
 *
 * @author ASUS
 */

public class TheInvaders extends JFrame implements Commons {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4905230094675077405L;

	private final JButton start;
        private final JButton help;
        private JTextField namePlayer;
	
	/*
	 * Inicio
	 */
	private static final String TOP_MESSAGE = "The Invaders <br> by Rizky Alifiyah Rahma";
	private static final String INITIAL_MESSAGE = "Hello Archer!!" + "<br><br><br>Your Mission:"
			+ "<br><br>Hit all the birds and don't hit the bird's poops to still alive";
	/*
	 * Ajuda
	 */
	private static final String HELP_TOP_MESSAGE = "Help";
	private static final String HELP_MESSAGE = "Controls: "
                                                    + "<br><br>Move Left: <br>Keyboard Left-Arrow"
                                                    + "<br><br>Move Right: <br>Keyboard Right-Arrow"
                                                    + "<br><br>Move Up: <br>Keyboard Up-Arrow"
                                                    + "<br><br>Move Down: <br>Keyboard Down-Arrow"
                                                    + "<br><br>Shoot: <br>Spacebar";

	JFrame frame = new JFrame("Space Invaders");
	JFrame frame2 = new JFrame("Space Invaders - Menu");
	JFrame frame3 = new JFrame("Help");

	/*
	 * Constructor
	 */
	public TheInvaders() {
		String topmessage = "<html><br><br>" + TOP_MESSAGE + "</html>";
		String message = "<html>" + INITIAL_MESSAGE + "</html>";
                
                        
		start = new JButton("Start Mission");
		start.addActionListener(new ButtonListener());
		start.setBounds(800, 800, 200, 100);

		help = new JButton("Help");
		help.addActionListener(new HelpButton());
                
		JLabel label = new JLabel(message, SwingConstants.CENTER);
		JLabel toplabel = new JLabel(topmessage, SwingConstants.CENTER);
                
		Font font = new Font("Helvetica", Font.BOLD, 12);
		label.setFont(font);

		Font font2 = new Font("Helvetica", Font.BOLD, 20);
		toplabel.setFont(font2);
                

		frame2.setTitle("Space Invaders - Menu");

		frame2.add(label);

		frame2.add(toplabel, BorderLayout.PAGE_START);
                
		
           
                
                JPanel main = new JPanel();
		main.add(help);
		main.add(start);
                

		frame2.add(main, BorderLayout.PAGE_END);
		frame2.setSize(500, 500);
		frame2.setLocationRelativeTo(null);
		frame2.setVisible(true);
		frame2.setResizable(false);

	}

	public void closeIntro() {
		frame2.dispose();
		frame3.dispose();
	}

	public void closeHelp() {
		frame3.dispose();
	}

	/*
	 * Main
	 */
	public static void main(String[] args) {
                try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, 
                    "The Invaders was unable to set the Cross Platform Look And Feel.\n" 
                    + "The Invaders may appear differently than it was intended", 
                    "Game Appearance Warning", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
		new TheInvaders();
	}


	private class ButtonListener implements ActionListener {

                @Override
		public void actionPerformed(ActionEvent event) {

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(BOARD_WIDTH, BOARD_HEIGHT);
			frame.getContentPane().add(new Board());
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			closeIntro();

		}
	}

	private class CloseHelp implements ActionListener {
                @Override
		public void actionPerformed(ActionEvent event) {
			closeHelp();
		}
	}

	private class HelpButton implements ActionListener {
                @Override
		public void actionPerformed(ActionEvent event) {
			JButton close = new JButton("Close");
			close.addActionListener(new CloseHelp());

			String topmessage = "<html><br>" + HELP_TOP_MESSAGE + "</html>";
			String message = "<html>" + HELP_MESSAGE + "</html> ";
			JLabel label = new JLabel(message, SwingConstants.CENTER);
			JLabel toplabel = new JLabel(topmessage, SwingConstants.CENTER);

			Font font = new Font("Helvetica", Font.BOLD, 12);
			label.setFont(font);

			Font font2 = new Font("Helvetica", Font.BOLD, 20);
			toplabel.setFont(font2);

			frame3.add(label);

			frame3.add(toplabel, BorderLayout.PAGE_START);

			frame3.add(close, BorderLayout.PAGE_END);
			frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame3.setSize(500, 500);
			frame3.setResizable(false);
			frame3.setLocationRelativeTo(null);
			frame3.setVisible(true);
		}
	}
}