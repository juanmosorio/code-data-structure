/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Juan
 */
public class TowersOfHanoi {

    private int totalDisk;

    public TowersOfHanoi(int disk) {
        totalDisk = disk;
    }

    private void moveTower(int numDisk, int start, int end, int temp) {
        if (numDisk == 1) {
            moveOneDisk(start, end);
        } else {
            moveTower(numDisk - 1, start, temp, end);//se mueve de la torre (start) a (temp) pasando por (end).
            moveOneDisk(start, end);//llama a el metodo ->().
            moveTower(numDisk - 1, temp, end, start);//se mueve de la tore  (temp) a (end) pasndo por (star).
        }
    }

    public void solve() {
        moveTower(totalDisk, 1, 3, 2);
    }

    private void moveOneDisk(int start, int end) {
        System.out.println("Move one disk from " + start + " end " + end);//imprime el movimiento.
    }
}
