/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import edb.*;

/**
 *
 * @author Juan
 */
public class Recursividad {

    public void factor(int num) {
        int acu = 1;
        for (int i = 0; i < num; i++) {
            acu = acu * (i + 1);
            System.out.println(acu);
        }
    }

    public int factorialre(int num) {
        int result;
        if (num == 1) {
            result = 1;
        } else {
            result = num * factorialre(num - 1);
        }
        return result;
    }

}
