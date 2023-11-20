package br.com.bruno.Vagas.exceptions;

public class UserFoundException extends RuntimeException{
    public UserFoundException(){
        super("Usuário ja existe");
    }
}
