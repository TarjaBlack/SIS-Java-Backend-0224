package org.example;

import org.example.entities.Banco;

public class Main {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco();
        banco.gerarBoleto(60, 1000.0);

    }

}