/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Juan1
 */
public class BusquedaOrdenamiento<T> {

    public boolean found = false;

    public boolean linearSeach(T[] data, int min, int max, T target) {//lo que va a resivir 
// min and max hasta donde va acomparar
        int index = min;//iniciar donde 
        found = false;
        while (!found && index <= max) {//donde iniciara//se ejecuta mientras de true
            if (data[index].equals(target)) {//equals -> compareto, se encargar dever se si son iguales
                found = true;
            }
            index++;
        }
        return found;
    }

    public boolean binarySearch(int[] data, int min, int max, int target) {
        boolean found = false;//punto central
        int midpoint = (min + max) / 2;
        if (data[midpoint] == target) {
            found = true;
        } else if (data[midpoint] > target) {
            if (min <= midpoint - 1) {
                found = binarySearch(data, min, midpoint - 1, target);
            }
        } else {
            found = binarySearch(data, midpoint + 1, max, target);
        }
        System.out.println(target);
        return found;
    }
}
