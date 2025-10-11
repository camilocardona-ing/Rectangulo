/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author camilocardonasuarez
 */
public class ProcesoRectangulo {

    private final Vista vista;
    private RectanguloFigura modelo;

    public ProcesoRectangulo(Vista vista) {
        this.vista = vista;
    }

    public void crearRectangulo() {
        double x1 = vista.leerDouble("x1: ");
        double y1 = vista.leerDouble("y1: ");
        double x2 = vista.leerDouble("x2: ");
        double y2 = vista.leerDouble("y2: ");
        modelo = new RectanguloFigura(x1, y1, x2, y2);
        vista.mostrar("Creado: " + modelo);
    }

    public void mostrarArea() {
        vista.mostrar("Area = " + modelo.area());
    }

    public void escalar() {       
        int tipo = vista.leerInt("Escala (1=uniforme, 2=no uniforme): ");
        if (tipo == 1) {
            double f = vista.leerDouble("factor: ");
            modelo.escalar(f);
        } else {
            double fx = vista.leerDouble("fx: ");
            double fy = vista.leerDouble("fy: ");
            modelo.escalar(fx, fy);
        }
        vista.mostrar("Escalado:" + modelo);
    }

    public void mover() {     
        int sense = vista.leerInt("Mover (1.horizontal, 2.vertical): ");
        if (sense == 1) {
            double dx = vista.leerDouble("dx (neg izquierda / pos dererecha): ");
            modelo.mover(dx, 0);
        } else {
            double dy = vista.leerDouble("dy (neg abajo / pos arriba): ");
            modelo.mover(0, dy);
        }
        vista.mostrar("Movido: " + modelo);
    }

    public void probarPunto() {   
        double x = vista.leerDouble("Punto x: ");
        double y = vista.leerDouble("Punto y: ");
        boolean dentro = modelo.contiene(x, y);
        vista.mostrar("¿El punto (" + x + "," + y + ") está dentro? " + dentro);
    }

}


