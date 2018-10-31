/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Juan
 */
public class ArrayIterator<T> implements Iterator<T> {

    private int count;//cantida de elementos que hay
    private int current;//
    private T[] items;

    public ArrayIterator(T[] collection, int size) {
        items = collection;
        count = size;
        current = 0;
    }

    public boolean hasNext() {//devuelve un booleano, hay elementos para recorrer?
        return (current < count);//si current es menor a count
    }

    public T next() {
        if (!hasNext()) {//si no hay elementos.
            throw new NoSuchElementException();//genera error.
        }
        current++;//genera elementos.
        return items[current - 1];//los recorre.
    }

}
