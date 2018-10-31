/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Juan1
 */
public class linearNode<T> {    

    private linearNode<T> next;//enlace cuan cual esta vinculado
    private T element;//elemento

    public linearNode() {
        next = null;//inicializa el valor de next em nulo
        element = null;//inicializa el valor de element en nulo
    }

    public linearNode(T elem) {
        next = null;//inicializa el valor de next em nulo
        element = elem;//inicializa el valor de element con el parametro elem
    }

    public linearNode<T> getNex() {//que elemento tiene 
        return next;//retorna el sguiente elemento
    }

    public void setNext(linearNode<T> node) {//permite dar un nuevo elemento
        next = node;//devuelve el node
    }

    public T getElement() {//obtiene el elemento
        return element;//y retorna el elemento
    }

    public void setElement(T elem) {//obtine el elemtoto
        element = elem;//el elemrnto es igual a elem
    }
}
