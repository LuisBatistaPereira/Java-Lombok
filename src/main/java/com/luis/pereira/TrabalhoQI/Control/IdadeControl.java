package com.luis.pereira.TrabalhoQI.Control;
import com.luis.pereira.TrabalhoQI.model.ConverterIdade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdadeControl
{
    ConverterIdade idade1 = new ConverterIdade(17);

    @GetMapping("/meses")
    public String meses(){
        return "Anos: " + idade1.getIdade() + "\nMes: " + idade1.meses();
    }

    @GetMapping("/semanas")
    public String semanas(){
        return "Anos: " + idade1.getIdade() + "\nSemanas: " + idade1.semanas();
    }

    @GetMapping("/dias")
    public String dias(){
        return "Anos: " + idade1.getIdade() + "\nMes: " + idade1.dias();
    }
}
