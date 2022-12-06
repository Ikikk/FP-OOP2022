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
public class Shot extends Sprite {
    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        var shotImg = "src/images/arrow 2.png";
        var ii = new ImageIcon(shotImg);
        setImage(ii.getImage());
        
        width = ii.getImage().getWidth(null);
        setImage(ii.getImage());
        int H_SPACE = 25;
        setX(x + H_SPACE);

        int V_SPACE = 20;
        setY(y + V_SPACE);
    }
}
