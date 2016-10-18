/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author Arasa
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       coche coche1=new coche();
       coche1.setVelocidad(15);
       coche1.setAceleracion(10);
       
       System.out.println("Velocidad = "+coche1.acelerar());
       System.out.println("Velocidad = "+coche1.frenar());
    }
    
}
