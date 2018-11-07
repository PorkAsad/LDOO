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
public class Paquete100 extends PlanTelcel{
    
     @Override
    public void descripcionPaquete(){
        System.out.println("*------ PAQUETE 100$ ACTIVADO -----------*");
        System.out.println("*|          	100 MB                  |*");
        System.out.println("*|    Minutos y mensajes ilimitados     |*");
        System.out.println("*|    1000 MB para mensajeria (Whatsapp)|*");
        System.out.println("*|    * Redes sociales                  |*");
        System.out.println("*|   Vigencia su paquete es de 21 dias *| ");
        System.out.println("*----------------------------------------*");
    
    }
}
