/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Eduardo Martinez
 */
public class Cliente {
    
    
    public static void main(String[] args){
   
    int tipoPaquete = 50;
    
    PlanTelcel paquete = new PlanTelcelFactory().getPaquete(tipoPaquete);
    
    paquete.setTelefono("8112297223");
    String telefono = paquete.getTelefono();
    System.out.println("Su numero "+telefono+ " tiene:");
    paquete.descripcionPaquete();;
        
    }
    
}
