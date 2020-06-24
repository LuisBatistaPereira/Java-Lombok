package com.luis.pereira.TrabalhoQI.model;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
    public class CalculosAritmeticos {

        @Getter @Setter
        private double n1;
        @Getter @Setter
        private double n2;

        public double adicao() {
            return this.n1 + this.n2;
        }

        public double subtracao() {
            return this.n1 - this.n2;
        }

        public double multiplicacao() {
            return this.n1 * this.n2;
        }

        public double divisao() {
            return this.n1 / this.n2;
        }

    }
