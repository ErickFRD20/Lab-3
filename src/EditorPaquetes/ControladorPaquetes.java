/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditorPaquetes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author josed
 */

public class ControladorPaquetes {

    public void copiar(JTextArea area){
        area.copy();
    }

    public void cortar(JTextArea area){
       area.cut();
    }

    public void pegar(JTextArea area){
    area.paste();
    }

    public void negrita(JTextArea area){
    Font fuente = area.getFont();
        if(fuente.isBold()){
        area.setFont(new Font(fuente.getName(),Font.PLAIN,fuente.getSize()));
        }else{
        area.setFont(new Font( fuente.getName(),Font.BOLD,fuente.getSize())); }
    }

    public void cursiva(JTextArea area){
        Font fuente = area.getFont();
        if(fuente.isItalic()){
        area.setFont(new Font(fuente.getName(),Font.PLAIN,fuente.getSize()));
        }else{
            
            area.setFont(new Font(fuente.getName(),Font.ITALIC,fuente.getSize()));
        }}

    public void colorLetra(JFrame ventana,
            JTextArea area){

        Color color = JColorChooser.showDialog(
                ventana,
                "color de la letra",
                Color.BLACK);
        if(color != null){          
            area.setForeground(color);
        } }

    public void colorFondo(JFrame ventana,JTextArea area){
        Color color = JColorChooser.showDialog(ventana,"Color del fondo",Color.WHITE);
        if(color != null){
            area.setBackground(color);
        }  
    }

    public void abrir(JFrame ventana,JTextArea area){
        area.setText("");
        JOptionPane.showMessageDialog(ventana,"Documento abierto correctamente.");
        ventana.setTitle("Documento abierto");
    }

    public void guardar(JFrame ventana){
        JOptionPane.showMessageDialog(ventana,"el documento se guardo don exito");
        ventana.setTitle("Documento guardado");
    }

    public boolean confirmarSalida(JFrame ventana){

        int opcion = JOptionPane.showConfirmDialog(ventana,"tiene cambios no guardados:\n¿Desea salir?","Confirmación",
                JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            return true;
        }else{
            return false;
        }
    }
}