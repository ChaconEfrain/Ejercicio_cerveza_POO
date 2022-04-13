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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar objeto
        Cerveza cerveza1 = new Cerveza();
        
        //Aplicamos Setter
        cerveza1.setMarca("Indio");
        cerveza1.setPresentacion("misil");
        cerveza1.setPrecio(30.00);
        
        //Llamamos al método que imprime
        cerveza1.imprimirDatos();
    }
    
}
