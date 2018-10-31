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
public class Customer {

    private int arrivalTime, departureTime;

    public Customer(int arrives) {
        arrivalTime = arrives;
        departureTime = 0;
    }

    public int getArrivalTime() {//tiempo de llegada del cliente
        return arrivalTime;
    }

    public void setDepartureTime(int departs) {//hora de salida
        departureTime = departs;
    }

    public int getDepartureTime() {//pemitir la hora de salida
        return departureTime;
    }
    
    public int tolalTime(){//tiempo total de espera
        return departureTime - arrivalTime;
    }
}
