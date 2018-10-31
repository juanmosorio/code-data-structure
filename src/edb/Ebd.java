/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edb;

//import arbolesBinarios.BinarySearchTreeList;
//import arbolesBinarios.BinaryTreeNode;
//import arbolesBinarios.JuegoMemoria;
//import arbolesBinarios.LinkedBinarySearchTree;
//import arbolesBinarios.LinkedBinaryTree;
//import colas.*;
//import colecciones.bingoBall;
//import java.util.Iterator;
//import listas.linkedSet;
//import ordenamiento.Burbuja;
//import ordenamiento.Rapido;
//import ordenamiento.Seleccion;
//import pilas.*;
import vista.Juego;
import vista.JuegoMemoria;
/**
 *
 * @author Juan
 */
public class Ebd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //odenamiento burbuja
        
//        Burbuja burbuja = new Burbuja();
//        burbuja.burbuja();
//        for (int i = 0; i < burbuja.arreglo.length; i++) {
//            System.out.print(burbuja.arreglo[i]+"\n");
//        }
//        burbuja.burbuja(lista);
//        //odenamiento rapido
//        Integer lista1[] = {23, 4, 6, 6, 3, 3, 15, 6, 37, 0};
//        Rapido rapido = new Rapido();
////        System.out.print("Ordenamiento Rapido:\n");
//        rapido.quickSort(lista1, 0, lista1.length - 1);
//        for (int n = 0; n < lista1.length; n++) {
//            System.out.print(lista1[n] + "\n");
//        }
//        //seleccion
//        int lista2[] = {23, 4, 6, 6, 3, 3, 15, 6, 37, 0};
//        Seleccion seleccion = new Seleccion();
//        seleccion.ordenar(lista2);

        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        Integer[] f = null;
//        BusquedaOrdenamiento<Integer> buscar = new BusquedaOrdenamiento<>();
//        System.out.println(buscar.linearSeach(lista1, 0, 4, 1));
//        System.out.println("Se encotro el valor: " + buscar.binarySearch(b, 4, 8, 17));
//        primer es arreglo
//        , posicion y hasta donde
//        ordenamientoSeleccion seleccion = new ordenamientoSeleccion();
//        seleccion.ordenar(lista);
//        seleccion.imprimirLista(lista);
//        ordenamientoBurbuja burbuja = new ordenamientoBurbuja();
//        burbuja.ordenacionInsercion(lista);
//        final int NUM_BALLS = 75, NUM_PULL = 10;
//        linkedSet<bingoBall> bingo = new linkedSet();
//        bingoBall ball;
//        for (int i = 1; i <= NUM_BALLS; i++) {
//            ball = new bingoBall(i);
//            bingo.add(ball);
//        }
//        System.out.println("Size " + bingo.size());
//        for (int i = 1; i <= NUM_PULL; i++) {
//            ball = bingo.removeRandom();
//            System.out.println(ball);
//        }
//        System.out.println(bingo.isEmpty());
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        System.out.println("LinkedStack");
//        LinkedStack<Integer> pila = new LinkedStack<>();
//        pila.push(4);
//        pila.push(8);
//        pila.push(2);
//        System.out.println("peek: " + pila.peek());//muestra el de la sima
//        System.out.println("pop: " + pila.pop());//muestra y quita el de la sima
//        System.out.println("pop: " + pila.pop());//muestra y quita el de la sima
//        System.out.println("peek: " + pila.peek());
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        System.out.println("\nArraySatck");
//        arrayStack<Integer> pila1 = new arrayStack<>(2);
//        pila1.push(4);
//        pila1.push(8);
//        pila1.push(2);
//        System.out.println("peek: " + pila1.peek());//muestra el de la sima
//        System.out.println("pop: " + pila1.pop());//muestra y quita el de la sima
//        System.out.println("pop: " + pila1.pop());//muestra y quita el de la sima
//        System.out.println("peek: " + pila1.peek());
//        System.out.println(pila1.size());
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        LinkedQueue<Integer> cola = new LinkedQueue<>();
//        cola.enqueue(5);
//        cola.enqueue(6);
//        cola.enqueue(8);
//        cola.enqueue(12);
//        System.out.println("cola 1 " + cola);
//        System.out.println("dequeue " + cola.dequeue());
//        System.out.println("dequeue " + cola.dequeue());
//        System.out.println("cola 2 " + cola);
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        final int PROCESS = 120;//el tiempo en que son atendidos
//        final int MAX_CASHIERS = 10;//cajeros
//        final int MAX_CUSTOMER = 100;//total de clientes
//
//        Customer customer;
//
//        LinkedQueue<Customer> customerQueue = new LinkedQueue<>();
//
//        int[] cashierTime = new int[MAX_CASHIERS];
//        int totalTime, averageTime, departs;
//        //procesa la simulacion para N cajeros
//
//        for (int cashiers = 0; cashiers < MAX_CASHIERS; cashiers++) {
//            //configuramos el tiempo inicial de cada cajero en 0
//            for (int count = 0; count < MAX_CASHIERS; count++) {
//                cashierTime[count] = 0;
//            }
        //cargar la cola de clientes
