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
public class arrayStack<T> implements StackADT<T> {

    private T top;//almacena el ultimo numero
    private int count;//almacena el numero de los elemento
    private final int DEFAULT_CAPACITY = 100;//capasidad por defecto.
    private T[] contents;//contenido en la pila.

    public arrayStack() {
        count = 0;
        contents = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public arrayStack(int initialCapacity) {
        count = 0;//incializa count en 0
        contents = (T[]) (new Object[initialCapacity]);
    }

    @Override
    public void push(T element) {//obtiene el elemento.
        if (size() == contents.length) {//si ya lo tiene agregado.
            //size devuelve cuantos elemetos ya tiene agregados
            //si ya se lleno
            expandCapacity();//va a expandir ña cantidad del arreglo
        }
        contents[count] = element;//total de elementos.
        count++;//suma 1 al arreglo.
    }

    @Override
    public T pop() {//elimina el que esta en la sima extrae de la sima.
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        count--;//disminuye
        T result = contents[count];//obtiene el siguiente elemento.
        contents[count] = null;//hace nulo el elemento.
        return result;
    }

    @Override
    public T peek() {//muestra cual esta en la sima.
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top = contents[count - 1];
        return top;
    }

    @Override
    public boolean isEmpty() {//retorna verdadero o falso.
        return (count == 0);
    }

    @Override
    public int size() {//retorna el tamaño.
        return count;
    }

    private void expandCapacity() {//expande la capacidad.
        T[] large = (T[]) (new Object[contents.length * 2]);//crea un nuevo arreglo y lo incializa con el doble de capacidad que el anterior.
        for (int i = 0; i < contents.length; i++) {
            large[i] = contents[i];//almacena.
        }
        contents = large;//lo remplaza y expande la capacidad.
    }
}
