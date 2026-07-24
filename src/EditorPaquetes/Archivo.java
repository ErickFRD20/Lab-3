/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditorPaquetes;

/**
 *
 * @author josed
 */
public class Archivo {
    private String nombre;
    private String ruta;
    private String contenido;

  
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRuta() {
        return ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
     public Archivo(String nombre, String ruta, String contenido) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.contenido = contenido;
    }

} 

