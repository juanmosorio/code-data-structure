/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.EmptyStackException;

/**
 *
 * @author Juan1
 */
public class LinkedStack<T> implements StackADT<T> {

    private linearNode<T> top;
    private int count;

    public LinkedStack() {
        count = 0;//cero
        top = null;//nulo
    }

    @Override
    public void push(T element) {//obtiene el elemento.
        linearNode<T> temp = new linearNode<T>(element);//nodo temporal
        temp.setNext(top);//nulo
        top = temp;//apunta temp
        count++;//se incrementa en 1.
    }

    @Override
    public T pop() {//elimina el que esta en la sima extrae de la sima.
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T result = top.getElement();//obtiene el elmento
        top = top.getNex();//toma el siguiente
        count--;//disminuye
        return result;//retorna
    }

    @Override
    public T peek() {//muestra cual esta en la sima.
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {//retorna verdadero o falso.
        return (count == 0);
    }

    @Override
    public int size() {//retorna el tamaño.
        return count;
    }
}
