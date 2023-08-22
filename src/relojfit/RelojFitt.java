/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojfit;

public class RelojFitt extends Reloj {

    public RelojFitt() {
        super();
    }

    public double cuentaPasos(double coordenadaX1, double coordenadaY1, double coordenadaX2, double coordenadaY2) {
        double distanciaX = coordenadaX2 - coordenadaX1;
        double distanciaY = coordenadaY2 - coordenadaY1;
        return Math.sqrt(distanciaX + distanciaY);
    }
}
