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
  private final String won = "/img/won.jpg";
    private int width, height;

    /*
     * Constructor
     */
    public Won() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource(won));

        width = ii.getImage().getWidth(null); 
        height = ii.getImage().getHeight(null);

        setImage(ii.getImage());
        setX(width);
        setY(height);
    }

    /*
     * Getters & Setters
     */
  @Override
	public int getWidth() {
		return width;
	}

  @Override
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
