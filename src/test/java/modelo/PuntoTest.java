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
public class PuntoTest {
    @Test
    void gettersSettersYCopia() {
        Punto p = new Punto(1.2, -3.4);
        assertEquals(1.2, p.getX(), 1e-9);
        assertEquals(-3.4, p.getY(), 1e-9);

        p.setX(5.0);
        p.setY(6.0);
        assertEquals(5.0, p.getX(), 1e-9);
        assertEquals(6.0, p.getY(), 1e-9);

        Punto q = p.copia();
        assertNotSame(p, q);
        assertEquals(p.getX(), q.getX(), 1e-9);
        assertEquals(p.getY(), q.getY(), 1e-9);
    }
    
}
