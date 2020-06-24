package com.luis.pereira.TrabalhoQI.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConverterIdade {

    @Getter @Setter
    private int idade;

    public int meses(){
        return this.idade * 12;
    }

    public int semanas(){
        return this.idade * 52;
    }

    public int dias(){
        return this.idade * 365;
    }

}
