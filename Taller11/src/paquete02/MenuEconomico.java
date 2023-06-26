/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author D E L L
 */
public class MenuEconomico extends Menu {
    /*
    nombre del plato
    valor del menú
    valor inicial del menú
    porcentaje de descuento, en referencia al valor inicial del menú
    */
    private double porcentaje;

    public MenuEconomico(String n, double vi, double p) {
        super(n, vi);
        porcentaje = p;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public void establecerPorcentaje(double n) {
        porcentaje = n;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu-(valorInicialMenu*(porcentaje/100));
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu Económico:\n"
                + "%s"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menú: %.2f\n", 
                super.toString(), 
                obtenerPorcentaje(),
                obtenerValorMenu());
        return cadena;
    }
}

/*
Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00
*/
