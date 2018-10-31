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
public class BinaryTreeNode<T> {

    public T element;
    public BinaryTreeNode left, rigth;

    public BinaryTreeNode(T obj) {
        element = obj;
        left = null;
        rigth = null;
    }

    //regresa el numero de hijos no nulos 
    public int numChildren() {
        int children = 0;
        if (left != null) {
            children = 1 + left.numChildren();
        }
        if (rigth != null) {
            children = children + 1 + rigth.numChildren();
        }
        return children;
    }
}
