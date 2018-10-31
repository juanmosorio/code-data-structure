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
public interface BinarySearchTreeADT<T> extends BinaryTreeADT<T> {

    public void addElement(T element);//añade unn elemento al rabol

    public T removeElement(T targetElement);//remueve un elemento del arbol

    public void removeAllOCurrences(T targetElement);//elimina todas la apariciones de un elemento en el arbol

    public T removeMin();//elemina el elemento minimo del arbol

    public T removeMax();//elemina el elemento maximo del arbol

    public T findMin();//devulve una referencia al elemento minimo

    public T findMax();//devulve una referencia al elemento maximo
}
