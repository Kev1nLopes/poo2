package br.csi.avaliadordeprojetos.controller;


import br.csi.avaliadordeprojetos.model.Aluno;
import br.csi.avaliadordeprojetos.service.AlunoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {


    private final AlunoService service;

    public AlunoController(AlunoService service){
        this.service = service;
    }

    @GetMapping
    public String teste(){
        return "bom dia kevin";
    }


    @PostMapping("/print-json")

    public void printJson(@RequestBody String json){
        System.out.println(json);
    }


    @PostMapping()
    public void cadastrar(@RequestBody Aluno aluno){
        this.service.Cadastrar(aluno);
    }


}
