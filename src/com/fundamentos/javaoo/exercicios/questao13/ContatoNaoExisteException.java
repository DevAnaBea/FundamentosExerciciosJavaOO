package com.fundamentos.javaoo.exercicios.questao13;

public class ContatoNaoExisteException extends Throwable {

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " não existe na agenda!";
    }
}
