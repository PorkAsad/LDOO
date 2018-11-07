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
public class Paquete50 extends PlanTelcel {
    
    @Override
    public void descripcionPaquete(){
        System.out.println("*------ PAQUETE 50$ ACTIVADO ------------*");
        System.out.println("*|                50 MB                 |*");
        System.out.println("*|    Minutos y mensajes ilimitados     |*");
        System.out.println("*|    500 MB para mensajeria (Whatsapp) |*");
        System.out.println("*|    No aplica redes sociales          |*");
        System.out.println("*|    Vigencia su paquete es de 7 dias *| ");
        System.out.println("*----------------------------------------*");
    
        }
}