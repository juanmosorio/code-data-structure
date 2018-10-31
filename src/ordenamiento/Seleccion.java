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
public class Seleccion {

    public void ordenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;//toma el valor minimo de i
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    //si el valor de arglo[j] es menor que el valor menor de areglo[min]
                    min = j;//el valor minimo sera j
                }
            }
            if (i != min) {//si i es diferente al minimo
                int aux = arreglo[i];//aux toma el valor de el arreglo[i}
                arreglo[i] = arreglo[min];//el areglo[i] es el valor minimo
                arreglo[min] = aux;
            }
        }
        System.out.print("\nOrdenamiento por seleccion: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }
        
    }
}
