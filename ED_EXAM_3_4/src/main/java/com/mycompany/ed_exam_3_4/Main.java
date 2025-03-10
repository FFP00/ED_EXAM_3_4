package com.mycompany.ed_exam_3_4;

public class Main {

    public static void main(String[] args) {
        PedidoRefactorizado pedido1 = new PedidoRefactorizado("Carlos");
        pedido1.agregarProducto("Smartphone", 500);
        pedido1.agregarProducto("Auriculares", 50);
        pedido1.agregarProducto("Cargador", 20);
        pedido1.agregarProducto("", 500);
        pedido1.agregarProducto("Anti-Smartphone", -500);
        System.out.println(pedido1.mostrarPedido());
    }
}
