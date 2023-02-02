package negocio;

import java.util.*;

public class Emergencia {
    private List<Paciente> pacientesAguardandoVacina;
    private List<Paciente> pacientesVacinados;

    public Emergencia() {
        pacientesAguardandoVacina = new ArrayList<>();
        pacientesVacinados = new ArrayList<>();
    }

    public List<Paciente> getPacientesAguardandoVacina() {
        return pacientesAguardandoVacina;
    }

    public List<Paciente> getPacientesVacinados() {
        return pacientesVacinados;
    }

    public void adicionaPacienteNaFila(Paciente paciente) {
        pacientesAguardandoVacina.add(paciente);
        Collections.sort(pacientesAguardandoVacina);
    }

    public void vacinaPaciente() {
        if (!pacientesAguardandoVacina.isEmpty()) {
            Paciente paciente = pacientesAguardandoVacina.remove(0);
            pacientesVacinados.add(paciente);
        }
    }
}
