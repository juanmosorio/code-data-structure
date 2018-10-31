/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesBinarios;

/**
 *
 * @author Juan1
 */
public interface ListADT<T> {//OrderedListADT

    public T removeFirst();//elimina el primer elemento de la lista

    public T removeLast();//elimina el ultimo elemento de la lista

    public T remove(T element);//elimina un elemnto concreto de la lista

    public T first();//examina el emento situado al principio

    public T last();//examina el elemento situado al final

    public boolean contains(T element);//determina si la lista esta vacia

    public boolean isEmpty();//determina si la lista esta vacia

    public int size();//determina el numero de elementos de la listra 

    public void add(T element);//añase un elemento a la lista

}
