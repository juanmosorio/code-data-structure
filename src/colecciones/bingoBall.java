/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Juan
 */
public class bingoBall {

    private char letter;
    private int number;

    public bingoBall(int num) {
        number = num;
        if (num <= 15) {
            letter = 'B';
        } else if (num <= 30) {
            letter = 'I';
        } else if (num <= 45) {
            letter = 'N';
        } else if (num <= 60) {
            letter = 'G';
        } else {
            letter = 'O';
        }
    }
    
    public String toString() {
         return letter + " " + number;
    }
}
