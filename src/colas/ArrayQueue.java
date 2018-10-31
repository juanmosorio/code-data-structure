/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.EmptyStackException;

/**
 *
 * @author Juan1
 */
public class ArrayQueue<T> implements QueueADT<T> {

    private T[] queue;//es donde se almacenara la cola
    private int rear;//contenido

    public ArrayQueue() {//constructor  
        this.queue = (T[]) (new Object[5]);//tamaño que se le asigna por defecto
        this.rear = 0;//el contenido se inicia en 0
    }

    @Override
    public void enqueue(T element) {//añade un elemento a la cola 
        if (size() == queue.length) {//si esta lleno
            expandCapacity();//expande la capacidad
        }
        queue[rear] = element;//agrega el elemento
        rear++;//indica que una elemento a sido agregado
    }

    @Override
    public T dequeue() {//elemina un elemento del pricipio de la fila
        if (isEmpty()) {//si esta vacio 
            throw new EmptyStackException();//manda un error 
        }
        T result = queue[0];//regresa el primer elemento que se ubica en la posicion 0 del arreglo
        rear--;//disminuye el contenido 
        //desplaza los elementos
        for (int scan = 0; scan < rear; scan++) {//escanea hasta que sea el contenido total
            queue[scan] = queue[scan + 1];//recorre scan a una posicion 
        }
        queue[rear] = null;//el elemento se vueve nulo
        return result;//regresa el priemer elemento
    }

    @Override
    public T first() {//examina el elemento situado al principio
        return queue[0];//regresa el primer elemento
    }

    @Override
    public boolean isEmpty() {//determina si la cola esta vacia
        return (rear == 0);//regresa verdadero o falso (falso)
    }

    @Override
    public int size() {//determina el nuemro de elemtos que hay en la fila
        return rear;//regresa el numero de elementos
    }

    @Override
    public String toString() {//regresa una representacion en cadena de la cola
        String cola = "";//variable string para tipo cadena 
        for (int i = 0; i < rear; i++) {//recorre i hasta que se el total del contenido
            cola += "[" + queue[i] + "]";//almacena en un acumulador el elemento que esta situado al inicio
        }
        return cola;//regresa el re sultado del acumulador (el primer elemento)
    }

    private void expandCapacity() {//expande la capacidad.
        T[] large = (T[]) (new Object[queue.length * 2]);//crea un nuevo arreglo y lo incializa con el doble de capacidad que el anterior.
        for (int i = 0; i < queue.length; i++) {
            large[i] = queue[i];//almacena.
        }
        queue = large;//lo remplaza y expande la capacidad.
    }

}
