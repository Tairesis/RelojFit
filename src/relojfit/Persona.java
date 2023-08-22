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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    private Reloj reloj1;

    public Persona(String nombre, Reloj reloj1) {
        this.nombre = nombre;
        this.reloj1 = reloj1;
    }

    public void decirHora() {
        System.out.println(nombre + " ve la hora: " + reloj1.getHora());
    }

    public void comer() {

    }

    public void hablar() {

    }
}
