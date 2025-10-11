/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangulo;
import modelo.Figura;
import modelo.ProcesoRectangulo;
import modelo.Punto;
import modelo.RectanguloFigura;
import modelo.Vista;
import java.util.Scanner;
 

/**
 *
 * @author camilocardonasuarez
 */

public class Rectangulo {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ProcesoRectangulo procesoRectangulo = new ProcesoRectangulo(vista);

        vista.mostrar("---Rectangulo---");
        boolean salir = false;
        while (!salir) {
            vista.mostrar("\n1) Crear rectangulo");
            vista.mostrar("2) Calcular area");
            vista.mostrar("3) Escalar (p1 fijo)");
            vista.mostrar("4) Mover (solo un sentido)");
            vista.mostrar("5) Probar si un punto esta dentro");
            vista.mostrar("0) Salir");
            int op = vista.leerInt("Opcion: ");

            try {
                switch (op) {
                    case 1 -> procesoRectangulo.crearRectangulo();
                    case 2 -> procesoRectangulo.mostrarArea();
                    case 3 -> procesoRectangulo.escalar();
                    case 4 -> procesoRectangulo.mover();
                    case 5 -> procesoRectangulo.probarPunto();
                    case 0 -> salir = true;
                    default -> vista.mostrar("Opción invalida.");
                }
            } catch (Exception e) {
                vista.mostrar("Error: " + e.getMessage());
            }
        }
        vista.mostrar("Fin");
    }
}

