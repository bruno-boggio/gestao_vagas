package br.com.bruno.Vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.bruno.Vagas.exceptions.UserFoundException;
import br.com.bruno.Vagas.modules.company.entities.CompanyEntity;
import br.com.bruno.Vagas.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCases {
    
    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public CompanyEntity execute(CompanyEntity companyEntity){

        this.companyRepository.findBfindByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
        .ifPresent((user) -> {
            throw new UserFoundException();
        });


        var password = passwordEncoder.encode(companyEntity.getPassword());
        companyEntity.setPassword(password);

        return this.companyRepository.save(companyEntity);

    }

}
