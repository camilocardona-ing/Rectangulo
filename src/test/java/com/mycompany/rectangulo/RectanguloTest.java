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

/**
 *
 * @author camilocardonasuarez
 */
public class RectanguloTest {
    @Test
    void pruebaIntegracionBasica() {
        String entrada = String.join("\n",
                "1","0","0","4","3",
                "2",
                "3","0.5",
                "4","1","2",
                "5","2","1",
                "0") + "\n";

        ByteArrayInputStream in = new ByteArrayInputStream(entrada.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        assertDoesNotThrow(() -> Rectangulo.main(new String[]{}));

        String salida = out.toString();
        assertTrue(salida.contains("Area = 12"));
        assertTrue(salida.contains("Fin"));
    }


}
