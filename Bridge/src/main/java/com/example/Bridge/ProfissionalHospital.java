package com.example.Bridge;

public abstract class ProfissionalHospital {
    protected Especializacao especializacao;
    protected float salarioBase;

    public ProfissionalHospital(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}