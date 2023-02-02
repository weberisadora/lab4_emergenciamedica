package main;

import negocio.Emergencia;
import negocio.Paciente;
import ui.EmergenciaUI;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Joana", 25);
        Paciente paciente2 = new Paciente("Beatriz", 60);
        Paciente paciente3 = new Paciente("Paulo", 76);
        Paciente paciente4 = new Paciente("João", 40);
        Paciente paciente5 = new Paciente("Isabella", 9);

        Emergencia emergencia = new Emergencia();
        
        emergencia.adicionaPacienteNaFila(paciente1);
        emergencia.adicionaPacienteNaFila(paciente2);
        emergencia.adicionaPacienteNaFila(paciente3);
        emergencia.adicionaPacienteNaFila(paciente4);
        emergencia.adicionaPacienteNaFila(paciente5);

        EmergenciaUI ui = new EmergenciaUI(emergencia);

        ui.exibeFilaPacientesAguardandoVacina();
        System.out.println();
        ui.exibeListaPacientesVacinados();
        System.out.println();
        emergencia.vacinaPaciente();
        System.out.println("Um paciente foi vacinado.");
        System.out.println();
        ui.exibeFilaPacientesAguardandoVacina();
        System.out.println();
        ui.exibeListaPacientesVacinados();
    }
}
