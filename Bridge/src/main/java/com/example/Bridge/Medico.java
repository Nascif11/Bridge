package com.example.Bridge;

public class Medico extends ProfissionalHospital {

    public Medico(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especializacao.percentualAumento());
    }
}