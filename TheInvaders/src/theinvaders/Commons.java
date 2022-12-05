/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package theinvaders;

import java.awt.Toolkit;

/**
 *
 * @author ASUS
 */
public interface Commons {
    int BOARD_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
;
    int BOARD_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
;
    int BORDER_RIGHT = 30;
    int BORDER_LEFT = 5;

    int GROUND = BOARD_HEIGHT - 100;
    int BOMB_HEIGHT = 40;

    int ALIEN_HEIGHT = 100;
    int ALIEN_WIDTH = 100;
    int ALIEN_INIT_X = 150;
    int ALIEN_INIT_Y = 20;

    int GO_DOWN = 15;
    int NUMBER_OF_ALIENS_TO_DESTROY = 24;
    int CHANCE = 5;
    int DELAY = 17;
    int PLAYER_WIDTH = 60;
    int PLAYER_HEIGHT = 60; 
}
