/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covertidorUnidades;

/**
 *
 * @author mr117
 */
public class ControladorUnidades {
    private ConvertidorUnidades modelo;

    public ControladorUnidades() {
        this.modelo = new ConvertidorUnidades();
    }

    public double convertir(double valor, EnumTemperatura origen, EnumTemperatura destino) {
        return modelo.convertir(valor, origen, destino);
    }
}
