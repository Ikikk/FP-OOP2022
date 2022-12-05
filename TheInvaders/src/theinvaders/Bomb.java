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
public class Bomb extends Sprite{
    private final String bomb = "src/images/poop.png";
    private boolean destroyed;

    /*
     * Constructor
     */
    public Bomb(int x, int y) {
        setDestroyed(true);
        this.x = x;
        this.y = y;
        ImageIcon ii = new ImageIcon(this.getClass().getResource(bomb));
        setImage(ii.getImage());
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {
        return destroyed;
    }
}
