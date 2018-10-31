/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesBinarios;

import java.util.Iterator;

/**
 *
 * @author Juan1
 */
public interface BinaryTreeADT<T> {

    public void removeLeftSubtree();

    public void removeRigthElements();

    public void removeAllElements();

    public boolean isEmpty();

    public int size();

    public boolean contains(T targetElement);

    public T find(T targetElement);

    public String toString();

    public Iterator<T> iteratorInOrder();

    public Iterator<T> iteratorPreOrder();

    public Iterator<T> iteratorPostOrder();

    public Iterator<T> iteratorLevelOrder();

}
