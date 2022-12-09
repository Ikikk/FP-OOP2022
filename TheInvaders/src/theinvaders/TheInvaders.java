/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package theinvaders;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */

public class TheInvaders extends JFrame implements Commons {

    public TheInvaders() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("The Invaders");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new MainMenu();
            ex.setVisible(true);
        });
    }
}