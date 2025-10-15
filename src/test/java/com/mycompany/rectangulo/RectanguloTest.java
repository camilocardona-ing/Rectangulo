/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.rectangulo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import modelo.Figura;
import modelo.ProcesoRectangulo;
import modelo.Punto;
import modelo.RectanguloFigura;
import modelo.Vista;

/**
 *
 * @author camilocardonasuarez
 */
public class RectanguloTest {

    static class VistaStub extends Vista {

        private final StringBuilder log = new StringBuilder();
        private final double[] doubles = {0, 0, 4, 3, 0.5, 2.0, 2.0, 1.0};
        private final int[] ints = {1};
        private int di = 0, ii = 0;

        @Override
        public void mostrar(String msg) {
            log.append(msg).append('\n');
        }

        @Override
        public double leerDouble(String p) {
            return doubles[di++];
        }

        @Override
        public int leerInt(String p) {
            return ints[ii++];
        }

        public String salida() {
            return log.toString();
        }
    }

    @Test
    void pruebaIntegracionBasica() {
        VistaStub vista = new VistaStub();
        ProcesoRectangulo proceso = new ProcesoRectangulo(vista);

        assertDoesNotThrow(() -> {
            proceso.crearRectangulo();
            proceso.mostrarArea();    
            proceso.escalar();      
            proceso.mover();          
            proceso.probarPunto();     
        });

        String out = vista.salida();
        
        assertTrue(out.contains("Area = 12") || out.contains("Area = 12.0"),
                "'Area = 12' al calcular el area inicial");

        assertTrue(out.contains("area=3") || out.contains("area=3.0"),
                "'area = 3' despues de escalar a 0.5");

        assertTrue(out.toLowerCase().contains("dentro? true"),
                "el punto esta dentro (true)");
    }

}
