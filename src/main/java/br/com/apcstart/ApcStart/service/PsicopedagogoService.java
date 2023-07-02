package br.com.apcstart.ApcStart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apcstart.ApcStart.model.Psicopedagogo;
import br.com.apcstart.ApcStart.repository.PsicopedagogoRepository;

@Service
public class PsicopedagogoService {

  @Autowired
  private PsicopedagogoRepository psicopedagogoRepository;

  public Psicopedagogo findByEmail(String email) {
    for(Psicopedagogo psicopedagogo: psicopedagogoRepository.findAll()) {
      if(psicopedagogo.getEmail().equals(email)) {
        return psicopedagogo;
      }
    }
    return null;
  }

  public String findByLogin(String email, String senha) {
    for(Psicopedagogo psicopedagogo: psicopedagogoRepository.findAll()) {
      if(psicopedagogo.getEmail().equals(email)) {
        return conferirSenha(psicopedagogo, senha);
      }
    }
    return "Esse e-mail não foi cadastrado";
  }

  public String conferirSenha(Psicopedagogo psicopedagogo, String senha) {
    if(psicopedagogo.getSenha().equals(senha)) {
      return "Login realizado com sucesso!";
    } else {
      return "Senha incorreta!";
    }
  }
}
