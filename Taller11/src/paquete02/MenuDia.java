/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author D E L L
 */
public class MenuDia extends Menu {
    /*
    nombre del plato
    valor del menú
    valor inicial del menú
    valor de postre
    valor de bebida
    */
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String n, double vi, double vb, double vp) {
        super(n, vi);
        valorBebida = vb;
        valorPostre = vp;        
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public void establecerValorPostre(double n) {
        valorPostre = n;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu+valorBebida+valorPostre;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del Día:\n"
                + "%s"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del Menú: %.2f\n", 
                super.toString(), 
                obtenerValorBebida(),
                obtenerValorPostre(),
                obtenerValorMenu());
        return cadena;
    }
}

/*
Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00
*/
