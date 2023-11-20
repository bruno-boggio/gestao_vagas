package br.com.bruno.Vagas.modules.company.repositories;

import java.util.Optional;
import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;


import br.com.bruno.Vagas.modules.company.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID>{
    
     Optional <CompanyEntity> findBfindByUsernameOrEmail(String username, String email);
    
}
