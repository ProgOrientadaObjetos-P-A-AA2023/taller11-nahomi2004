/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author D E L L
 */
public class MenuCarta extends Menu {
    /*
    nombre del plato
    valor del menú
    valor inicial del menú
    valor de porción de guarnición
    valor de bebida
    porcentaje adicional por servicio en relación del valor inicial del menú
    */
    
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentaje;

    public MenuCarta(String n, double vi, double vg, double b, double p) {
        super(n, vi);
        valorGuarnicion = vg;
        valorBebida = b;
        porcentaje = p;
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public void establecerValorGuarnicion(double n) {
        valorGuarnicion = n;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public void establecerPorcentaje(double n) {
        porcentaje = n;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = (valorGuarnicion+valorBebida+valorInicialMenu)+(valorInicialMenu*(porcentaje/100));
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta:\n"
                + "%s"
                + "\tValor guarnición: %.1f\n"
                + "\tValor bebida: %.1f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n", 
                super.toString(), 
                obtenerValorGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentaje(),
                obtenerValorMenu());
        return cadena;
    }
}

/*
Factura
Cliente: René Elizalde

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/
