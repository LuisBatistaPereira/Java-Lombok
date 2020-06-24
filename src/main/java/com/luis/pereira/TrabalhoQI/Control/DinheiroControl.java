package com.luis.pereira.TrabalhoQI.Control;
import com.luis.pereira.TrabalhoQI.model.ConvertDinheiro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinheiroControl {

    ConvertDinheiro d1 = new ConvertDinheiro(5);

    @GetMapping("/dolar")
    public String dolar(){
        return "Dolar:" + d1.dolar() + "\nReal: " + d1.getReal();
    }

    @GetMapping("/euro")
    public String euro(){
        return "Euro:" + d1.euro() + "\nReal: " + d1.getReal();
    }
}
