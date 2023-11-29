package com.example.jaba.model_JABA;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Order_JABA {
    private Integer OrderId;

    /*Relacion con custumer*/


    /*Relacion con Store*/

    /*otros atributos*/
    private Integer cantidadventas;
    private LocalDateTime date;
    private LocalTime tiempo;

}
