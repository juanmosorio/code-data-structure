/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coin;

/**
 *
 * @author Juan
 */
import java.util.Random;

public class Coin {

    private final int HEADS = 0;
    private final int TALLS = 1;
    private int face;

    public Coin() {
        flip();
    }

    public void flip() {
        face = (int) (Math.random() * 2);
    }

    public boolean isHeads() {
        return (face == HEADS);
    }

    public void updateFace(int cara) {
        face=cara;
    }

    public void updateFace(String cara) {
        if (cara=="Heads") {
            face = HEADS;
        }else{
            face = TALLS;
        }
    }

    public String toString() {
        String faceName;
        if (face == HEADS) {
            return faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        return faceName;
    }
}
