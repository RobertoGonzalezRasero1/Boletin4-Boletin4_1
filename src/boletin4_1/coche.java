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
public class coche {
     private int velocidad ;
     private int aceleracion;
   
     public coche(){
    velocidad = 0;
    aceleracion=0;
}

     public int getVelocidad(){
         return velocidad;
     } 
    public void setVelocidad (int velocidad){
        this.velocidad = velocidad;
    }
     public int getAceleracion(){
         return aceleracion;
     } 
    public void setAceleracion (int aceleracion){
        this.aceleracion = aceleracion;
    }
        public int acelerar (){
         int acelerar;
         acelerar = velocidad+aceleracion;
         return acelerar;
    }
        public int frenar (){
         int frenar;
         frenar = velocidad-aceleracion;
         return frenar;
    }
        
}