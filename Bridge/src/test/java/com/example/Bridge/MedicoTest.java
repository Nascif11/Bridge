package com.example.Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void deveRetornarSalarioMedicoComClinicoGeral() {
        Especializacao esp = new ClinicoGeral();
        Medico medico = new Medico(5000.0f);
        medico.setEspecializacao(esp);
        assertEquals(5000.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComEspecialista() {
        Especializacao esp = new Especialista();
        Medico medico = new Medico(5000.0f);
        medico.setEspecializacao(esp);
        assertEquals(6000.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComCirurgiao() {
        Especializacao esp = new Cirurgiao();
        Medico medico = new Medico(5000.0f);
        medico.setEspecializacao(esp);
        assertEquals(7000.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComResidente() {
        Especializacao esp = new Residente();
        Medico medico = new Medico(5000.0f);
        medico.setEspecializacao(esp);
        assertEquals(5500.0f, medico.calcularSalario(), 0.01f);
    }
}