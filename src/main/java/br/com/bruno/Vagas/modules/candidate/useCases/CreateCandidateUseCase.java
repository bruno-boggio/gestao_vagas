package br.com.bruno.Vagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bruno.Vagas.exceptions.UserFoundException;
import br.com.bruno.Vagas.modules.candidate.CandidateEntity;
import br.com.bruno.Vagas.modules.candidate.CandidateRepository;

@Service 
public class CreateCandidateUseCase { // caso de uso - cada funcionalidade é um caso de uso
    
    @Autowired // responsável por instanciar - injeção de dependencias
    private CandidateRepository candidateRepository;
    public CandidateEntity execute (CandidateEntity candidateEntity){

     this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent((user)-> {
            throw new UserFoundException();
        });
        

      return  this.candidateRepository.save(candidateEntity);       
    }

}
