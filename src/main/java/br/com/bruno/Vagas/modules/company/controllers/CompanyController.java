package br.com.bruno.Vagas.modules.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bruno.Vagas.exceptions.UserFoundException;
import br.com.bruno.Vagas.modules.company.entities.CompanyEntity;
import br.com.bruno.Vagas.modules.company.useCases.CreateCompanyUseCases;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CreateCompanyUseCases createCompanyUseCases;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CompanyEntity companyEntity){
        try {
            var result = this.createCompanyUseCases.execute(companyEntity);
            return ResponseEntity.ok().body(result);
        } catch (UserFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }   
    }
    
}
