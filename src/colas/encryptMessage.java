/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author Juan1
 */
public class encryptMessage {

    private Integer keyValue;//obtiene el valor de cada letra
    private String encoded;// almacena el mensaje encriptado
    private String decoded;//almacena el mesaje desencriptado
    private String message;//frase 
    int[] key;//cola para encriptar el mensaje

    private LinkedQueue<Integer> keyQueue1;//almacena el mensaje encriptado
    private LinkedQueue<Integer> keyQueue2;

    public encryptMessage(int[] key, String message) {
        this.keyQueue1 = new LinkedQueue();
        this.keyQueue2 = new LinkedQueue();
        this.key = key;//almacena la posicion de la letra
        this.message = message;//almacena el mensaje
        this.encoded = "";//se inicia en ""
        this.decoded = "";
    }

    public String encrypt() {//lee y encripta
        for (int scan = 0; scan < key.length; scan++) {//recorre el arreglo 
            keyQueue1.enqueue(new Integer(key[scan]));
            keyQueue2.enqueue(new Integer(key[scan]));
        }
        for (int scan = 0; scan < message.length(); scan++) {//recorre hasta el tamaño del manseje
            keyValue = keyQueue1.dequeue();
            encoded += (char) ((int) message.charAt(scan) + keyValue.intValue());
            keyQueue1.enqueue(keyValue);
        }
        return encoded;
    }

    public String decrypt() {
        for (int scan = 0; scan < message.length(); scan++) {
            keyValue = keyQueue2.dequeue();
            decoded += (char) ((int) encoded.charAt(scan) - keyValue.intValue());
            keyQueue2.enqueue(keyValue);
        }
        return decoded;
    }

    @Override
    public String toString() {
        return "encryptMessage\nencoded = " + encoded + "\ndecoded = " + decoded + "";
    }

}
