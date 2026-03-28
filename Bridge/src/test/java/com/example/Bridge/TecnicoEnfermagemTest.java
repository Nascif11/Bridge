package com.example.Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TecnicoEnfermagemTest {

    @Test
    void deveRetornarSalarioTecnicoComClinicoGeral() {
        Especializacao esp = new ClinicoGeral();
        TecnicoEnfermagem tec = new TecnicoEnfermagem(2000.0f);
        tec.setEspecializacao(esp);
        assertEquals(2000.0f, tec.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioTecnicoComEspecialista() {
        Especializacao esp = new Especialista();
        TecnicoEnfermagem tec = new TecnicoEnfermagem(2000.0f);
        tec.setEspecializacao(esp);
        assertEquals(2000.0f, tec.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioTecnicoComCirurgiao() {
        Especializacao esp = new Cirurgiao();
        TecnicoEnfermagem tec = new TecnicoEnfermagem(2000.0f);
        tec.setEspecializacao(esp);
        assertEquals(2000.0f, tec.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioTecnicoComResidente() {
        Especializacao esp = new Residente();
        TecnicoEnfermagem tec = new TecnicoEnfermagem(2000.0f);
        tec.setEspecializacao(esp);
        assertEquals(2000.0f, tec.calcularSalario(), 0.01f);
    }
}