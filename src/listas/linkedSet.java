/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import colecciones.SetADT;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Juan1
 */
public class linkedSet<T> implements SetADT<T> {

    private static Random rand = new Random();//variable para crear un numero aleatorio.
    private int count;//varible que cuenta los elementos que tengamos.
    private linearNode<T> contents;//contiene todos los elementos desde de la clase linearNode.

    public linkedSet() {//contructor
        count = 0;//inicializa el contedor en 0.
        contents = null;//el contenido aqui es nulo.
    }

    @Override
    public void add(T element) {//metodo para añadir.
        if (!contains(element)) {//verifica si contiene los elementos por medio del metodo de contains.
            linearNode<T> node = new linearNode<T>(element);//crea un node.
            node.setNext(contents);//le da el valor de contents.
            contents = node;//se guarda el contenido es node.
            count++;//se suma el contenido cada ves que hay un elemento.
        }
    }

    @Override
    public void addAll(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeRandom() {
        linearNode<T> previos, current;//crea dos variables de clase linearNode.
        T result = null;//crea una varible de tipo result y lo inicializa en null.
        if (isEmpty()) {//si esta vacio.
            throw new EmptyStackException();//genera un error.
        }
        int choise = rand.nextInt(count) + 1;//crea una varible en la cual genear un nuemro aleatorio apartir de count.
        if (choise == 1) {//si es igua a 1
            result = contents.getElement();//el resultado retorna el elemento.
            contents = contents.getNex();//contents obtiene el siguiente elemento.
        } else {
            previos = contents;//prev es el contenido 
            for (int skip = 2; skip < choise; skip++) {//skip desde 2 hasta que sea menor que el aleatorio
                previos = previos.getNex();//prev pasa al ultimo elemento.
            }
            current = previos.getNex();//tomara el ultimo elemento
            result = current.getElement();//retorna el elemento
            previos.setNext(current.getNex());
        }
        count--;//count se disminuye cada ves que se elimine el elemnto.
        return result;
    }

    @Override
    public T remove(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SetADT<T> union(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T element) {
        int NO_FOUND = -1;
        int search = NO_FOUND;
        linearNode list = contents;//contenido
        for (int i = 0; i < count && search == NO_FOUND; i++) {//se aumenta segun el contenido.
            //if (contents.getElement() == element)
            if (list.getElement() == element) {//si la lista obtiene un elemento y es igual a elemento.
                return (search == NO_FOUND);//retorna verdadero.
            } else {
                //contents = contents.getNex();//contents obtiene el siguiente elemento.(no funciona)
                list = list.getNex();//la lista obtien el siguente elemento.
            }
        }
        return (search != NO_FOUND);//retorna falso.
    }

    @Override
    public boolean equals(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<T> interator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tosString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int[] lista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
