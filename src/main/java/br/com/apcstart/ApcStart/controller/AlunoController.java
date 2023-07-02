package br.com.apcstart.ApcStart.controller;

import br.com.apcstart.ApcStart.model.Aluno;
import br.com.apcstart.ApcStart.repository.AlunoRepository;
import br.com.apcstart.ApcStart.service.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
  @Autowired
  private AlunoRepository alunoRepository;

  @Autowired
  private AlunoService alunoService;

  // CRUD - CREATE , READ , UPDATE , DELETE

  // CREATE
  @PostMapping
  public String cadastrarAluno(@RequestBody Aluno aluno) {
    alunoRepository.save(aluno);
    return "Aluno cadastrado com sucesso!";
  }

  // READ
  @GetMapping
  public List<Aluno> mostrarAlunos() {
    return alunoRepository.findAll();
  }

  @GetMapping("/chamar/{email}")
  public Aluno mostrarPorEmail(@PathVariable String email) {
    return alunoService.findByEmail(email);
  }

  // UPDATE
  @PutMapping
  public String atualizarAluno(@RequestBody Aluno aluno) {
    alunoRepository.save(aluno);
    return "Os dados do pedagogo foram atualizados!";
  }

  // DELETE
  @DeleteMapping("/{id}")
  public String deletarAluno(@PathVariable("id") int id) {
    alunoRepository.deleteById(id);
    return "Aluno descadastrado!";
  }
}