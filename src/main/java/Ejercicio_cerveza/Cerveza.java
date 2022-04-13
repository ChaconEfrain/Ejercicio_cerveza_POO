/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_cerveza;

/**
 *
 * @author Dell
 */
public class Cerveza {
    //Atributos
    private String marca;
    private String presentacion;
    private double precio;
    
    //Métodos Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Constructores
    public Cerveza(){
        
    }
    public Cerveza(String marca, String presentacion, double precio){
        this.marca = marca;
        this.presentacion = presentacion;
        this.precio = precio;
    }
    //Métodos
    public void imprimirDatos(){
        System.out.println("La marca es "+this.getMarca()+", la presentación es "+this.getPresentacion()+" y el precio es "+getPrecio()+" pesos.");
    }
}
