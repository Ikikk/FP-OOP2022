/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class InvadersFrame extends JFrame {
    
//    // The gamepanel
//	private PushPanel gamePanel;
//	
//	// The main menu
//	private MainMenu mainMenu;
//        private JLabel scoreDisplay;
    public InvadersFrame(){
        super("Let's Go!");
        JFrame frame = new JFrame("The Invaders");
        frame.add(new Board(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setTitle("Cyber Defender Gavan");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
//        this.mainMenu = mainMenu;
//        
//        JPanel headerPanel = new JPanel();
//		headerPanel.setLayout(new BorderLayout());
//		headerPanel.setBackground(Color.DARK_GRAY);
//                
//        final JButton playPauseBtn = new JButton("Pause");
//        playPauseBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (gamePanel.isRunning())
//                    gamePanel.pause();
//                else
//                    gamePanel.play();
//                
//                playPauseBtn.setText(gamePanel.isRunning()? "Pause" : "Play");
//            }
//        });
//        headerPanel.add(playPauseBtn, BorderLayout.WEST);
//        
//        JButton quitButton = new JButton("Stop");
//	quitButton.setBackground(Color.RED);
//	quitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//		// Temporarially pause the game while the prompt is being displayed
//		boolean wasRunning = gamePanel.isRunning();
//				
//		if (wasRunning)
//                    gamePanel.pause();
//				
//                    // The quit button was clicked - confirm
//                    int selection = JOptionPane.showConfirmDialog(null, "Are you sure?", "Stop COnfirmation", JOptionPane.YES_NO_OPTION);
//				
//                    if (selection == JOptionPane.YES_OPTION) {
//                    // Dispose of the frame and return to the main menu
//                    InvadersFrame.this.setVisible(false);
//                    InvadersFrame.this.dispose();
//                    } else if (wasRunning)
//                        gamePanel.play();
//            }
//	});
//	headerPanel.add(quitButton, BorderLayout.EAST);
//                
//                // Create the panel for scores
//	JPanel scorePanel = new JPanel();
//	scorePanel.setBackground(Color.DARK_GRAY);
//		
//		// Set the layout
//	GridLayout scorePanelLayout = new GridLayout(0,4);
//	scorePanelLayout.setHgap(10);
//	scorePanel.setLayout(scorePanelLayout);
//                
//                // The Player Score
//	JLabel scoreLabel = new JLabel("Score:");
//	scoreLabel.setForeground(Color.WHITE);
//	scoreLabel.setHorizontalAlignment(JLabel.RIGHT);
//	scorePanel.add(scoreLabel);
//		
//	scoreDisplay = new JLabel("0");
//	scoreDisplay.setForeground(Color.CYAN);
//	scoreDisplay.setHorizontalAlignment(JLabel.LEFT);
//	scorePanel.add(scoreDisplay);
//		
//	headerPanel.add(scorePanel, BorderLayout.CENTER);
//		
//	add(headerPanel, BorderLayout.NORTH);
//		
//		// The central game panel
//	gamePanel = new PushPanel();
//	add(gamePanel, BorderLayout.CENTER);
//		
//		// Pack the frame
//	pack();
//	setLocationRelativeTo(null); 
                
        
    }
//    @Override
//        public void dispose() {
//            super.dispose();
//		
//            gamePanel.pause(); // Make sure that the timer stops running
//		
//            mainMenu.setVisible(true);
//        }
}
