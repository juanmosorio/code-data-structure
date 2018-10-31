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
public class Rapido {

    public void quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];//el pivote indica la posicion de los numeros.
        int i = izquierda;//numeros que se posiciona en la izquierda
        int j = derecha;//numeros que se posicionan en la derecja
        int auxIntercambio;//indica el intercambio
        while (i < j) {//mientras numero i es menor que numero j
            while (vector[i] <= pivote && i < j) {
                //numero vector[i] se posiciona en la izquieeda.
                i++;//se incremata i hasta que sea menor o igual que el pivote
            }
            while (vector[j] > pivote) {//mientra vector[j] sea meyor al pivote
                //se posiciona a la derecha
                j--;//se disminuye hasta que sea mayor al piovote
            }
            if (i < j) {//si i es menor a j 
                auxIntercambio = vector[i];//la variable toma el valor de vector en i
                vector[i] = vector[j];//tomo el vaor de vector[j]
                vector[j] = auxIntercambio;//se hace el cambio
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {//el valor es menor a derecha-1
            quickSort(vector, izquierda, j - 1);//se vuelve a ordenar
        }
        if (j + 1 < derecha) {//si lo que hay en la derecha es menor la lista de la derecha
            quickSort(vector, j + 1, derecha);
        }
    }

}
