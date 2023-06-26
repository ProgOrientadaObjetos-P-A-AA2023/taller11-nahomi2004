/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author D E L L
 */
public class MenuNinios extends Menu {
    /*
    nombre del plato
    valor del menú
    valor inicial del menú
    valor de porción de helado
    valor de porción de pastel
    */
    private double valorHelado;
    private double valorPastel;

    public MenuNinios(String n, double vi, double vh, double vp) {
        super(n, vi);
        valorHelado = vh;
        valorPastel = vp;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public void establecerValorHelado(double n) {
        valorHelado = n;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    public void establecerValorPastel(double n) {
        valorPastel = n;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu+valorPastel+valorHelado;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu de Niños:\n"
                + "%s"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del Menú: %.2f\n", 
                super.toString(), 
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenerValorMenu());
        return cadena;
    }
}
/*
Menu de Niños:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50
*/