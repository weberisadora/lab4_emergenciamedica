package negocio;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " | Idade: " + idade;
    }

    @Override
    public int compareTo(Paciente toCompare) {
        if (this.idade < toCompare.getIdade()) {
            return 1;
        } else if (this.idade > toCompare.getIdade()) {
            return -1;
        }

        return 0;
    }
}
