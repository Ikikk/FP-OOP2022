/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Shot extends Sprite {
    int H_SPACE = 25;
    int V_SPACE = 20;
//    private final int H_SPACE = 6;
//    private final int V_SPACE = 1;

    public Shot() {
    }
    
    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        var shotimg = "src/img/arrow 2.png";
        ImageIcon ii = new ImageIcon(shotimg);
        setImage(ii.getImage());
        
        width = ii.getImage().getWidth(null);
        setImage(ii.getImage());
        
//        setX(x + H_SPACE);
//        setY(y - V_SPACE);

        setX(x + H_SPACE);
        setY(y + V_SPACE);
    }
}
