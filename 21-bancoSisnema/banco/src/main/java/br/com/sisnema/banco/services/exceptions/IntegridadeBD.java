package br.com.sisnema.banco.services.exceptions;

public class IntegridadeBD extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public IntegridadeBD(String msg) {
        super(msg);
    }
}
