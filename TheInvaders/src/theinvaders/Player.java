/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Player extends Sprite implements Commons{
    private int width, height;

    public Player() {

        initPlayer();
    }

    private void initPlayer() {

        var playerImg = "src/images/bow.png";
        var ii = new ImageIcon(playerImg);

        width = ii.getImage().getWidth(null);
        height = ii.getImage().getHeight(null);
        setImage(ii.getImage());

        int START_X = Commons.BOARD_HEIGHT/2;
        setX(START_X);

        int START_Y = Commons.GROUND;
        setY(START_Y);
    }

    public void act() {

        x += dx;
        y += dy;

        if (x <= 0) {

            x = 0;
        }

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

            dx = -10;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 10;
        }
        
        if (key == KeyEvent.VK_UP) {
            dy = -10;
        }
        
        if (key == KeyEvent.VK_DOWN) {
            dy = 10;
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
