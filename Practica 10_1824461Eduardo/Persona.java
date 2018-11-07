/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Martinez
 */
public class Persona {

    public static void main(String args[]){
    
    Usuario Mariana = Usuario.getSingletonInstance("Mariana Rodriguez");
    
    try{
        Usuario Mariana1 = Mariana.clone();
        System.out.println(Maiana1.getNombre());
    
    }catch(NullPointerException ex){
        ex.printStackTrace();
    }
    
    }
    
    
}
