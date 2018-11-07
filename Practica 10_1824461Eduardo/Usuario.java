/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Martinez
 */
public class Usuario {

    public static Usuario getUsuario() {
        return Usuario;
    }

    public static void setUsuario(Usuario Usuario2) {
        Usuario = Usuario2;
    }
    
    private String nombre;
    private static Usuario Usuario;
    
    
    private Usuario(String nombre){
        
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
        
        
    }
    
    public static Usuario getSingletonInstance(String nombre){
        
            if(Usuario == null){
                Usuario = new Usuario(nombre);
            }
            
            else{
                System.out.println("No se puede crear, ya existe el objeto" +nombre);
                
                
            }
                return Uusario;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    @Override
    public Usuario clone(){
        try{
            throw new CloneNotSupportedException();
        }catch(CloneNotSupportedException ex){
            System.out.println("No se puede clonar");
        }
        
        return null;
        
    }
    
    
    
    
    
}

