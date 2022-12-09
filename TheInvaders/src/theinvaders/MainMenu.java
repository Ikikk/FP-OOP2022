/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class MainMenu extends JFrame{
    
    private final JTextField Name;
//    private final Dimension d;
    
    public MainMenu() {
        super("The Invaders");
//        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setTitle("Cyber Defender Gavan");
//        setExtendedState(Frame.MAXIMIZED_BOTH);
//        setAlwaysOnTop(true);
//        setVisible(true);
//        setResizable(false);
//        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Dimension d = new Dimension(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        setBackground(Color.CYAN);
        
        
        JPanel stretchPanel = new JPanel();
	stretchPanel.setLayout(new BorderLayout());
        
        JPanel buttonsPanel = new JPanel();
	GridLayout buttonsLayout = new GridLayout(0,1);
	buttonsLayout.setVgap(5);
	buttonsPanel.setLayout(buttonsLayout);
	buttonsPanel.setBackground(Color.BLACK);
	stretchPanel.add(buttonsPanel, BorderLayout.NORTH);

        Name = new JTextField("Your Name");
	Name.setBackground(Color.DARK_GRAY);
	Name.setForeground(Color.WHITE);
	Name.setBorder(null);
	Name.setHorizontalAlignment(JTextField.CENTER);
	buttonsPanel.add(Name);
        
        JLabel play = new JLabel("Play Game!");
	play.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
	play.setHorizontalAlignment(JLabel.CENTER);
	play.setForeground(Color.WHITE);
	buttonsPanel.add(play);
        
        JButton game = new JButton("Play Game!");
	game.addActionListener(new PlayGameListener());
	game.setBackground(Color.GREEN);
	buttonsPanel.add(game);
        
        JPanel basePadding = new JPanel();
	basePadding.setBackground(Color.BLACK);
	basePadding.setPreferredSize(new Dimension(Commons.BORDER_LEFT, Commons.BORDER_RIGHT));
	stretchPanel.add(basePadding, BorderLayout.CENTER);
        
        add(stretchPanel, BorderLayout.CENTER);
        
        JButton quit = new JButton("Quit Game");
	quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quit the program
                System.exit(0);
            }
	});
        
        quit.setBackground(Color.LIGHT_GRAY);
	add(quit, BorderLayout.SOUTH);
		
	pack();
	setLocationRelativeTo(null); // Center in screen
    }
    
    
    
    private class PlayGameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
			// Hide this window
            setVisible(false);
        
        new InvadersFrame().setVisible(true);
			
			// Create the game's window and display it
}
    }}
