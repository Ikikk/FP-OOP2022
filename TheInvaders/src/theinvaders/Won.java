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
public class Won extends Sprite implements Commons {
    public Won() {

        ImageIcon ii = new ImageIcon("src/images/won.jpg");

        width = ii.getImage().getWidth(null);

        setImage(ii.getImage());
        setX(0);
        setY(0);
    }
}
