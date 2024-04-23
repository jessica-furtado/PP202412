package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.estruturasdedados.ListaDeTelefonesNaoOrdenados;

import java.time.LocalDate;
import java.util.UUID;

public class Dependente extends Pessoa {

    private UUID id;
    private String parentesco;

    public Dependente(UUID id, String parentesco) {
        this.id = id;
        this.parentesco = parentesco;
    }

    public Dependente(String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefonesNaoOrdenados telsContato, UUID id, String parentesco) {
        super(nome, dataNascimento, endereco, telsContato);
        this.id = id;
        this.parentesco = parentesco;
    }

    @Override
    public void cadastrar() {
     //criar o cadastrar com Scanner
    }
    public void gerarid() {
        this.id = UUID.randomUUID();
    }
}
