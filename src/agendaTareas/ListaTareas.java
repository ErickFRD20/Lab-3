/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaTareas;


/**
 *
 * @author Dylan
 */
public class ListaTareas {
    private AgendaTareas[] vectorTarea;
    private int canTareas;

    public ListaTareas(int capacidad) {
        this.vectorTarea = new AgendaTareas[capacidad];
        this.canTareas = 0;
    }
    
    public boolean agregarTarea(AgendaTareas NuevaTarea){
        if (canTareas < vectorTarea.length) {
            vectorTarea[canTareas] = NuevaTarea;
            canTareas++;
            return true;
        }
        return false;
    }
    
    public boolean completarTarea(int indice) {
    if (indice >= 0 && indice < canTareas) {
        vectorTarea[indice].setEstado(true);
        return true; // Éxito al cambiar el estado
    }
    return false; // El índice estaba fuera de rango
}
    
    public boolean eliminarTarea(int indice) {
        if (indice >= 0 && indice < canTareas) {
            for (int i = indice; i < canTareas - 1; i++) {
                vectorTarea[i] = vectorTarea[i + 1];
            }
            vectorTarea[canTareas - 1] = null;
            canTareas--;
            return true;
        }
        return false;
    }
    
    public AgendaTareas[] getTareasGuardadas() {
        AgendaTareas[] copia = new AgendaTareas[canTareas];
        for (int i = 0; i < canTareas; i++) {
            copia[i] = vectorTarea[i];
        }
        return copia;
    }
    
    public AgendaTareas getTarea(int indice) {
        if (indice >= 0 && indice < canTareas) {
            return vectorTarea[indice];
        }
        return null;
    }

   
    
    
}