//            for (int count = 0; count < MAX_CUSTOMER; count++) {
//                customerQueue.enqueue(new Customer(count * 15));
//            }
//            totalTime = 0;
//            //procesa todos los clientes del la  cola 
//            while (!(customerQueue.isEmpty())) {
//                for (int count = 0; count <= cashiers; count++) {
//                    if (!(customerQueue.isEmpty())) {
//                        customer = customerQueue.dequeue();
//                        if (customer.getArrivalTime() > cashierTime[count]) {
//                            departs = customer.getArrivalTime() + PROCESS;
//                        } else {
//                            departs = cashierTime[count] + PROCESS;//agrega mas tiempo cuando ya no esta disponible
//                        }
//                        customer.setDepartureTime(departs);
//                        cashierTime[count] = departs;
//                        totalTime += customer.tolalTime();
//                    }
//                }
//            }
//            //mostramos resultados
//            averageTime = totalTime / MAX_CUSTOMER;
//            System.out.println("Number os cashiers: " + (cashiers + 1));
//            System.out.println("Average time: " + averageTime + "\n");
//        }
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        int[] key = {7, 12, -3, 8, -9, 4, 10};
//        String message = "Este mensaje se va a encriptar";
//        encryptMessage e = new encryptMessage(key, message);
//        e.encrypt();
//        e.decrypt();
//        System.out.println(e.toString());
        //colas con enlaces arbo
        //desincripatar el mensaje 
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        BinaryTreeNode<Integer> arbol = new BinaryTreeNode<Integer>(5);
//        arbol.left = new BinaryTreeNode<Integer>(2);
//        arbol.rigth = new BinaryTreeNode<Integer>(6);
//        arbol.left.rigth = new BinaryTreeNode<Integer>(4);
//        
//        LinkedBinaryTree<String> ramaiz = new LinkedBinaryTree<String>("B",
//                new LinkedBinaryTree<String>("D"), new LinkedBinaryTree<String>("E"));
//
//        LinkedBinaryTree<String> arbol1 = new LinkedBinaryTree<String>("A",
//                ramaiz, new LinkedBinaryTree<String>("C"));
//        Iterator it = arbol1.iteratorInOrder();
//        while (it.hasNext()) {
//            System.out.println("Inorden: " + it.next());
//        }
//        System.out.println("\n");
//        Iterator it2 = arbol1.iteratorPreOrder();
//        while (it2.hasNext()) {
//            System.out.println("Preorder: " + it2.next());
//        }
//        System.out.println("\n");
//        Iterator it3 = arbol1.iteratorPostOrder();
//        while (it3.hasNext()) {
//            System.out.println("Posorder: " + it3.next());
//        }
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        System.out.println(arbol1.find("A"));
//
//        System.out.println(arbol1.size());
//              
//        System.out.println("contains = " + arbol1.contains("A"));
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        LinkedBinarySearchTree<Integer> arbol = new LinkedBinarySearchTree<Integer>();
//        arbol.addElement(5);
//        arbol.addElement(3);
//        arbol.addElement(7);
//        arbol.addElement(12);
//
//        arbol.addElement(10);
//        arbol.addElement(10);
//        arbol.addElement(10);
//
//        arbol.addElement(13);
//        arbol.addElement(13);
//        arbol.addElement(13);
//        arbol.addElement(13);
//
////        arbol.removeElement(10);
//        arbol.removeAllOCurrences(10);
//
//        arbol.removeAllOCurrences(13);
////        System.out.println(arbol.findMax());
//        System.out.println(arbol.findMin());
//        System.out.println(arbol.contains(12));
//        System.out.println(arbol.size());
        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
//        BinarySearchTreeList<Integer> list = new BinarySearchTreeList<Integer>();
//
//        list.add(4);
//        list.add(6);
//        list.add(1);
//        list.add(25);
//        list.add(6);
//        list.add(9);
//        list.add(2);
//
//        Iterator l1 = list.iterator();
//        System.out.println("Orden:");
//        while (l1.hasNext()) {
//            System.out.println(l1.next());
//        }
//        System.out.println("tamaño: " + list.size());
//
//        System.out.println("primero: " + list.first());
//
//        System.out.println("ultimo: " + list.last());
//
//        System.out.println("remueve: " + list.remove(2));
//
//        System.out.println("tamaño: " + list.size());
//
//        System.out.println("remueve primero: " + list.removeFirst());
//
//        System.out.println("remueve el ultimo: " + list.removeLast());

        //************************************************************************************************
        //************************************************************************************************
        //************************************************************************************************
        Juego juego = new Juego();
        juego.setVisible(true);
        juego.setLocationRelativeTo(null);
        
//        Juego j  =new  Juego();
//        j.setVisible(true);
    }
}
