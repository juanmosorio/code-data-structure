/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Juan1
 */
public class Burbuja {

    
//    public int lista[] = {23, 4, 6, 6, 3, 3, 15, 6, 37, 0};
    public int arreglo[]= {23, 4, 6, 6, 3, 3, 15, 6, 37};
    public void burbuja() {
        for (int i = 0; i < arreglo.length - 1; i++) {//arreglo
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {//si el arreglo en la posicion j es mayor a j+1
                    int tmp = arreglo[j + 1];//tmp toma el valor de [j+1]
                    arreglo[j + 1] = arreglo[j];//arglo[j+1] toma el valor de [j] que es el mayor
                    arreglo[j] = tmp; 
                }
            }
        }
////        System.out.print("Ordenamiento Burbuja: ");
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.print(arreglo[i]+"\n");
//        }
//        System.out.println("\n");
    }
}
