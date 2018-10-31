/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import arbolesBinarios.BinaryTreeNode;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static vista.Juego.Answer;
import static vista.Juego.txtAnswer;
import static vista.Juego.txtQuestion;

/**
 *
 * @author Juan1
 */
public class JuegoMemoria {

    private BinaryTreeNode<String> raiz;//crea una variable raiz de tipo binarytreenode
    private Scanner leer = new Scanner(System.in);//objeto de scann

    public boolean si(String pregunta) {//metodo de tipo booleano
        txtQuestion.setText(pregunta);
//        String resp = JOptionPane.showInputDialog(null, pregunta);//obitine la respuesta 
        return "si".equals(Answer.toLowerCase());//retorna verdader o falso
    }

    public void ejecutar(String firstAnimal) {//metodo obtiene como parametro el primer animal
        boolean bucle = true;//crea un bucle en verdadero
        raiz = new BinaryTreeNode<String>(firstAnimal);//la raiz es el primer animal
        while (bucle) {//mienras sea verdadero se repite
            if (!si("Estas pensando en un animal?")) {//es la respuesta es undiferente a si
                break;//rompe el ciclo
            }
            BinaryTreeNode<String> arbol = raiz;//crea el arbol y le almacena lo de la raiz
            while (arbol.left != null) {//si el arbol en la posicion left en nulo 
                if (si(arbol.element + " ?")) {//
                    arbol = arbol.left;
                } else {
                    arbol = arbol.rigth;
                }
            }
            String animal = arbol.element;

            if (si("Es un " + animal + " ?")) {
                System.out.println("Adivine!!");
                JOptionPane.showMessageDialog(null, "Adivine!!");
                continue;
            }
            String nuevo = JOptionPane.showInputDialog(null, "Que animal era?");
            String info = JOptionPane.showInputDialog(null, "Que diferencia a un " + animal + " de un  " + nuevo + " ?");
            String indicador = "Si el animal fuera un " + animal + " este " + info + " ?";
            arbol.element = info;
            if (si(indicador)) {
                arbol.left = new BinaryTreeNode<String>(animal);
                arbol.rigth = new BinaryTreeNode<String>(nuevo);
            } else {
                arbol.rigth = new BinaryTreeNode<String>(animal);
                arbol.left = new BinaryTreeNode<String>(nuevo);
            }
        }
    }

}
