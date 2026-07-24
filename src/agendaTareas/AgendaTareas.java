/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendatareas;

/**
 *
 * @author Dylan
 */
public class AgendaTareas {
    
    private String tarea;
    private boolean estado;

    public String getTarea() {
        return tarea;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public AgendaTareas(String tarea) {
        this.tarea = tarea;
        this.estado = false;
    }

    @Override
    public String toString() {
    String estadoTexto = estado ? "[Completada]" : "[Pendiente]";
    return estadoTexto + " " + tarea;   
    }
    
    
 
    
}
