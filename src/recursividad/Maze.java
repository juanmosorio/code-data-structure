/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Juan
 */
public class Maze {

    private final int TRIED = 3;
    private final int PATH = 7;
    private int[][] grid
            = {{1, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 1, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 1, 0, 1, 0, 0, 0},
            {1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1, 0, 1, 0, 0, 0},
            {1, 0, 1, 1, 1, 0, 1, 0, 1, 0},
            {1, 0, 0, 1, 1, 1, 1, 0, 1, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1}};

    public boolean traverse(int row, int colum) {
        boolean done = false;
        if (valid(row, colum)) {
            grid[row][colum] = TRIED;//celda ya probada
            if (row == grid.length - 1 && colum == grid[0].length - 1) {
                done = true; // el laberinto esta resuelto
            } else {
                done = traverse(row + 1, colum); //hacia abajo
                if (!done) {
                    done = traverse(row, colum + 1);//hacia la derecha
                }
                if (!done) {
                    done = traverse(row - 1, colum);//hacia arriba
                }
                if (!done) {
                    done = traverse(row, colum - 1);//hacia la izquierda
                }
            }
            if (done) {//marco que es igual a camino valido
                grid[row][colum] = PATH;
            }
        }
        return done;
    }

    private boolean valid(int row, int colum) {
        boolean result = false;
        //comprueba que esta dentro de la pared
        if (row >= 0 && row < grid.length && colum >= 0 & colum < grid[row].length) {
            if (grid[row][colum] == 1) {//comprueba que no sea pared
                return true;
            }
        }
        return result;
    }

    public String toString() {//imprime el resultado del laberinto
        String result = "\n";//salto de linea
        for (int row = 0; row < grid.length; row++) {//recore las filas
            for (int column = 0; column < grid[row].length; column++) {//recorre las columnas de las proimeras filas
                result += grid[row][column] + "";//acumulador de las columnas
            }
            result += "\n";//salto de linea
        }
        return result;//retorna el resultado.
    }

}
