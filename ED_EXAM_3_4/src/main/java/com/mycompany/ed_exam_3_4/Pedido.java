package com.mycompany.ed_exam_3_4;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //Atributos
    private String cliente;
    private List<String> productos;
    private double total;

    //Constructor
    public Pedido(String cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }

    //Metodos
    public void agregarProducto(String producto, double precio) {
        if (precio > 0) {
            productos.add(producto);
            total += precio;
        }
    }

    public double calcularTotal() {
        if (total > 100) {
            return total * 0.90; // 10% de descuento si el pedido supera los 100
        } else {
            return total;
        }
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Productos: " + productos);
        System.out.println("Total: " + calcularTotal());
    }
}
