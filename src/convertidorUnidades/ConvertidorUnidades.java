/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidorUnidades;

/**
 *
 * @author mr117
 */
public class ConvertidorUnidades {
    public double convertir(double valor, EnumTemperatura origen, EnumTemperatura destino) {
        double celsius = origen.aCelsius(valor);
        return destino.desdeCelsius(celsius);
    }
}
