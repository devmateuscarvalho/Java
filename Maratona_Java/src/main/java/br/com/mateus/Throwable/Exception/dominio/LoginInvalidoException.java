package br.com.mateus.Throwable.Exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
    }

    public LoginInvalidoException(String message) {
        super(message);
    }

}
