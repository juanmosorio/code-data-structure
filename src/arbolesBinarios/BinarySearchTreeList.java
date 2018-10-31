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
public class BinarySearchTreeList<T> extends LinkedBinarySearchTree<T> implements ListADT<T> {

    public BinarySearchTreeList() {
        super();
    }

    public BinarySearchTreeList(T element) {
        super(element);
    }

    public Iterator iterator() {
        return iteratorInOrder();
    }

    @Override
    public T removeFirst() {
        return removeMin();
    }

    @Override
    public T removeLast() {
        return removeMax();
    }

    @Override
    public T remove(T element) {
         return removeElement(element);
    }

    @Override
    public T first() {
        return findMin();
    }

    @Override
    public T last() {
        return findMax();
    }

    @Override
    public void add(T element) {
        addElement(element);
    }

}
