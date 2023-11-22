package br.com.bruno.Vagas.modules.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // construtor que aceita todos os campos da classe como parâmetros.
public class AuthCompanyDto {
    
    private String password;
    private String username;
}
