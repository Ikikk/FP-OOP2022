


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import theinvaders.Commons;
import theinvaders.Sprite;
/**
 *
 * @author ASUS
 */
public final class GameOver extends Sprite implements Commons{

	private final String gameOver = "/img/gameover.png";
	private int width, height;

	/*
	 * Constructor
	 */
	public GameOver() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(gameOver));

		width = ii.getImage().getWidth(null); 
                height = ii.getImage().getHeight(null);

		setImage(ii.getImage());
		setX(width/2);
		setY(height/2);
                
	}

	/*
	 * Getters & Setters
	 */

        @Override
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
        
        @Override
        public int getHeight() {
		return height;
	}

        @Override
	public void setHeight(int height) {
		this.height = height;
	}
    }
