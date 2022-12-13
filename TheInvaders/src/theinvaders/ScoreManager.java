/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theinvaders;
/**
 *
 * @author ASUS
 * @param <T>
 * @param <U>
 */
public class ScoreManager<T,U> {
    T score;
    U nama;

    public ScoreManager (T score, U nama){
        this.score = score;
        this.nama = nama;
    }

    public T getScore(){
        return score;
    }

    public U getName(){
        return nama;
    }

}
