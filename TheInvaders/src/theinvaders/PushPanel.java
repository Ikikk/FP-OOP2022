/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author ASUS
 */
public class PushPanel extends JPanel {
    private static final long serialVersionUID = 8387668405974705371L;

    private JButton push;
    private Timer timer;
    private long lastTime;

    /*
     * Constructor
     */
    public PushPanel() {
        push = new JButton("start");
        push.addActionListener(new ButtonListener());
        push.setBounds(800, 800, 200, 100);

        add(push);

    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new TheInvaders();

        }
    }
    
    public boolean isRunning() {
		return timer.isRunning();
	}
    
    public void pause() {
		timer.stop();
	}
    
    public void play() {
		timer.start();
		lastTime = System.currentTimeMillis();  // Don't include time when paused in delta calculations
	}
}
