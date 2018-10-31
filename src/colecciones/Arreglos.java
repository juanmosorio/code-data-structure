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
public class Arreglos {

    public void arreglo() {
        int[][] a = new int[10][10];
        //.length-> debuelve el tamaño de la dimencion
        int cont = 100;
        for (int i = 0; i < a.length; i++) {//recorre las columnas
            for (int j = 0; j < a[i].length; j++) {//recorre las filas
                a[i][j] = cont;//el contador acumula culumnas y filas en su posicion
                cont--;//disminuye el arreglo
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]" + a[i][j]);//imprime las posiciones 
            }
        }
    }

}
