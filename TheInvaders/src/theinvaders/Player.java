/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Player extends Sprite implements Commons{

//	private final int START_Y = 400;
//	private final int START_X = 270;

	private final String player = "/img/bow.png";
	private int width, height;

	/*
	 * Constructor
	 */
	public Player() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(player));

		width = ii.getImage().getWidth(null);
                height = ii.getImage().getHeight(null);

		setImage(ii.getImage());
		int START_X = Commons.BOARD_WIDTH/2;
                setX(START_X);

                int START_Y = Commons.GROUND;
                setY(START_Y);
	}

	public void act() {
		x += dx;
                y += dy;
                
		if (x <= 0)
			x = 0;
                
//		if (x >= BOARD_WIDTH - 2 * width)
//			x = BOARD_WIDTH - 2 * width;

                if (y <= Commons.BOARD_HEIGHT/2 - 200) {
            
                    y = Commons.BOARD_HEIGHT/2 - 200;
                }

                if (x >= Commons.BOARD_WIDTH -  width - 5) {

                    x = Commons.BOARD_WIDTH - width - 5;
                }

                if (y >= Commons.BOARD_HEIGHT - 2 * height - 20) {
                    y = Commons.BOARD_HEIGHT - 2 * height - 20;
                }
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = -5;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 5;
		}
                
                if (key == KeyEvent.VK_UP) {
                    dy = -5;
                }

                if (key == KeyEvent.VK_DOWN) {
                    dy = 5;
                }

	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
                
                if (key == KeyEvent.VK_UP) {
                    dy = 0;
                }

                if (key == KeyEvent.VK_DOWN) {
                    dy = 0;
                }
	}
}