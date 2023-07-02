package br.com.apcstart.ApcStart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apcstart.ApcStart.model.Aluno;
import br.com.apcstart.ApcStart.repository.AlunoRepository;

@Service
public class AlunoService {

  @Autowired
  private AlunoRepository alunoRepository;

  public Aluno findByEmail(String email) {
    for(Aluno aluno: alunoRepository.findAll()) {
      if(aluno.getEmail().equals(email)) {
        return aluno;
      }
    }
    return null;
  }

  public String findByLogin(String email, String senha) {
    for(Aluno aluno: alunoRepository.findAll()) {
      if(aluno.getEmail().equals(email)) {
        return conferirSenha(aluno, senha);
      }
    }
    return "Esse e-mail não foi cadastrado";
  }

  public String conferirSenha(Aluno aluno, String senha) {
    if(aluno.getSenha().equals(senha)) {
      return "Login realizado com sucesso!";
    } else {
      return "Senha incorreta!";
    }
  }
}
