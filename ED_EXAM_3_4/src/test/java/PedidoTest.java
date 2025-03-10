/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ed_exam_3_4.PedidoRefactorizado;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author FnFra
 */
public class PedidoTest {
    
    public PedidoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testCalculoConDescuento() {
        PedidoRefactorizado pedido = new PedidoRefactorizado("Carlos");
        pedido.agregarProducto("Producto1", 60);
        pedido.agregarProducto("Producto2", 50);
        double totalEsperado = 99.0; // (60 + 50) * 0.90
        assertEquals(totalEsperado, pedido.calcularTotal());
    }

    @Test
    public void testCalculoSinDescuento() {
        PedidoRefactorizado pedido = new PedidoRefactorizado("Carlos");
        pedido.agregarProducto("Producto1", 40);
        pedido.agregarProducto("Producto2", 50);
        double totalEsperado = 90.0; // (40 + 50) * 1
        assertEquals(totalEsperado, pedido.calcularTotal());
    }
    
    @Test
    public void testVacios() {
        PedidoRefactorizado pedido = new PedidoRefactorizado("Carlos");
        assertTrue(pedido.agregarProducto("", 30)); // Producto vacío
        assertTrue(pedido.agregarProducto("Producto1", -10)); // Precio negativo
    }
    
    @Test
    public void testAlmacenamiento(){
        PedidoRefactorizado pedido = new PedidoRefactorizado("Carlos");
        assertTrue(pedido.agregarProducto("Producto", 1500));
    }
}

