/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package theinvaders;

import java.awt.Toolkit;
import java.lang.String;

/**
 *
 * @author ASUS
 */
public interface Commons {
    int BOARD_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
;
    int BOARD_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
;
//    int BORDER_RIGHT = 30;
    String borderRight = "30";
    int BORDER_RIGHT = Integer.parseInt(borderRight);
    
    String borderLeft = "5";
    int BORDER_LEFT = Integer.parseInt(borderLeft);
    
    int GROUND = BOARD_HEIGHT - 100;
    
    String bombHeight = "40";
    int BOMB_HEIGHT = Integer.parseInt(bombHeight);
    
    String alienHeight = "100";
    int ALIEN_HEIGHT = Integer.parseInt(alienHeight);
    
    String alienWidth = "100";
    int ALIEN_WIDTH = Integer.parseInt(alienWidth);
    
    String alienInitX = "150";
    int ALIEN_INIT_X = Integer.parseInt(alienInitX);
    
    String alienInitY = "20";
    int ALIEN_INIT_Y = Integer.parseInt(alienInitY);
    
    String goDown = "100";
    int GO_DOWN = Integer.parseInt(goDown);
    
    String numberOfAlien = "24";
    int NUMBER_OF_ALIENS_TO_DESTROY = Integer.parseInt(numberOfAlien);
    
    String chance = "5";
    int CHANCE = Integer.parseInt(chance);
    
    String delay = "17";
    int DELAY = Integer.parseInt(delay);
    
    String playerWidth = "60";
    int PLAYER_WIDTH = Integer.parseInt(playerWidth);
    
    String playerHeight = "60";
    int PLAYER_HEIGHT = Integer.parseInt(playerHeight);
//    int BORDER_LEFT = 5;
//
//    int GROUND = BOARD_HEIGHT - 100;
//    int BOMB_HEIGHT = 40;
//
//    int ALIEN_HEIGHT = 100;
//    int ALIEN_WIDTH = 100;
//    int ALIEN_INIT_X = 150;
//    int ALIEN_INIT_Y = 20;
//
//    int GO_DOWN = 100;
//    int NUMBER_OF_ALIENS_TO_DESTROY = 32;
//    int CHANCE = 5;
//    int DELAY = 17;
//    int PLAYER_WIDTH = 60;
//    int PLAYER_HEIGHT = 60; 
}
