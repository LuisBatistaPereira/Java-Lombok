package com.luis.pereira.TrabalhoQI.Control;

import com.luis.pereira.TrabalhoQI.model.CalculosAritmeticos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AritmeticoControl {
    CalculosAritmeticos c1 = new CalculosAritmeticos(23.4, 34.5);

    @GetMapping("/adicao")
    public String adicao(){
        return "Adição: " + c1.adicao();
    }

    @GetMapping("/subtracao")
    public String subtracao(){
        return "Subtração: " + c1.subtracao();
    }

    @GetMapping("/multiplicacao")
    public String multiplicacao(){
        return "Multiplicação: " + c1.multiplicacao();
    }

    @GetMapping("/divisao")
    public String divisao(){
        return "Divisão: " + c1.divisao();
    }
}
