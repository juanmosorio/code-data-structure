/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesBinarios;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 *
 * @author Juan1
 */
public class LinkedBinaryTree<T> implements BinaryTreeADT<T> {

    protected int count;

    protected BinaryTreeNode<T> root;

    public LinkedBinaryTree() {
        count = 0;
        root = null;
    }

    public LinkedBinaryTree(T element) {
        count = 1;
        root = new BinaryTreeNode<T>(element);
    }

    public LinkedBinaryTree(T element, LinkedBinaryTree<T> leftSubtree, LinkedBinaryTree<T> rightSubtree) {
        root = new BinaryTreeNode<T>(element);
        count = 1;
        if (leftSubtree != null) {
            count = count + leftSubtree.size();
            root.left = leftSubtree.root;
        } else {
            root.left = null;
        }
        if (rightSubtree != null) {
            count = count + rightSubtree.size();
            root.rigth = rightSubtree.root;
        } else {
            root.rigth = null;
        }
    }

    //remueve el subarbol izquierdo de la raiz
    public void removeLeftSubtree() {
        if (root.left != null) {
            count = count - root.left.numChildren() - 1;
            root.left = null;
        }
    }

    //remueve el subarbol derecho de la raiz
    public void removeRigthElements() {
        if (root.rigth != null) {
            count = count - root.rigth.numChildren() - 1;
            root.rigth = null;
        }
    }

    //remueve todos los elementos
    public void removeAllElements() {
        removeLeftSubtree();
        removeRigthElements();
    }

    //regresa true si el arbol esta vacio
    public boolean isEmpty() {
        return (count == 0);
    }

    //regresa el numero de elementos espesificados
    public int size() {
        return count;
    }

    //Devuelve verdadero si el árbol contiene un elemento 
    //y falso de lo contrario.
    public boolean contains(T targetElement) {
        if (findagain(targetElement, root) != null) {
            return true;
        }
        return false;
    }

    public T find(T targetElement) throws EmptyStackException {
        BinaryTreeNode<T> current = findagain(targetElement, root);
        if (current == null) {
            throw new EmptyStackException();
        }
        return current.element;
    }

    protected BinaryTreeNode<T> findagain(T targetElement, BinaryTreeNode<T> next) {
        if (next == null) {
            return null;
        }
        if (next.element.equals(targetElement)) {
            return next;
        }
        BinaryTreeNode<T> temp = findagain(targetElement, next.left);
        if (temp == null) {
            temp = findagain(targetElement, next.rigth);
        }
        return temp;
    }

    // Realiza un recorrido de inorder en el árbol binario llamando a un
    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayList<T> templist = new ArrayList<T>();
        inorder(root, templist);
        return templist.iterator();
    }

    protected void inorder(BinaryTreeNode<T> node, ArrayList<T> templist) {
        if (node != null) {
            inorder(node.left, templist);//recorre al hijo izquierso
            templist.add(node.element);//visita a el nodo
            inorder(node.rigth, templist);//recorre al hijo derecho
        }
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayList<T> templist = new ArrayList<T>();
        preorder(root, templist);
        return templist.iterator();
    }

    protected void preorder(BinaryTreeNode<T> node, ArrayList<T> templist) {
        if (node != null) {
            templist.add(node.element);//visita al codigo
            preorder(node.left, templist);//visita al hijo izquierdo
            preorder(node.rigth, templist);//recorre al hijo derecho
        }
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayList<T> templist = new ArrayList<T>();
        postorder(root, templist);
        return templist.iterator();
    }

    protected void postorder(BinaryTreeNode<T> node, ArrayList<T> templist) {
        if (node != null) {
            postorder(node.left, templist);
            postorder(node.rigth, templist);
            templist.add(node.element);
        }
    }

    @Override
    public Iterator<T> iteratorLevelOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
