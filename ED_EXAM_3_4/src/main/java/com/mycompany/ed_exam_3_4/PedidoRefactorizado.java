package com.mycompany.ed_exam_3_4;

import java.util.ArrayList;
import java.util.List;

/**
* La clase hace referencia a objetos de tipo pedido.
 * @author FnFra
 */
public class PedidoRefactorizado {
    //Atributos
    private String cliente;
    private ArrayList<String> productos;
    private double total;

    //Constructor
    /**
     * El constructor completo de la clase PedidoRefactorizado 
     * @param cliente 
     */
    public PedidoRefactorizado(String cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }

    //Metodos
    /**
     * Es un metodo que añade un producto a un ArrayList y devuelve un valor booleano dependiendo de lo que haya ocurrido.
     * @param producto
     * @param precio
     * @return boolean
     */
    public boolean agregarProducto(String producto, double precio) {
        if (precio > 0 && !(producto.isEmpty())) {
            total += precio;
            return this.productos.add(producto);
        }else{
            System.err.println("Ni el precio puede ser negativo, ni el producto puede no estar especificado");
        }
        return false;
    }

    /**
     * Calcula la suma final del total de precios dependiendo de si sobrepasa cierto numero.
     * @return double
     */
    public double calcularTotal() {
        if (total > 100) {
            return total *= 0.90; // 10% de descuento si el pedido supera los 100
        }else{
            return total = total;
        }
    }

    /**
     * Enseña por consola todos los atributos de un objeto pedido.
     * @return String
     */
    public String mostrarPedido() {
        return "Cliente: " + cliente + ", Productos: " + productos + ", Total: " + calcularTotal() + ".";
    }
    
}
