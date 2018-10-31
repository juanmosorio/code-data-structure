/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesBinarios;

import java.util.EmptyStackException;

/**
 *
 * @author Juan1
 */
public class LinkedBinarySearchTree<T> extends LinkedBinaryTree<T> implements BinarySearchTreeADT<T> {

    public LinkedBinarySearchTree() {
        super();
    }

    public LinkedBinarySearchTree(T element) {
        super(element);
    }

    public void addElement(T element) {
        BinaryTreeNode<T> temp = new BinaryTreeNode<T>(element);
        Comparable<T> comparableElement = (Comparable<T>) element;
        if (isEmpty()) {
            root = temp;
        } else {
            BinaryTreeNode<T> current = root;
            boolean added = false;
            while (!added) {
                if (comparableElement.compareTo(current.element) < 0) {
                    if (current.left == null) {
                        current.left = temp;
                        added = true;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.rigth == null) {
                        current.rigth = temp;
                        added = true;
                    } else {
                        current = current.rigth;
                    }
                }
            }
        }
        count++;
    }

    @Override
    public T removeElement(T targetElement) throws EmptyStackException {
        T resul = null;
        if (!isEmpty()) {
            if (((Comparable) targetElement).equals(root.element)) {
                resul = root.element;
                root = replacement(root);
                count--;
            } else {
                BinaryTreeNode<T> current, parent = root;
                boolean found = false;
                if (((Comparable) targetElement).compareTo(root.element) < 0) {
                    current = root.left;
                } else {
                    current = root.rigth;
                }
                while (current != null && !found) {
                    if (targetElement.equals(current.element)) {//compara si lo encurntra
                        found = true;//
                        count--;//resta menos uno
                        resul = current.element;//obtitne el elemento para eliminarlo
                        if (current == parent.left) {//------
                            parent.left = replacement(current);//
                        } else {
                            parent.rigth = replacement(current);
                        }
                    } else {
                        parent = current;
                        if (((Comparable) targetElement).compareTo(current.element) < 0) {
                            current = current.left;
                        } else {
                            current = current.rigth;
                        }
                    }
                }
                if (!found) {
                    throw new EmptyStackException();
                }
            }
        }
        return resul;
    }

    protected BinaryTreeNode<T> replacement(BinaryTreeNode<T> node) {
        BinaryTreeNode<T> result = null;
        if ((node.left == null) && (node.rigth == null)) {
            result = null;
        } else if ((node.left != null) && (node.rigth == null)) {
            result = node.left;
        } else if ((node.left == null) && (node.rigth != null)) {
            result = node.rigth;
        } else {
            BinaryTreeNode<T> current = node.rigth;
            BinaryTreeNode<T> parent = node;
            while (current.left != null) {
                parent = current;
                current = current.left;
            }
            if (node.rigth == current) {
                current.left = node.left;
            } else {
                parent.left = current.rigth;
                current.rigth = node.rigth;
                current.left = node.left;
            }
            result = current;
        }
        return result;
    }

    @Override
    public void removeAllOCurrences(T targetElement) {
        while (contains(targetElement)) {
            removeElement(targetElement);
        }
    }

    @Override
    public T removeMin() throws EmptyStackException {
        BinaryTreeNode<T> result;
        if (root.left == null) {
            result = root;
            root = root.rigth;
        } else {
            BinaryTreeNode<T> parent = root;
            BinaryTreeNode<T> current = root.left;
            while (current.left != null) {
                parent = current;
                current = current.left;
            }
            if (current.rigth == null) {
                result = current;
                parent.left = null;
            } else {
                result = current;
                parent.left = current.rigth;
            }
        }
        count--;
        return result.element;
    }

    @Override
    public T removeMax() throws EmptyStackException {
        BinaryTreeNode<T> result;
        if (root.rigth == null) {
            result = root;
            root = root.left;//
        } else {
            BinaryTreeNode<T> parent = root;
            BinaryTreeNode<T> current = root.rigth;
            while (current.rigth != null) {
                parent = current;
                current = current.rigth;
            }
            if (current.left == null) {//
                result = current;
                parent.rigth = null;
            } else {
                result = current;
                parent.rigth = current.left;//
            }
        }
        count--;
        return result.element;
    }

    @Override
    public T findMin() {
        BinaryTreeNode<T> result;
        if (root.left == null) {
            result = root;
        } else {
            BinaryTreeNode<T> parent = root;
            BinaryTreeNode<T> current = root.left;
            while (current.left != null) {
                current = current.left;
            }
            result = current;
        }
        return result.element;
    }

    @Override
    public T findMax() {
        BinaryTreeNode<T> result;
        if (root.rigth == null) {
            result = root;
        } else {
            BinaryTreeNode<T> parent = root;
            BinaryTreeNode<T> current = root.rigth;
            while (current.rigth != null) {
                current = current.rigth;
            }
            result = current;
        }
        return result.element;
    }
}
