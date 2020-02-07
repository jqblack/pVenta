/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesGenerales;

/**
 *
 * @author Usuario
 */
public class Combo {
    
    private String nombre;
    private String id;
    
    
    public Combo(String id,String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString()
    {
        return getNombre();
    }
    
    
}
