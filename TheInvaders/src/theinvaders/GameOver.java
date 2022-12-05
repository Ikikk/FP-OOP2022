/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;

import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class GameOver extends Sprite implements Commons {
    private final String gameOver = "src/images/gameover.png";

    //constructor
    public GameOver() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource(gameOver));
        setWidth(ii.getImage().getWidth(null));

        setImage(ii.getImage());
        setX(0);
        setY(0);
    }
}
