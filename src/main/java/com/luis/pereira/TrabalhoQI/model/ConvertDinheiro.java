package com.luis.pereira.TrabalhoQI.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConvertDinheiro {

    @Getter @Setter
    private double real;

    public double dolar(){
        return this.real * 5.32;
    }

    public double euro(){
        return this.real * 5.95;
    }

}
