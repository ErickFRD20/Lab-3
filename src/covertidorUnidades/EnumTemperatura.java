/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covertidorUnidades;

/**
 *
 * @author mr117
 */
public enum EnumTemperatura {
   CELSIUS {
        @Override
        public double aCelsius(double valor) {
            return valor;
        }

        @Override
        public double desdeCelsius(double celsius) {
            return celsius;
        }
    },
    FAHRENHEIT {
        @Override
        public double aCelsius(double valor) {
            return (valor - 32) * 5.0 / 9.0;
        }

        @Override
        public double desdeCelsius(double celsius) {
            return (celsius * 9.0 / 5.0) + 32;
        }
    },
    KELVIN {
        @Override
        public double aCelsius(double valor) {
            return valor - 273.15;
        }

        @Override
        public double desdeCelsius(double celsius) {
            return celsius + 273.15;
        }
    };

    public abstract double aCelsius(double valor);
    public abstract double desdeCelsius(double celsius);
}
