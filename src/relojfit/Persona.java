/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojfit;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    
    private Reloj reloj1;

    public Persona(String nombre, Reloj reloj1) {
        this.nombre = nombre;
        this.reloj1 = reloj1;
    }

    public void verHora() {
        System.out.println(nombre + " ve la hora: " + reloj1.getHora());
    }

    public void verDia() {
        System.out.println(nombre + " ve el día: " + reloj1.getDia());
    }
}
