/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaTareas;

/**
 *
 * @author Dylan
 */
import javax.swing.DefaultListModel;

public class ControladorTareas  {

    // Referencias a la Vista y al Modelo contenedor
    private FrmTareas vista;
    private ListaTareas modelo;
    
    // Modelo visual dinamico para conectar con el JList de la vista
    private DefaultListModel<AgendaTareas> modeloLista;

    public ControladorTareas(FrmTareas vista, ListaTareas modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.modeloLista = new DefaultListModel<>();

    }
}
