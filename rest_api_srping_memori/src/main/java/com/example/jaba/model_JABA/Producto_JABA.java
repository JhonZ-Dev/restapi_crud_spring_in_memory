package com.example.jaba.model_JABA;

import lombok.Data;

@Data
public class Producto_JABA {
    private Integer productoId;
    private Order_JABA orderJaba;
    private Integer DepartamentoId;
    private String nombre;
    private Double precio;


}
