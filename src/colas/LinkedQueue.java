/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import listas.linearNode;

/**
 *
 * @author Juan1
 */
public class LinkedQueue<T> implements QueueADT<T> {

    private int count;//almacena la cantidad de elementos que hay en la cola
    private linearNode<T> rear;//rear es el contenido
    private linearNode<T> start;//almacena el primer elememto en la cola

    public LinkedQueue() {//contructor
        this.count = 0;//inicia la cuenta en 0
        this.rear = null;//inicia el contenido en nulo
        this.start = null;//inicia el primer elementon en nulo
    }

    @Override
    public void enqueue(T element) {//añade un elemto al final de la cola
        linearNode<T> temp = new linearNode<T>(element);//crea un nodo temporal
        if (isEmpty()) {//si esta vacio
            start = temp;//el inicio de la cola sera el nodo apunta al siguiente elemento
        } else {
            rear.setNext(temp);//rear apunta al suiguiente eleemnto
        }
        rear = temp;//rear es igual al nodo aobtiene el elemento
        count++;//se incremeta
    }

    @Override
    public T dequeue() {//elimina un elemento del principio de la cola
        T result = start.getElement();//el inicio obtiene el elemento
        start = start.getNex();//obtiene el siguiente elemento
        count--;//la cantidad se disminuye
        if (isEmpty()) {
            rear = null;
        }
        return result;//Retorna al siguiente elemeto
    }

    @Override
    public T first() {//exanina el elemento situado al incio de la cola
        return start.getElement();//regresa el elmento del inicio
    }

    @Override
    public boolean isEmpty() {//determina si la cola esta vacia
        return (count == 0);//retorana verdarero o falso (falso)
    }

    @Override
    public int size() {//determina el numero de elementos que hay en la cola 
        return count;//regresa la cantidad
    }

    @Override
    public String toString() {//devuele una representacion en cadena de la cola 
        linearNode<T> current = start;//crea 
        String cola = "";//variable string para tipo cadena 
        for (int i = 0; i < count; i++) {//recorre i hasta que se el total del contenido
            cola += "[" + current.getElement() + "]";//almacena en un acumulador el elemento que esta situado al inicio
            current = current.getNex();
        }
        return cola;//regresa el valor del incio de la cola en String
    }
}
