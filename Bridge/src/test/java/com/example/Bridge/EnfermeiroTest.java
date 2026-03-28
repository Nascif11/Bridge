package com.example.Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnfermeiroTest {

    @Test
    void deveRetornarSalarioEnfermeiroComClinicoGeral() {
        Especializacao esp = new ClinicoGeral();
        Enfermeiro enf = new Enfermeiro(3000.0f);
        enf.setEspecializacao(esp);
        assertEquals(3000.0f, enf.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComEspecialista() {
        Especializacao esp = new Especialista();
        Enfermeiro enf = new Enfermeiro(3000.0f);
        enf.setEspecializacao(esp);
        assertEquals(3600.0f, enf.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComCirurgiao() {
        Especializacao esp = new Cirurgiao();
        Enfermeiro enf = new Enfermeiro(3000.0f);
        enf.setEspecializacao(esp);
        assertEquals(4200.0f, enf.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComResidente() {
        Especializacao esp = new Residente();
        Enfermeiro enf = new Enfermeiro(3000.0f);
        enf.setEspecializacao(esp);
        assertEquals(3300.0f, enf.calcularSalario(), 0.01f);
    }
}