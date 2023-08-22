package br.csi.avaliadordeprojetos.service;

import br.csi.avaliadordeprojetos.model.Aluno;
import br.csi.avaliadordeprojetos.model.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;
    public AlunoService(AlunoRepository repository){

        this.repository = repository;
    }


    public void Cadastrar(Aluno aluno){
        this.repository.save(aluno);
    }

    public List<Aluno> getAll(){
        return this.repository.findAll();
    }


    public Aluno getById(long id){
        return this.repository.getById(id);
    }

    public void deletar(long id){
        this.repository.deleteById(id);
    }


}
