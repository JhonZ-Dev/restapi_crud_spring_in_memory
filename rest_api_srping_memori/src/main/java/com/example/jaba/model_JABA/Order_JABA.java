package com.example.jaba.model_JABA;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Order_JABA {
    private Integer OrderId;

    /*Relacion con custumer*/
    private Custumer_JABA customer;

    /*Relacion con Store*/
    private Store_JABA store;
    /*otros atributos*/
    private Integer cantidadventas;
    private LocalDateTime date;
    private LocalTime tiempo;

}
