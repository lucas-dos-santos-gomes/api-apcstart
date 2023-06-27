package br.com.apcstart.ApcStart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.apcstart.ApcStart.repository.AlunoRepository;


@RestController
@RequestMapping("/aluno")
public class AlunoController {
  @Autowired
  private AlunoRepository alunoRepository;
}