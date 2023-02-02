package ui;

import negocio.Emergencia;
import negocio.Paciente;

public class EmergenciaUI {
    Emergencia emergencia;

    public EmergenciaUI(Emergencia emergencia) {
        this.emergencia = emergencia;
    }

    public void exibeDados() {
        System.out.println("Pacientes aguardando vacina:");
        exibeFilaPacientesAguardandoVacina();
        System.out.println();
        System.out.println("Pacientes vacinados:");
        exibeListaPacientesVacinados();
    }

    public void exibeFilaPacientesAguardandoVacina() {
        System.out.println("Fila de pacientes aguardando vacina:");

        for (Paciente paciente : emergencia.getPacientesAguardandoVacina()) {
            System.out.println(paciente);
        }
    }

    public void exibeListaPacientesVacinados() {
        System.out.println("Lista de pacientes vacinados:");

        if (!emergencia.getPacientesVacinados().isEmpty())
            for (Paciente paciente : emergencia.getPacientesVacinados())
                System.out.println(paciente);

        else
            System.out.println("A lista de pacientes vacinados está vazia.");
    }
}
