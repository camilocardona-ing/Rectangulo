/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author camilocardonasuarez
 */
public class ProcesosTest {
    @Test
    void areaConVerticesOpuestos() {
        RectanguloFigura r = new RectanguloFigura(0,0, 4,3);
        assertEquals(12.0, r.area(), 1e-9);

        RectanguloFigura r2 = new RectanguloFigura(4,3, 0,0);
        assertEquals(12.0, r2.area(), 1e-9);
    }

    @Test
    void escalarUniformeConFijo() {
        RectanguloFigura r = new RectanguloFigura(0,0, 4,3);
        r.escalar(0.5); 
        assertEquals(0.0, r.getP1().getX(), 1e-9);
        assertEquals(0.0, r.getP1().getY(), 1e-9);
        assertEquals(2.0, r.getP2().getX(), 1e-9);
        assertEquals(1.5, r.getP2().getY(), 1e-9);
        assertEquals(3.0, r.area(), 1e-9);
    }

    @Test
    void moverHorizontalYVerticalSoloUnSentido() {
        RectanguloFigura r = new RectanguloFigura(0,0, 2,1);
        r.mover(3, 0); 
        assertEquals(3.0, r.getP1().getX(), 1e-9);
        assertEquals(5.0, r.getP2().getX(), 1e-9);

        r.mover(0, -2); 
        assertEquals(-2.0, r.getP1().getY(), 1e-9);
        assertEquals(-1.0, r.getP2().getY(), 1e-9);
    }


    @Test
    void contieneIncluyeBordes() {
        RectanguloFigura r = new RectanguloFigura(0,0, 4,3);
        assertTrue(r.contiene(0, 0));    
        assertTrue(r.contiene(4, 3));      
        assertTrue(r.contiene(2, 1.5)); 
        assertFalse(r.contiene(5, 1));  
        assertFalse(r.contiene(-1, 0));   
        assertTrue(r.contiene(new Punto(4, 1))); 
    }




    
}
