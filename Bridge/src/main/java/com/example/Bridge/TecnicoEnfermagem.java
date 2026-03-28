package com.example.Bridge;

public class TecnicoEnfermagem extends ProfissionalHospital {

    public TecnicoEnfermagem(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}