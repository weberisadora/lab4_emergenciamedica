package negocio;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmergenciaTest {
    Emergencia emergencia;

    static Paciente paciente1;
    static Paciente paciente2;
    static Paciente paciente3;

    @BeforeAll
    public static void beforeAll() {
        paciente1 = new Paciente("Paciente1", 1);
        paciente2 = new Paciente("Paciente2", 2);
        paciente3 = new Paciente("Paciente3", 3);
    }

    @BeforeEach
    public void beforeEach() {
        emergencia = new Emergencia();
    }

    @Test
    void adicionaPacienteNaFilaDeFormaOrdenada() {
        emergencia.adicionaPacienteNaFila(paciente1);
        emergencia.adicionaPacienteNaFila(paciente2);
        emergencia.adicionaPacienteNaFila(paciente3);
        assertEquals(paciente3, emergencia.getPacientesAguardandoVacina().get(0));
    }

    @Test
    void vacinaPacienteRemoveDaFila() {
        emergencia.getPacientesAguardandoVacina().add(paciente1);
        emergencia.vacinaPaciente();
        assertTrue(emergencia.getPacientesAguardandoVacina().isEmpty());
    }

    @Test
    void vacinaPacienteAdicionaAListaDeVacinados() {
        emergencia.getPacientesAguardandoVacina().add(paciente1);
        emergencia.getPacientesAguardandoVacina().add(paciente2);

        emergencia.vacinaPaciente();

        assertEquals(paciente1, emergencia.getPacientesVacinados().get(0));
    }
}
