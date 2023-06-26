/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author D E L L
 */
public abstract class Menu {
    /*  
        nombre del plato
        valor del menú
        valor inicial del menú 
    */
    
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String n, double vi) {
        nombrePlato = n;
        valorInicialMenu = vi;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public abstract void establecerValorMenu();

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public void establecerValorInicialMenu(double n) {
        valorInicialMenu = n;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n", 
                obtenerNombrePlato(), 
                obtenerValorInicialMenu());
        return cadena;
    }
}
/*
Factura
Cliente: René Elizalde
Menu de Niños:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu de Niños:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

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