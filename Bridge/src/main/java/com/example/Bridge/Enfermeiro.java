package com.example.Bridge;

public class Enfermeiro extends ProfissionalHospital {

    public Enfermeiro(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especializacao.percentualAumento());
    }
}