/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWord;

/**
 *
 * @author Juan
 */
public class SingleObject {

    // crea un objeto de SingleObject
    private static SingleObject instance = new SingleObject();

    // hace que el constructor sea privado para que esta clase no pueda ser instanciada
    private SingleObject() {
    }

    // Obtener el único objeto disponible
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("¡Hello Word!");

    }    
}
