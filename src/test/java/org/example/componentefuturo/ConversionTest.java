package org.example.componentefuturo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionTest {

    @Test
    public void testConversion100Euros() {
        ConversionController conversor = new ConversionController();
        double resultado = conversor.conversion(100.0);
        assertEquals(117.0, resultado, 0.01);
    }

    @Test
    public void testConversion0Euros() {
        ConversionController conversor = new ConversionController();
        double resultado = conversor.conversion(0.0);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    public void testConversionDecimales() {
        ConversionController conversor = new ConversionController();
        double resultado = conversor.conversion(50.5);
        assertEquals(59.09, resultado, 0.01);
    }

    @Test
    public void testCambiarTasa() {
        ConversionController conversor = new ConversionController();
        conversor.setTasaCambio(1.0);
        double resultado = conversor.conversion(100.0);
        assertEquals(100.0, resultado, 0.01);
    }

    @Test
    public void testSetGetEuros() {
        ConversionController conversor = new ConversionController();
        conversor.setEuros(200.0);
        double euros = conversor.getEuros();
        assertEquals(200.0, euros, 0.01);
    }
}