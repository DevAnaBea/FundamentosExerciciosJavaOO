package com.fundamentos.javaoo.exercicios.questao13;

public class AgendaCheiaExeption extends Throwable {

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
