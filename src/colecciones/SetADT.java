/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Iterator;//interface interator

/**
 *
 * @author Juan
 */
public interface SetADT<T> {

    //T= tipo abstracto
    //añade un elemento
    public void add(T element);
    
    //añade al conjunto
    public void addAll(SetADT<T> set);

    //elimina y devuelve un elemento aleatorio
    public T removeRandom();

    //elimina y devueve el elemento especificado
    public T remove(T element);

    //devuelve la union de este conjunto y del parametro
    public SetADT<T> union(SetADT<T> set);

    //devuelve true si contiene el parametro
    public boolean contains(T element);

    //devuelve true si esta cinjunto y el parametro
    //contienen exactamente los mismos elementos
    public boolean equals(SetADT<T> set);

    public boolean isEmpty();

    public int size();

    //devuelve un interator 
    public Iterator<T> interator();

    public String tosString();
}
