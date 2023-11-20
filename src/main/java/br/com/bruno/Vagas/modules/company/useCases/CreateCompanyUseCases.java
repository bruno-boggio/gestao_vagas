package br.com.bruno.Vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bruno.Vagas.exceptions.UserFoundException;
import br.com.bruno.Vagas.modules.company.entities.CompanyEntity;
import br.com.bruno.Vagas.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCases {
    
    @Autowired
    CompanyRepository companyRepository;
    public CompanyEntity execute(CompanyEntity companyEntity){

        this.companyRepository.findBfindByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
        .ifPresent((user) -> {
            throw new UserFoundException();
        });


        return this.companyRepository.save(companyEntity);

    }

}
